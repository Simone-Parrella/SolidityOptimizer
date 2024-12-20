package symbolTable;

import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Set;

public class SymbolTable {

	private Stack<Map<String, String>> scopes; // Stack per gli scope
	private Map<String, String> currentScope;  // Mappa per lo scope corrente

	public SymbolTable() {
		// Inizializza lo stack di scope e il primo scope vuoto
		this.scopes = new Stack<>();
		this.currentScope = new HashMap<>();
		this.scopes.push(currentScope);
	}

	// Aggiunge un simbolo nello scope corrente
	public void addSymbol(String id, String symbol) {
		if (currentScope.containsKey(id)) {
			System.err.println("Errore: Variabile già dichiarata - " + id);
		} else {
			currentScope.put(id, symbol);
		}
	}

	// Modifica il valore di un simbolo nello scope corrente
	public void modifyValue(String id, String symbol) {
		if (currentScope.containsKey(id)) {
			currentScope.put(id, symbol);
		} else {
			System.err.println("Errore: Simbolo non trovato per la modifica - " + id);
		}
	}

	// Entra in un nuovo scope
	public void enterScope() {
		Map<String, String> newScope = new HashMap<>();
		this.scopes.push(newScope);
		this.currentScope = newScope;
	}

	// Esce dallo scope corrente
	public void exitScope() {
		if (!scopes.isEmpty()) {
			this.scopes.pop();
			this.currentScope = scopes.isEmpty() ? new HashMap<>() : scopes.peek();
		}
	}

	// Popola la mappa dei simboli durante l'analisi dell'albero
	public boolean populateMap(final Tree t, final List<String> ruleNames) {
		boolean flag = false;
		if (t.getChildCount() == 0) return false;

		Stack<Tree> stack = new Stack<>();
		stack.push(t);

		while (!stack.empty()) {
			Tree t0 = stack.pop();
			for (int i = 0; i < t0.getChildCount(); i++) {
				stack.push(t0.getChild(i));
				String value = Trees.getNodeText(t0, ruleNames);
				if (value.equals("identificatore") && !flag) {
					addSymbol(Trees.getNodeText(stack.pop(), ruleNames), value);
					flag = true;
				}
			}
			flag = false;
		}
		return true;
	}

	public String getSymbol(String id) {
		for (int i = scopes.size() - 1; i >= 0; i--) {
			Map<String, String> scope = scopes.get(i);
			if (scope.containsKey(id)) {
				return scope.get(id);
			}
		}
		return null;  // Simbolo non trovato
	}

	// Verifica se un simbolo è presente in qualche scope
	public boolean contains(String id) {
		for (int i = scopes.size() - 1; i >= 0; i--) {
			Map<String, String> scope = scopes.get(i);
			if (scope.containsKey(id)) {
				return true;
			}
		}
		return false;
	}

	// Stampa la tabella dei simboli
	public void printTable() {
		System.out.println("Symbol Table:");
		int scopeNumber = 1;
		for (Map<String, String> scope : scopes) {
			System.out.println("Scope " + scopeNumber++ + ":");
			Set<String> keys = scope.keySet();
			for (String key : keys) {
				System.out.println("  " + key + " (" + scope.get(key) + ")");
			}
		}
	}
}
