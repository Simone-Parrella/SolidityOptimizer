package grammar;

import grammar.ASTNode;
import grammar.SolidityParser;
import grammar.SolidityVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.io.*;



public class ASTBuilder extends SolidityBaseVisitor<ASTNode> {

    @Override
    public ASTNode visit(ParseTree tree) {
        if (!(tree instanceof RuleContext)) {
            return null;
        }

        RuleContext ctx = (RuleContext) tree;
        String ruleName = SolidityParser.ruleNames[ctx.getRuleIndex()];
        String text = tree.getText().trim();

        if (shouldIgnoreNode(ruleName, text)) {
            return visitChildren(ctx);
        }

        if (shouldSuppressNode(ruleName)) {
            return attachChildrenToParent((ParserRuleContext) ctx);
        }

        return handleNode((ParserRuleContext) ctx, ruleName);
    }

    private ASTNode handleNode(ParserRuleContext ctx, String ruleName) {
        switch (ruleName) {
            case "definizioneContratto":
                return handleDefinizioneContrattoNode(ctx);
            case "definizioneFunzione":
                return handleDefinizioneFunzioneNode(ctx);
            case "ifStatement":
                return handleIfStatementNode(ctx);
            case "forStatement":
                return handleForStatementNode(ctx);
            case "eventDefinition":
                return handleEventDefinitionNode(ctx);
            case "expression":
                return handleExpressionNode(ctx);
            case "assegnazioneVariabile":
                return handleAssegnazioneNode(ctx);
            case "dichiarazioneVariabileStatement":
                return handleDichiarazioneVariabileStatement(ctx);
            default:
                return handleGenericNode(ctx, ruleName);
        }
    }

    private ASTNode handleDichiarazioneVariabileStatement(ParserRuleContext ctx) {
        HashMap<String, Object> value = new HashMap<>();
        value.put("line", ctx.getStart().getLine());
        value.put("value", "declaration");

        List<ASTNode> children = new ArrayList<>(visit(ctx.getChild(0)).getChildren());

        return new ASTNode("Dichiarazione", value, children);
    }




    private boolean shouldSuppressNode(String ruleName) {
        Set<String> suppressibleRules = Set.of(
                "parteDiContratto", "block", "sourceUnit",
                "puntoVirgola", "pragma",
                 "simpleStatement", "incremento",  "tupleExpression", "statement"
                , "primaryExpression", "nomeTipo", "expressionStatement",
                "valorePragma", "vincoloVersione", "operatoriRelazionali", "operatoriLogici",
                "operatoriAritmetici", "operatoriAssegnamento", "operatoriBitwise", "operatoriIncrementoDecremento",
                "operatoriSomma", "operatoriMoltiplicazione", "operatoriShift", "operatoriAssegnazione"
                , "merged"
        );
        return suppressibleRules.contains(ruleName);
    }

    private ASTNode attachChildrenToParent(ParserRuleContext ctx) {
        List<ASTNode> children = visitChildren(ctx);
        return children.size() == 1 ? children.get(0) : new ASTNode("merged", Map.of(), children);
    }

    private ASTNode handleGenericNode(ParserRuleContext ctx, String ruleName) {
        Map<String, Object> value = extractGenericNodeValue(ctx, ruleName);
        List<ASTNode> children = visitChildren(ctx);
        return new ASTNode(ruleName, value, children);
    }

    private Map<String, Object> extractGenericNodeValue(ParserRuleContext ctx, String ruleName) {
        String valore = switch (ruleName) {
            case "statement" -> {
                String statementType = getStatementType(ctx);
                if ("simpleStatement".equals(statementType) || "block".equals(statementType)) {
                    yield ctx.getText();
                } else {
                    yield statementType;
                }
            }
            case "definizioneFunzione" -> "function";
            default -> ctx.getText();
        };
        return Map.of("value", valore, "line", ctx.getStart().getLine());
    }


