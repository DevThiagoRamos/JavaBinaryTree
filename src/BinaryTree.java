public class BinaryTree {
    private Node source;

    public BinaryTree() {
        this.source = null;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }
    public void insert (int values){
        this.source = this.insertRecursively(this.source, values);
    }

    private Node insertRecursively(Node newNode, int values) {
        //If the tree is empty (root is null), create a node at the root
        if (this.source == null){
            Node SourceNode = new Node(values);
            return SourceNode;
        }
        else
        {
            //
            if (values < newNode.getvalues()){
                newNode.setleftNode(insertRecursively(newNode.getleftNode(), values));

            }
            else{
                newNode.setrightNode(insertRecursively(newNode.getrightNode(), values));
            }
            return newNode;
        }
    }

}
