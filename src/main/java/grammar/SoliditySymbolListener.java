package grammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class SoliditySymbolListener extends SolidityBaseListener {
    private final SymbolTable symbolTable = new SymbolTable();

    public SymbolTable buildSymbolTable(String input) {
        // Parsing
        SolidityLexer lexer = new SolidityLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolidityParser parser = new SolidityParser(tokens);
        ParseTree tree = parser.sourceUnit();

        // Crea lo scope radice prima di camminare nell'albero
        symbolTable.enterScope();

        // Cammina nell'albero
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, tree);

        // Esce dallo scope radice
        symbolTable.exitScope();
        System.out.println(tree.toStringTree(parser));

        symbolTable.persistScopes(); // Salva gli scope ancora attivi

        return symbolTable;
    }


    // Gestione del contratto
    @Override
    public void enterDefinizioneContratto(SolidityParser.DefinizioneContrattoContext ctx) {
        String contractName = ctx.identificatore().getText();
        if (!symbolTable.addSymbol(contractName, "contract")) {
            System.err.println("Errore: Contratto già definito - " + contractName);
        }
        symbolTable.enterScope(); // Nuovo scope per il contratto
    }

    @Override
    public void exitDefinizioneContratto(SolidityParser.DefinizioneContrattoContext ctx) {
        symbolTable.exitScope(); // Esce dallo scope del contratto
    }

    // Gestione delle funzioni
    @Override
    public void enterDefinizioneFunzione(SolidityParser.DefinizioneFunzioneContext ctx) {
        String functionName = ctx.identificatore() != null ? ctx.identificatore().getText() : "anonymous_function";
        if (!symbolTable.addSymbol(functionName, "function")) {
            System.err.println("Errore: Funzione già definita - " + functionName);
        }
        symbolTable.enterFunctionScope(functionName);

        // Gestisce i parametri della funzione
        if (ctx.listaParametri() != null) {
            for (SolidityParser.ParametroContext param : ctx.listaParametri().parametro()) {
                String paramName = param.identificatore().getText();
                String paramType = param.nomeTipo().getText();
                if (!symbolTable.addSymbol(paramName, paramType)) {
                    System.err.println("Errore: Parametro duplicato - " + paramName);
                }
            }
        }
    }

    @Override
    public void exitDefinizioneFunzione(SolidityParser.DefinizioneFunzioneContext ctx) {
        symbolTable.exitScope(); // Esce dallo scope della funzione
    }

    // Gestione delle dichiarazioni di variabili
    @Override
    public void enterAssegnazioneVariabile(SolidityParser.AssegnazioneVariabileContext ctx) {
        System.out.println("DEBUG: Entrato in enterAssegnazioneVariabile per " + ctx.identificatore().getText());

        String varName = ctx.identificatore().getText();
        String varType = ctx.nomeTipo().getText();

        if (!symbolTable.addSymbol(varName, varType)) {
            System.err.println("Errore: Variabile già dichiarata - " + varName);
        } else {
            System.out.println("Aggiunta variabile: " + varName + " di tipo " + varType);
        }
    }



    // Gestione delle espressioni che usano variabili
    @Override
    public void enterExpression(SolidityParser.ExpressionContext ctx) {
        if (ctx.primaryExpression() != null && ctx.primaryExpression().identificatore() != null) {
            String varName = ctx.primaryExpression().identificatore().getText();
            if (symbolTable.lookup(varName) == null) {
                System.err.println("Errore: Variabile non dichiarata - " + varName);
            }
        }
    }
    @Override
    public void enterBlock(SolidityParser.BlockContext ctx) {
        if (ctx.statement() != null && !ctx.statement().isEmpty()) {
            for (SolidityParser.StatementContext statement : ctx.statement()) {
                if (statement.ifStatement() != null) {
                    symbolTable.enterBlockScope("if");
                }
                else if (statement.whileStatement() != null) {
                    symbolTable.enterBlockScope("while");
                }
                else if (statement.forStatement() != null) {
                    symbolTable.enterBlockScope("for");
                }
                else if (statement.simpleStatement() != null) {
                    symbolTable.enterBlockScope("simpleStatement");
                }
                else if (statement.doWhileStatement() != null){
                    symbolTable.enterBlockScope("dowhileStatement");
                }
                else if(statement.tryCatchStatement()!=null){
                    symbolTable.enterBlockScope("trycatchStatement");
                }
                else if(statement.emitStatement()!=null){
                    symbolTable.enterBlockScope("emitStatement");
                }
                else if(statement.assemblyBlock() != null){
                    symbolTable.enterBlockScope("assemblyStatement");
                }
            }
        } else {
            System.out.println("[DEBUG] Nessun statement trovato nel blocco.");
        }
    }



    @Override
    public void exitBlock(SolidityParser.BlockContext ctx) {
        symbolTable.exitScope();
        System.out.println("Uscito dallo scope (blocco)");
    }

    @Override
    public void enterDichiarazioneVariabileStatement(SolidityParser.DichiarazioneVariabileStatementContext ctx) {
        // Gestisce le dichiarazioni di variabili locali
        SolidityParser.DichiarazioneVariabileContext varCtx = ctx.dichiarazioneVariabile();
        if (varCtx != null) {
            String varName = varCtx.identificatore().getText();
            String varType = varCtx.nomeTipo().getText();

            // Aggiunge la variabile nello scope corrente
            if (!symbolTable.addSymbol(varName, varType)) {
                System.err.println("Errore: Variabile già dichiarata - " + varName);
            } else {
                System.out.println("Aggiunta variabile locale: " + varName + " di tipo " + varType);
            }
        }
    }


    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
