public class BinaryTreeBasics {
    static int i = -1;

    class Node {

        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

    }

    public Node buildTree(int[] nodes) {
        i++;

        if (nodes[i] != -1) {

            Node newNode = new Node(nodes[i]);
            newNode.leftNode = buildTree(nodes);
            newNode.rightNode = buildTree(nodes);

            return newNode;

        }

        else
            return null;
    }

    public void preOrder(Node root) {
        if (root == null) {
            System.out.print(" -1 ");
            return;

        }

        System.out.print(root.data + " ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 6, -1, -1 };
        Node root = new BinaryTreeBasics().buildTree(nodes);

        System.out.println(root.data);

        new BinaryTreeBasics().preOrder(root);

    }
}
