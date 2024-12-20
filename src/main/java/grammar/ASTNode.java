package grammar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.Map;

public class ASTNode {
    private String type;
    private Map<String, Object> value;
    private List<ASTNode> children;

    public ASTNode(String type, Map<String, Object> value) {
        this.type = type;
        this.value = value;
    }

    public ASTNode(String type, Map<String, Object> value, List<ASTNode> children) {
        this.type = type;
        this.value = value;
        this.children = children;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getValue() {
        return value;
    }

    public void setValue(Map<String, Object> value) {
        this.value = value;
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    public List<ASTNode> getChildren(String type) {
        List<ASTNode> childrenOfType = new ArrayList<>();
        if (children == null) {
            return childrenOfType;
        }
        for (ASTNode child : children) {
            if (child.getType().equals(type)) {
                childrenOfType.addAll(child.getChildren());
            }
        }
        return childrenOfType;
    }

    public void setChildren(List<ASTNode> children) {
        this.children = children;
    }

    public void removeChild(ASTNode child) {
        if (children != null) {
            children.remove(child);
        }
    }

    public boolean hasChildren(){
        return children != null && !children.isEmpty();
    }

    public boolean hasChild(String type) {
        if (children == null) {
            return false;
        }
        for (ASTNode child : children) {
            if (child.getType().equals(type)) {
                return true;
            }
        }
        return false;
    }
    public ASTNode getChild(String type) {
        if (children == null) {
            return null;
        }
        for (ASTNode child : children) {
            if (child.getType().equals(type)) {
                return child;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ASTNode{");
        sb.append("type='").append(type).append('\'');
        if (value != null) {
            sb.append(", value=").append(value);
        }
        if (children != null && !children.isEmpty()) {
            sb.append(", children=").append(children);
        }
        sb.append('}');
        return sb.toString();
    }

    public void printPretty(String indent) {
        if (value != null && !value.isEmpty()) {

            for (Map.Entry<String, Object> entry : value.entrySet()) {
                if(!entry.getKey().equals("value")) continue;
                    System.out.println(indent + entry.getValue() +"("+type+")" );
            }
        }

        if (children != null && !children.isEmpty()) {

            for (ASTNode child : children) {
                child.printPretty(indent + "    ");
            }
        }
    }

    public void generateGraphvizFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName + ".graphviz")) {
            writer.write("digraph AST {\n");
            writer.write("node [shape=box];\n");
            writeNode(writer, "root", this);
            writer.write("}\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Runtime.getRuntime().exec("dot -Tpng " + fileName + ".graphviz -o " + fileName + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeNode(FileWriter writer, String parentName, ASTNode node) throws IOException {
        if (node.value != null && !node.value.isEmpty()) {
            for (Map.Entry<String, Object> entry : node.value.entrySet()) {
                if (!entry.getKey().equals("value")) continue;
                String nodeName = "node" + System.identityHashCode(node);
                writer.write(String.format("%s [label=\"%s (%s)\"];%n", nodeName, entry.getValue(), node.type));
                writer.write(String.format("%s -> %s;%n", parentName, nodeName));
            }
        }
        if (node.children != null && !node.children.isEmpty()) {
            for (ASTNode child : node.children) {
                writeNode(writer, "node" + System.identityHashCode(node), child);
            }
        }
    }



}
