package grammar;

import grammar.SoliditySymbolListener;
import grammar.SymbolTable;

public class TestSemanticAnalysis {
    public static void main(String[] args) {
        String inputCode = """
            contract TestContract {
                uint globalVar;
                uint globalVar; // Errore: variabile duplicata
                
                function firstFunction(uint a, uint a) public { // Errore: parametro duplicato
                    uint localVar1 = 5;
                    uint localVar1 = 10; // Errore: variabile duplicata
                    
                    localVar1 = localVar1 + 1;
                    undeclaredVar = 2; // Errore: variabile non dichiarata
                }
                
                function secondFunction() public {
                    uint localVar2 = 7;
                    {
                        uint nestedVar = 15;
                        uint nestedVar = 20; // Errore: variabile duplicata
                    }
                    nestedVar = 25; // Errore: variabile non dichiarata
                }
                
                function thirdFunction() public {
                    globalVar = globalVar + 1; // OK: variabile globale
                    uint thirdLocalVar = 8;
                }
            }
        """;

        SoliditySymbolListener listener = new SoliditySymbolListener();
        SymbolTable symbolTable = listener.buildSymbolTable(inputCode);

        System.out.println("\nAnalisi terminata. Simboli trovati:");
        symbolTable.printTable();
    }
}
