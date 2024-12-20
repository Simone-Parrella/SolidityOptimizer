package grammar;

import Tree.TreePlotter;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.nio.file.*;
import java.util.*;

import static grammar.ASTBuilder.buildAST;

public class Main {
    public static void main(String[] args) throws Exception {
        // Verifica che l'utente abbia passato il file CSV come argomento

        if (args.length < 1) {
            System.out.println("Errore: Devi fornire il percorso del file CSV generato da Python come argomento.");
            return;
        }
        String csvPath = args[0];
        File csvFile = new File(csvPath);

//         Verifica se il file CSV esiste
        if (!csvFile.exists() || csvFile.isDirectory()) {
            System.out.println("Errore: Il file CSV specificato non esiste o non è un file valido.");
            return;
        }

        // Creazione della cartella per i risultati
        String repoName = csvFile.getName().replace(".csv", ""); // Usa il nome del CSV senza estensione
        System.out.println("Sono a riga 30");
        File outputDir = new File(repoName);
        if (!outputDir.exists()) {
            outputDir.mkdirs(); // Crea la directory se non esiste
        }

        // Lettura del CSV
        List<String[]> fileEntries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            // Salta l'intestazione
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                fileEntries.add(values);
            }
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file CSV: " + e.getMessage());
            return;
        }

        // Itera su ogni file elencato nel CSV
        for (String[] entry : fileEntries) {
            String fileName = entry[0]; // Nome del file Solidity
            String filePath = entry[1]; // Percorso assoluto del file Solidity

            System.out.println("Processando il file: " + fileName);

            // Leggi il contenuto del file Solidity
            String solidityCode;
            try {
                solidityCode = Files.readString(Paths.get(filePath));
            } catch (IOException e) {
                System.out.println("Errore durante la lettura del file Solidity: " + filePath);
                continue;
            }

            // Nome del file CSV per i risultati

           String optimizationReport = outputDir.getPath() + File.separator + fileName.replace(".sol", "_optimization.csv");

            SoliditySymbolListener soliditySymbolListener = new SoliditySymbolListener();
            SymbolTable symbolTable = soliditySymbolListener.buildSymbolTable(solidityCode);
            ASTNode ast = buildAST(solidityCode);
            Optimizer op = new Optimizer( optimizationReport);
            op.optimize(ast);
            symbolTable.printTable();

        }

        System.out.println("Tutti i file sono stati processati. I risultati sono disponibili nella directory: " + outputDir.getPath());
    }
}
