public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree asn = new BinaryTree();

        asn.insert(8);

        System.out.println("Source"); 
        System.out.println(asn.getSource().getvalues());

        asn.insert(10);
        asn.insert(3);

        System.out.println("Left-child");
        System.out.println(asn.getSource().getleftNode().getvalues());

        System.out.println("Right-Child");
        System.out.println(asn.getSource().getrightNode().getvalues());
        
        asn.insert(6);
        asn.insert(14);
        asn.insert(1);

        asn.insert(13);
        asn.insert(7);
        asn.insert(4); 
    }
}