public class Node {
    private int values;
    private Node leftNode;
    private Node rightNode;

    public Node(int values) {
        this.values = values;
    }

    public int getvalues() {
        return values;
    }

    public void setvalues(int values) {
        this.values = values;
    }

    public Node getleftNode() {
        return leftNode;
    }

    public void setleftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getrightNode() {
        return rightNode;
    }

    public void setrightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    
}