import java.util.LinkedList;
import java.util.Queue;

public class BSTTEST {

    class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;

        }

    }

    public Node buildTree(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (root.val > key) {

            root.left = buildTree(root.left, key);

        } else
            root.right = buildTree(root.right, key);

        return root;
    }

    // InOrder Traverasal
    public void inOrderTraversal(Node root) {

        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);

    }

    // Level Order Traversal
    public void levelOrderTraversal(Node root) {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node curr = queue.remove();

            if (curr != null) {
                System.out.print(curr.val + " ");
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);

            } else {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }

            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 2, 7 };

        Node root = null;
        BSTTEST obj = new BSTTEST();

        for (int i : arr) {
            root = obj.buildTree(root, i);
        }

        System.out.println("Tree Root : " + root.val);

        // InOrder Traversal - All elemtns in ascending order - Left Root Right
        System.out.print("Inorder Traversal : ");
        obj.inOrderTraversal(root);

        // Level Order Traversal
        System.out.println("\nLevel Order Traversal :-> ");
        obj.levelOrderTraversal(root);

    }

}
