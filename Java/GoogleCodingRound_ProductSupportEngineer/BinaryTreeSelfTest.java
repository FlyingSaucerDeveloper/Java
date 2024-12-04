import java.security.cert.LDAPCertStoreParameters;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeSelfTest {
    static int idx = -1;

    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }

    }

    // Building the Tree
    public Node buildTree(int[] nodes) {

        idx++;
        if (nodes[idx] == -1)
            return null;

        Node rootNode = new Node(nodes[idx]);

        rootNode.left = buildTree(nodes);
        rootNode.right = buildTree(nodes);

        return rootNode;

    }

    // PreOrder Traversal - ROOT LEFT RIGHT
    public void preOrderTraversal(Node rootNode) {

        if (rootNode == null)
            return;

        System.out.print(rootNode.val + " ");
        preOrderTraversal(rootNode.left);
        preOrderTraversal(rootNode.right);

    }

    // InOrder Traversal - LEFT ROOT RIGHT
    public void inOrderTraversal(Node rootNode) {

        if (rootNode == null)
            return;

        inOrderTraversal(rootNode.left);
        System.out.print(rootNode.val + " ");
        inOrderTraversal(rootNode.right);

    }

    // Post Order Traversal - LEFT RIGHT ROOT
    public void postOrderTraversal(Node rootNode) {

        if (rootNode == null)
            return;

        postOrderTraversal(rootNode.left);
        postOrderTraversal(rootNode.right);
        System.out.print(rootNode.val + " ");

    }

    // Level Order Traversal
    public void levelOrderTraversal(Node rootNode) {

        Queue<Node> queue = new LinkedList<Node>();

        queue.add(rootNode);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node curr = queue.remove();

            if (curr == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }

            } else {
                System.out.print(curr.val + " ");
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);

            }

        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTreeSelfTest obj = new BinaryTreeSelfTest();

        Node rootNode = obj.buildTree(nodes);

        System.out.println("Root Node : " + rootNode.val);

        System.out.print("PreOrder Traversal : ");
        obj.preOrderTraversal(rootNode);
        System.out.print("\nInorder Traversal : ");
        obj.inOrderTraversal(rootNode);
        System.out.print("\nPost order Traversal : ");
        obj.postOrderTraversal(rootNode);

        System.out.print("\nLevel order Traversal : \n");
        obj.levelOrderTraversal(rootNode);

    }

}
