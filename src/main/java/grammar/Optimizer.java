package grammar;

import com.opencsv.CSVWriter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class Optimizer {
    private String csvFilePath;

    public Optimizer(String csvFilePath) throws IOException {
        this.csvFilePath = csvFilePath;
         // Intestazioni CSV
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
            // crea il documento csv
            writer.writeNext(new String[] { "Linea", "Suggerimento", "Gas", "Tipo" });
            // Intestazioni
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void optimize(ASTNode root) {
        optimizeDivisionByPowerOfTwo(root);
        optimizeArrayLengthCaching(root);
        optimizeAssignmentOperators(root);
        optimizeCalldataUsage(root);
        findComparisonOptimization(root);
        findCustomErrorOptimization(root);
        findDataTypeOptimization(root);
        optimizeAssignmentStatements(root);
        suggestLoopOptimization(root);
        suggestNestedIfOptimization(root);
        suggestStateVariableOrderOptimization(root);
        suggestPublicExternalOptimization(root);
        suggestRedundantCheckOptimization(root);
    }

//---------------Ottimizzazioni
    // Ottimizzazione: Divisione per potenze di due
private void optimizeDivisionByPowerOfTwo(ASTNode root) {
    traverseAndOptimize(root, this::optimizeDivisionNode);
}

    private void optimizeDivisionNode(ASTNode node) {
        int gas = 90;
        int type = 2;

        if ( "/".equals(node.getValue().getOrDefault("value", ""))) {
            try {
                ASTNode rightOperand = node.getChildren().get(1);
                String operand2 = rightOperand.getValue().getOrDefault("value", "").toString().trim();
                int divisor = Integer.parseInt(operand2);

                if (isPowerOfTwo(divisor)) {
                    int line = getLineNumber(node);
                    String suggestion = "Sostituire la divisione per " + divisor + " con uno spostamento a destra.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }




    // Ottimizzazione: Caching della lunghezza degli array

    private void optimizeArrayLengthCaching(ASTNode root) {
        traverseAndOptimize(root, this::optimizeArrayLengthNode);
    }

    private void optimizeArrayLengthNode(ASTNode node) {
        int gas = 510;
        int type = 3;

        String expression = node.getValue().getOrDefault("value", "").toString();
        if (expression.matches(".*\\.length")) {
            int line = getLineNumber(node);
            String suggestion = "Memorizzare la lunghezza dell'array per evitare chiamate ripetute.";
            writeOptimizationToCSV(line, suggestion, gas, type);
        }
    }

    private void optimizeAssignmentOperators(ASTNode root) {
        int gas = 50;
        int type = 1;

        traverseAndOptimize(root, node -> {
            String expression = node.getValue().getOrDefault("value", "").toString().trim();

            Map<String, String> operatorMappings = Map.of(
                    "+=", "+",
                    "-=", "-",
                    "*=", "*",
                    "/=", "/",
                    "%=", "%"
            );

            for (Map.Entry<String, String> entry : operatorMappings.entrySet()) {
                String compoundOperator = entry.getKey();

                if (expression.contains(compoundOperator)) {
                    String optimizationSuggestion = generateSuggestion(expression, compoundOperator);

                    if (optimizationSuggestion != null && !optimizationSuggestion.isEmpty()) {
                        int line = getLineNumber(node);
                        writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                    }
                    break;
                }
            }
        });
    }


    private void optimizeCalldataUsage(ASTNode root) {
        int gas = 20;
        int type = 4;

        traverseAndOptimize(root, node -> {
            if (node.getValue().containsKey("value")) {
                String parametroDichiarazione = node.getValue().get("value").toString();
                

                // Esegue il pattern matching per verificare "memory" e "[]"
                if (parametroDichiarazione.contains("[]")){
                    // controlla nel sottoalbero destro se c'è memory
                    for(ASTNode astNode: node.getChildren()){
                        if(astNode.getType().equals("tipoStorage")){
                            if(astNode.getValue().get("value").equals("memory")){
                                int line = (int) node.getValue().get("line");
                                String optimizationSuggestion = "Considerare di sostituire `memory` con `calldata` per l'array in ingresso se non è modificato";
                                writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                            }
                        }
                    }
                }
            }
        });
    }



    private void findComparisonOptimization(ASTNode root) {
        int gas = 10;
        int type = 5;

        traverseAndOptimize(root, node -> {
            String expression = node.getValue().getOrDefault("value", "").toString();

            // Elenco degli operatori di confronto
            List<String> comparisonOperators = List.of("==", "!=", "<=", ">=", "<", ">");

            // Controlla se l'espressione contiene uno degli operatori
            for (String operator : comparisonOperators) {
                if (!expression.isEmpty() && expression.contains(operator) && node.getChildren().size() == 2) {
                    int line = getLineNumber(node);
                    String optimizationSuggestion = "Considerare nella stringa: `" + expression + "` di sostituire l'operatore di confronto `" + operator + "` con `<=` o `>=` per ridurre i costi del gas.";
                    writeOptimizationToCSV(line, optimizationSuggestion, gas, type);
                    break; // Interrompe la ricerca al primo match
                }
            }
        });
    }


    private void findCustomErrorOptimization(ASTNode root) {
        int gas = 30;
        int type = 6;

        traverseAndOptimize(root, node -> {
            String value = node.getValue().getOrDefault("value", "").toString();

            // Verifica se il nodo rappresenta una chiamata a "require"
            if (value.equals("require") && node.getChildren().size() == 2) {
                ASTNode errorMessageNode = node.getChildren().get(1);
                String errorMessage = errorMessageNode.getValue().getOrDefault("value", "").toString();

                if (errorMessage.startsWith("\"")) {
                    int line = getLineNumber(node);
                    String suggestion = "Considerare di sostituire la stringa di errore in `require` con un errore personalizzato per ottimizzare i costi del gas.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        });
    }

    private void findDataTypeOptimization(ASTNode root) {
        int gas = 10520;
        int type = 7;

        traverseAndOptimize(root, node -> {
            String declarationType = node.getValue().getOrDefault("value", "").toString();

            // Controlla i tipi di dati e fornisce suggerimenti appropriati
            if (declarationType.equals("uint8")) {
                int line = getLineNumber(node);
                String suggestion = "Considerare di sostituire `uint8` con `uint256` per evitare problemi di overflow se i valori possono eccedere il limite di 255.";
                writeOptimizationToCSV(line, suggestion, gas, type);
            } else if (declarationType.equals("uint256")) {
                int line = getLineNumber(node);
                String suggestion = "Considerare di sostituire `uint256` con un tipo più piccolo, come `uint8` o `uint16`, per ridurre i costi del gas se i valori rimangono bassi.";
                writeOptimizationToCSV(line, suggestion, gas, type);
            }
        });
    }

    private void optimizeAssignmentStatements(ASTNode root) {
        int gas = 9830;
        int type = 8;

        traverseAndOptimize(root, node -> {
            String value = node.getValue().getOrDefault("value", "").toString();

            if (value.equals("=") && node.getChildren().size() == 3) {
                String left = node.getChildren().get(1).getValue().getOrDefault("value", "").toString();
                ASTNode rightNode = node.getChildren().get(2);

                String right = extractExpression(rightNode);

                if (right == null) return;

                int line = getLineNumber(node);
                String suggestion = getOptimizationSuggestion(left, right);

                if (suggestion != null) {
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        });
    }

    private String extractExpression(ASTNode node) {
        String operator = node.getValue().getOrDefault("value", "").toString();

        // Se il nodo non è un operatore valido, restituisci il valore
        if (!List.of("+", "-", "*", "/", "%").contains(operator) || node.getChildren().size() != 2) {
            return node.getValue().getOrDefault("value", "").toString();
        }

        // Analizza ricorsivamente i figli
        String left = extractExpression(node.getChildren().get(0));
        String right = extractExpression(node.getChildren().get(1));

        return left + operator + right;
    }

    private String getOptimizationSuggestion(String left, String right) {
        if (left.equals(right)) {
            return "Rimuovere l'assegnazione inutile `" + left + " = " + right + "`.";
        }
        if (right.matches(left + "\\s*\\+\\s*0") || right.matches(left + "\\s*-\\s*0") ||
                right.matches(left + "\\s*\\*\\s*1") || right.matches(left + "\\s*/\\s*1") ||
                right.matches(left + "\\s*%\\s*1")) {
            return "Semplificare l'assegnazione `" + left + " = " + right + "` in `" + left + "`.";
        }
        return null;
    }

    private void suggestLoopOptimization(ASTNode ast) {
        int gas = 750;
        int type = 9;

        traverseAndOptimize(ast, node -> {
            String value = node.getValue().getOrDefault("value", "").toString();

            if (value.equals("for")) {
                ASTNode incrementNode = node.getChild("incremento");

                if (incrementNode != null && incrementNode.getValue().get("value").equals("++")) {
                    String varName = incrementNode.getChild(String.valueOf(0)).getValue().get("value").toString();
                    int line = Integer.parseInt(node.getValue().getOrDefault("line", "0").toString());

                    String suggestion = "Considerare l'uso di `unchecked` per l'incremento di `" + varName + "++` in un ciclo `for` per ridurre i costi del gas.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        });
    }



    private void suggestNestedIfOptimization(ASTNode ast) {
        int gas = 60;
        int type = 10;

        traverseAndOptimize(ast, node -> {
            String value = node.getValue().getOrDefault("value", "").toString();

            // Verifica se il nodo è un'istruzione `if` con una condizione complessa
            if (value.equals("if")) {
                ASTNode conditionNode = node.getChild(String.valueOf(0));  // Nodo della condizione

                if (conditionNode != null && "&&".equals(conditionNode.getValue().get("value"))) {
                    int line = Integer.parseInt(node.getValue().getOrDefault("line", "0").toString());
                    String suggestion = "Considera di sostituire la condizione complessa nel `if` con un set di `if` annidati per migliorare la leggibilità e il consumo di gas.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        });
    }

    private void suggestPublicExternalOptimization(ASTNode ast) {
        int gas = 55;
        int type = 12;

        traverseAndOptimize(ast, node -> {
            String value = node.getValue().getOrDefault("value", "").toString();

            if (value.equals("function")) {
                ASTNode functionNameNode = node.getChild(String.valueOf(0));  // Nome della funzione
                ASTNode visibilityNode = node.getChild(String.valueOf(2));    // Visibilità della funzione

                if (functionNameNode != null && visibilityNode != null) {
                    String functionName = functionNameNode.getValue().get("value").toString();
                    String visibility = visibilityNode.getValue().get("value").toString();

                    // Verifica se la funzione è `public` e non viene mai chiamata internamente
                    if ("public".equals(visibility) && !isFunctionCalledInternally(ast, functionName)) {
                        int line = Integer.parseInt(node.getValue().getOrDefault("line", "0").toString());
                        String suggestion = "La funzione è dichiarata `public` ma potrebbe essere dichiarata `external` per ridurre i costi di gas.";
                        writeOptimizationToCSV(line, suggestion, gas, type);
                    }
                }
            }
        });
    }


    private boolean isFunctionCalledInternally(ASTNode ast, String functionName) {
        final boolean[] isCalledInternally = {false};

        traverseAndOptimize(ast, node -> {
            // Ottieni il valore del nodo
            String value = node.getValue().getOrDefault("value", "").toString();

            // Verifica se il nodo è una chiamata di funzione
            if (value.contains("chiamataFunzione")) {
                ASTNode calledFunction = node.getChild("identificatore");
                if (calledFunction != null && functionName.equals(calledFunction.getValue().get("value").toString())) {
                    isCalledInternally[0] = true;
                }
            }
        });

        return isCalledInternally[0];
    }






    private void suggestStateVariableOrderOptimization(ASTNode ast) {
        int gas = 22230;
        int type = 11;

        traverseAndOptimize(ast, node -> {
            String value = node.getValue().getOrDefault("value", "").toString();

            // Verifica se il nodo è una definizione di contratto
            if (value.equals("contract")) {
                List<String> variableTypes = new ArrayList<>();
                boolean needsOptimization = false;

                // Analizza i figli per estrarre i tipi delle variabili
                for (ASTNode part : node.getChildren()) {
                    if ("=".equals(part.getValue().get("value"))) {
                        ASTNode typeNode = part.getChild(String.valueOf(0));  // Tipo della variabile
                        if (typeNode != null) {
                            String varType = typeNode.getValue().getOrDefault("value", "").toString();
                            variableTypes.add(varType);
                        }
                    }
                }

                // Verifica l'ordine delle variabili
                for (int i = 0; i < variableTypes.size() - 1; i++) {
                    String currentType = variableTypes.get(i);
                    String nextType = variableTypes.get(i + 1);

                    // Controlla se l'ordine è inefficiente
                    if (isInefficientOrder(currentType, nextType)) {
                        needsOptimization = true;
                        break;
                    }
                }

                // Se è necessaria un'ottimizzazione, scrivi il suggerimento
                if (needsOptimization) {
                    int line = Integer.parseInt(node.getValue().getOrDefault("line", "0").toString());
                    String suggestion = "Considera di ordinare le variabili di stato per ridurre i costi di storage, raggruppando tipi più piccoli consecutivamente.";
                    writeOptimizationToCSV(line, suggestion, gas, type);
                }
            }
        });
    }

    private boolean isInefficientOrder(String currentType, String nextType) {
        // Controlla combinazioni inefficienti
        return (currentType.equals("uint256") && (nextType.equals("uint8") || nextType.equals("uint16"))) ||
                (currentType.equals("uint128") && nextType.equals("uint8"));
    }


    private void suggestRedundantCheckOptimization(ASTNode ast) {
        int gas = 30;
        int type = 13;

        traverseAndOptimize(ast, node -> {
            String value = node.getValue().getOrDefault("value", "").toString();

            // Verifica se il nodo è una definizione di funzione
            if (value.equals("function")) {
                List<ASTNode> statements = node.getChildren();
                String requireCondition = null;

                for (ASTNode statement : statements) {
                    if ("require".equals(statement.getValue().get("value"))) {
                        requireCondition = extractCondition(statement);
                    }
                    else if (isComparisonExpression(statement)) {
                        String ifCondition = extractCondition(statement);

                        if (requireCondition != null && requireCondition.equals(ifCondition)) {
                            int line = Integer.parseInt(statement.getValue().getOrDefault("line", "0").toString());
                            String suggestion = "Rimuovi il controllo ridondante `if`, la condizione è già verificata da `require`.";
                            writeOptimizationToCSV(line, suggestion, gas, type);
                        }
                    }
                }
            }
        });
    }

    private boolean isComparisonExpression(ASTNode node) {
        String value = node.getValue().getOrDefault("value", "").toString();
        return value.equals("if") || value.equals("less") || value.equals("greater") ||
                value.equals("equal") || value.equals("different");
    }

    private String extractCondition(ASTNode node) {
        // Estrae la condizione dai figli immediati
        List<ASTNode> children = node.getChildren();
        StringBuilder condition = new StringBuilder();

        for (ASTNode child : children) {
            String childValue = child.getValue().getOrDefault("value", "").toString();
            condition.append(childValue).append(" ");
        }
        return condition.toString().trim();
    }








    ///  funzioni di utilita'

    // Metodo generico per attraversare l'AST e applicare una funzione di ottimizzazione
    private void traverseAndOptimize(ASTNode node, java.util.function.Consumer<ASTNode> optimizer) {
        if (node == null) return;
        optimizer.accept(node);
        for (ASTNode child : node.getChildren()) {
            traverseAndOptimize(child, optimizer);
        }
    }

    // Utility: Verifica se un numero è una potenza di due
    private boolean isPowerOfTwo(int number) {
        return (number > 0) && ((number & (number - 1)) == 0);
    }

    // Utility: Recupera il numero di linea del nodo (fallisce a -1 se mancante)
    private int getLineNumber(ASTNode node) {
        String line = node.getValue().getOrDefault("line", "-1").toString();
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // Utility: Scrive suggerimenti di ottimizzazione nel file CSV
    private void writeOptimizationToCSV(int line, String optimizationSuggestion, int gas, int type) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath, true))) {
            String[] record = { String.valueOf(line), optimizationSuggestion, String.valueOf(gas), String.valueOf(type)};
            writer.writeNext(record);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String generateSuggestion(String expression, String operator) {
        // Verifica che l'espressione sia valida e contenga l'operatore
        if (expression == null || expression.isEmpty() || !expression.contains(operator)) {
            return null;
        }

        // Estrai i termini prima e dopo l'operatore
        String[] parts = expression.split(Pattern.quote(operator));
        if (parts.length != 2) {
            return null; // Evita suggerimenti per espressioni non valide
        }

        String left = parts[0].trim(); // Parte sinistra dell'operatore
        String right = parts[1].trim(); // Parte destra dell'operatore

        // Genera il suggerimento in base al tipo di operatore
        switch (operator) {
            case "+=":
            case "-=":
            case "*=":
            case "/=":
            case "%=":
                return "Sostituire `" + expression + "` con `" + left + " = " + left + " " + operator.charAt(0) + " " + right + "`";
            default:
                return null; // Operatore non gestito
        }
    }

}


