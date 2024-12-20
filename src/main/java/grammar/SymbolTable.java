package grammar;

import java.util.*;

// Classe per la Tabella dei Simboli
class SymbolTable {
    // Classe per rappresentare un simbolo
    static class Symbol {
        String name;
        String type;
        String scope;

        Symbol(String name, String type, String scope) {
            this.name = name;
            this.type = type;
            this.scope = scope;
        }

        @Override
        public String toString() {
            return name + " (" + type + ") in " + scope;
        }
    }

    private final Stack<Map<String, Symbol>> scopes = new Stack<>(); // Stack degli scope attivi
    private final List<Map<String, Symbol>> allScopes = new ArrayList<>(); // Tutti gli scope
    private final Stack<String> scopeNames = new Stack<>(); // Nomi degli scope

    // Entrare in un nuovo scope
    public void enterScope() {
        String parentScope = scopeNames.isEmpty() ? "Global" : scopeNames.peek();
        String newScopeName = parentScope + "." + (scopes.size() + 1);
        scopeNames.push(newScopeName);
        scopes.push(new HashMap<>());
    }

    // Entrare in un nuovo scope specifico per una funzione
    public void enterFunctionScope(String functionName) {
        String newScopeName = "Function:" + functionName;
        scopeNames.push(newScopeName);
        scopes.push(new HashMap<>());
    }

    public void enterBlockScope(String parentScopeName) {
        String newScopeName = "Block (" + parentScopeName + ")";
        scopeNames.push(newScopeName);
        scopes.push(new HashMap<>());
    }


    // Uscire dallo scope corrente
    public void exitScope() {
        if (!scopes.isEmpty()) {
            Map<String, Symbol> currentScope = scopes.pop();
            if (!allScopes.contains(currentScope)) {
                allScopes.add(currentScope); // Aggiungi lo scope a allScopes solo se non è già presente
            }
            scopeNames.pop();
        }
    }


    // Ottenere il nome dello scope corrente
    public String getCurrentScopeName() {
        return scopeNames.isEmpty() ? "Global" : scopeNames.peek();
    }

    // Aggiungere un simbolo nello scope corrente
    public boolean addSymbol(String name, String type) {
        if (scopes.isEmpty()) {
            enterScope(); // Creare uno scope globale se nessuno è attivo
        }
        Map<String, Symbol> currentScope = scopes.peek();
        if (currentScope.containsKey(name)) {
//          System.err.println("Errore: Simbolo già dichiarato - " + name);
            return false;
        }
        currentScope.put(name, new Symbol(name, type, getCurrentScopeName()));
        return true;
    }

    // Cercare un simbolo negli scope attivi
    public Map.Entry<String, Symbol> lookup(String name) {
        for (int i = scopes.size() - 1; i >= 0; i--) {
            Map<String, Symbol> scope = scopes.get(i);
            if (scope.containsKey(name)) {
                String scopeName = scopeNames.get(i);
                return new AbstractMap.SimpleEntry<>(scopeName, scope.get(name));
            }
        }
        return null; // Simbolo non trovato
    }

    public void printTable() {
        System.out.println("Symbol Table:");
        System.out.println("-------------");
        int j = 0;
        for (int i = 0; i < allScopes.size(); i++) {
            Map<String, Symbol> scope = allScopes.get(i);
            if (!scope.isEmpty()) {
                String scopeName = "Scope " + (++j);
                System.out.println(scopeName + ":");
                for (Symbol symbol : scope.values()) {
                    System.out.println("  " + symbol);
                }
            }
        }
    }


    // Persistenza degli scope attivi nello stack in allScopes
    public void persistScopes() {
        for (Map<String, Symbol> scope : scopes) {
            if (!allScopes.contains(scope)) {
                allScopes.add(scope);
            }
        }
    }
}
