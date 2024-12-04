import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeBasics_BinaryTree {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            leftNode = null;
            rightNode = null;
        }

    }

    static class BuildTree {
        static int index = -1;

        public static Node treeBuilder(int nodes[]) {
            index = index + 1;

            if (nodes[index] == -1) {
                System.out.print(" " + -1);
                return null;
            }

            Node newNode = new Node(nodes[index]);
            System.out.print("  " + newNode.data);
            newNode.leftNode = treeBuilder(nodes);
            newNode.rightNode = treeBuilder(nodes);

            return newNode; // In the end the function will return root node (The Final Parent Node).

        }

    }

    static void preOrderTraversal(Node rootNode) {
        if (rootNode == null) {
            return;
        }

        System.out.print("  " + rootNode.data);
        preOrderTraversal(rootNode.leftNode);
        preOrderTraversal(rootNode.rightNode);

    }

    static void inOrderTraversal(Node rootNode) {
        if (rootNode == null) {
            return;
        }

        inOrderTraversal(rootNode.leftNode);
        System.out.print(" " + rootNode.data);
        inOrderTraversal(rootNode.rightNode);

    }

    static void postOrderTraversal(Node rootNode) {

        if (rootNode == null)
            return;

        postOrderTraversal(rootNode.leftNode);
        postOrderTraversal(rootNode.rightNode);
        System.out.print(" " + rootNode.data);

    }

    static void levelOrderTraversal(Node rootNode) {

        if (rootNode == null)
            return;

        Queue<Node> queue = new LinkedList<>();

        queue.add(rootNode);
        queue.add(null);

        while (!queue.isEmpty()) {

            Node currNode = queue.remove();

            if (currNode == null) {
                System.out.println();
                if (queue.isEmpty())
                    break;
                else
                    queue.add(null);
            } else {
                System.out.print(currNode.data);
                if (currNode.leftNode != null)
                    queue.add(currNode.leftNode);
                if (currNode.rightNode != null)
                    queue.add(currNode.rightNode);

            }

        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node rootNode = BuildTree.treeBuilder(nodes);

        System.out.println("\nPreOrder RootNode : " + rootNode.data);

        System.out.print("PreOrder Traversal : ");
        preOrderTraversal(rootNode);

        System.out.print("\nInOrder Traversal : ");
        inOrderTraversal(rootNode);

        System.out.print("\nPostOrder Traversal : ");
        postOrderTraversal(rootNode);

        System.out.println("\nLevel Order Traversal : ");
        levelOrderTraversal(rootNode);

    }

}
