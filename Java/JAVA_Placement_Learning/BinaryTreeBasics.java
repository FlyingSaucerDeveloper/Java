import java.util.LinkedList;

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

    // PreOrder Traversal
    public void preOrder(Node root) {
        if (root == null) {
            System.out.print(" -1  ");
            return;

        }

        System.out.print(root.data + "  ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);

    }

    // InOrder Traversal --> DFS
    public void inOrder(Node root) {
        if (root == null) {
            System.out.print("  -1  ");
            return;
        }

        inOrder(root.leftNode);
        System.out.print(root.data + " ");
        inOrder(root.rightNode);

    }

    // PostOrder Traversal --> DFS
    public void postOrder(Node root) {

        if (root == null) {
            System.out.print(" -1 ");

            return;

        }

        postOrder(root.leftNode);
        postOrder(root.rightNode);
        System.out.print(root.data + "  ");

    }

    // Level Order Traversal - IMP **FAANG** -> Breadth Fisrt Search (BFS)
    public void levelOrder(Node root) {

        if (root == null) {
            return;
        }

        LinkedList<Node> lQueue = new LinkedList<Node>();
        lQueue.add(root);
        lQueue.add(null);

        while (!lQueue.isEmpty()) {
            Node curr = lQueue.remove();
            if (curr == null) {
                System.out.println();
                if (lQueue.isEmpty())
                    break;

                else {
                    lQueue.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.leftNode != null) {
                    lQueue.add(curr.leftNode);
                }
                if (curr.rightNode != null) {
                    lQueue.add(curr.rightNode);
                }
            }

        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = new BinaryTreeBasics().buildTree(nodes);

        System.out.println(root.data);

        System.out.println("Pre-Order Traversal");
        new BinaryTreeBasics().preOrder(root);

        System.out.println('\n');

        System.out.println("In-Order Traversal");
        new BinaryTreeBasics().inOrder(root);

        System.out.println('\n');

        System.out.println("Post-Order Traversal");
        new BinaryTreeBasics().postOrder(root);

        System.out.println('\n');
        System.out.println("Level Order Traversal - IMP FAANG");
        new BinaryTreeBasics().levelOrder(root);

        System.out.println('\n');

    }
}