    private ASTNode handleAssegnazioneNode(ParserRuleContext ctx) {
        Map<String, Object> value = new HashMap<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i).getText().equals("=")) {
                value.put("left", ctx.getChild(i - 1).getText());
                value.put("right", ctx.getChild(i + 1).getText());
            }
        }
        value.put("value", "=");
        value.put("line", ctx.getStart().getLine());

        return new ASTNode("assegnazioneVariabile", value, visitChildren(ctx));
    }

    private ASTNode handleExpressionNode(ParserRuleContext ctx) {
        Map<String, String> operators = createOperatorMap();
        String valore = findOperator(ctx, operators);

        if (valore.isEmpty()) {
            return attachChildrenToParent(ctx);
        }

        Map<String, Object> value = new HashMap<>();
        value.put("value", valore);
        value.put("line", ctx.getStart().getLine());
        return new ASTNode("expression", value, visitChildren(ctx));
    }

    private Map<String, String> createOperatorMap() {
        Map<String, String> operators = new HashMap<>();
        operators.put("=", "=");
        operators.put("+", "+");
        operators.put("-", "-");
        operators.put("*", "*");
        operators.put("/", "/");
        operators.put(">", ">");
        operators.put("<", "<");
        operators.put(">=", ">=");
        operators.put("<=", "<=");
        operators.put("==", "==");
        operators.put("!=", "!=");
        operators.put("&&", "&&");
        operators.put("||", "||");
        operators.put("!", "!");
        operators.put("++", "++");
        operators.put("--", "--");
        operators.put("|=", "|=");
        operators.put("^=", "^=");
        operators.put("&=", "&=");
        operators.put("<<=", "<<=");
        operators.put(">>=", ">>=");
        operators.put("+=", "+=");
        operators.put("-=", "-=");
        operators.put("*=", "*=");
        operators.put("/=", "/=");
        operators.put("%=", "%=");
        return operators;
    }

    private String findOperator(ParserRuleContext ctx, Map<String, String> operators) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String text = ctx.getChild(i).getText();
            if (operators.containsKey(text)) {
                return operators.get(text);
            }
        }
        return "";
    }


    private ASTNode handleDefinizioneContrattoNode(ParserRuleContext ctx) {
        Map<String, Object> value = Map.of(
                "name", ctx.getChild(1).getText(),
                "line", ctx.getStart().getLine(),
                "value", "contract"
        );
        return new ASTNode("definizioneContratto", value, visitChildren(ctx));
    }

    private ASTNode handleDefinizioneFunzioneNode(ParserRuleContext ctx) {
        Map<String, Object> value = Map.of(
                "name", ctx.getChild(1).getText(),
                "line", ctx.getStart().getLine(),
                "value", "function"
        );
        return new ASTNode("definizioneFunzione", value, visitChildren(ctx));
    }

    private ASTNode handleIfStatementNode(ParserRuleContext ctx) {
        Map<String, Object> value = Map.of(
                "condition", ctx.getChild(2).getText(),
                "line", ctx.getStart().getLine(),
                "value", "if"
        );
        return new ASTNode("ifStatement", value, visitChildren(ctx));
    }

    private ASTNode handleForStatementNode(ParserRuleContext ctx) {
        Map<String, Object> value = Map.of(
                "initializer", ctx.getChild(2).getText(),
                "condition", ctx.getChild(3).getText(),
                "increment", ctx.getChild(4).getText(),
                "line", ctx.getStart().getLine(),
                "value", "for"
        );
        return new ASTNode("forStatement", value, visitChildren(ctx));
    }

    private ASTNode handleEventDefinitionNode(ParserRuleContext ctx) {
        Map<String, Object> value = Map.of(
                "name", ctx.getChild(1).getText(),
                "line", ctx.getStart().getLine()
        );
        return new ASTNode("eventDefinition", value, visitChildren(ctx));
    }

    private boolean shouldIgnoreNode(String ruleName, String text) {
        return Set.of("EOF", ";", "[", "]", "{", "}", "(", ")", ",").contains(text) || text.isEmpty();
    }

    private List<ASTNode> visitChildren(ParserRuleContext ctx) {
        List<ASTNode> children = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ASTNode child = visit(ctx.getChild(i));
            if (child != null) {
                children.add(child);
            }
        }
        return children;
    }

    private String getStatementType(ParserRuleContext ctx) {
        if (ctx.getChildCount() == 0) return "unknown";
        ParseTree firstChild = ctx.getChild(0);
        return firstChild instanceof ParserRuleContext ? SolidityParser.ruleNames[((ParserRuleContext) firstChild).getRuleIndex()] : "unknown";
    }



public static ASTNode cleanAST(ASTNode root) {
        if (root == null) return null;
        List<ASTNode> cleanedChildren = new ArrayList<>();
        for (ASTNode child : root.getChildren()) {
            ASTNode cleanedChild = cleanAST(child);
            if (cleanedChild != null && isRelevantChild(root, cleanedChild)) {
                cleanedChildren.add(cleanedChild);
            } else if (cleanedChild != null) {
                cleanedChildren.addAll(cleanedChild.getChildren());
            }
        }
        root.setChildren(cleanedChildren);
        return root;
    }

    private static boolean isRelevantChild(ASTNode root, ASTNode child) {
        return !child.getType().equals("merged");
    }

    public static ASTNode buildAST(String inputCode) throws Exception {
        CharStream input = CharStreams.fromString(inputCode);
        SolidityLexer lexer = new SolidityLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);
        ParseTree tree = parser.sourceUnit();
        ASTBuilder builder = new ASTBuilder();
        return cleanAST(builder.visit(tree));
    }


    public static void main(String[] args) throws Exception {
        String inputCode = "                   pragma solidity >= 0.8.7;\n" +
                "                   \n" +
                "                   contract ArrayLength {\n" +
                "                   \n" +
                "                       uint[] public myArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];\n" +
                "                       uint[] public anotherArray = [10, 20, 30, 40, 50];\n" +
                "                   \n" +
                "                       // Caching inefficiente di myArray.length all'interno del ciclo\n" +
                "                       function badCaching() view public {\n" +
                "                           for (uint256 i; i < myArray.length; i++) {\n" +
                "                               i++;\n" +
                "                           }\n" +
                "                       }\n" +
                "                   \n" +
                "                       // Caching inefficiente di anotherArray.length all'interno del ciclo\n" +
                "                       function badCachingTwo() view public {\n" +
                "                        uint j ;\n" +
                "                           for (uint256 i; i < anotherArray.length; i++) {\n" +
                "                              j = 10 + 20;\n" +
                "                           }\n" +
                "                       }\n" +
                "                   \n" +
                "                       // Ottimizzazione per memorizzare la lunghezza dell'array in una variabile locale\n" +
                "                       function goodCaching() view public {\n" +
                "                           uint256 arrayLength = myArray.length;\n" +
                "                           for (uint256 i; i < arrayLength; i++) {\n" +
                "                               i++;\n" +
                "                           }\n" +
                "                       }\n" +
                "                   }\n" +
                "                   ";
        ASTNode ast = buildAST(inputCode);
        ast.printPretty("");
        ast.generateGraphvizFile("ast.dot");
    }
}
