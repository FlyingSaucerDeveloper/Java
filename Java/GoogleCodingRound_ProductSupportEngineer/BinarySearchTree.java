import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    class Node {
        int val;
        Node leftNode;
        Node rightNode;

        Node(int val) {
            this.val = val;

        }

    }

    Node buildTree(int i, Node root) {
        if (root == null) {
            root = new Node(i);
            return root;
        }

        if (i < root.val) {
            root.leftNode = buildTree(i, root.leftNode);
        } else
            root.rightNode = buildTree(i, root.rightNode);

        return root;
    }

    void inOrderTraversal(Node rootNode) {
        if (rootNode == null)
            return;

        inOrderTraversal(rootNode.leftNode);
        System.out.print(rootNode.val + " ");
        inOrderTraversal(rootNode.rightNode);

    }

    void levelOrderTraversal(Node rootNode) {
        System.out.println("\n");
        Queue<Node> nodesQueue = new LinkedList<Node>();

        nodesQueue.add(rootNode);
        nodesQueue.add(null);

        while (!nodesQueue.isEmpty()) {
            Node currNode = nodesQueue.remove();

            if (currNode == null) {
                System.out.println();
                if (nodesQueue.isEmpty())
                    break;
                else
                    nodesQueue.add(null);

            } else {
                System.out.print(currNode.val + " ");
                if (currNode.leftNode != null)
                    nodesQueue.add(currNode.leftNode);
                if (currNode.rightNode != null)
                    nodesQueue.add(currNode.rightNode);
            }

        }

    }

    boolean searchBST(Node rootNode, int search) {
        if (rootNode == null)
            return false;
        if (rootNode.val == search)
            return true;

        if (rootNode.val > search) {

            return searchBST(rootNode.leftNode, search);

        } else
            return searchBST(rootNode.rightNode, search);

    }

    Node addNode(Node rootNode, int newNode) {
        if (rootNode == null) {
            rootNode = new Node(newNode);
            return rootNode;
        }

        if (rootNode.val == newNode)
            return rootNode;

        if (rootNode.val > newNode) {
            if (rootNode.leftNode == null) {
                rootNode.leftNode = new Node(newNode);
                return rootNode;
            }
            addNode(rootNode.leftNode, newNode);

        } else {

            if (rootNode.rightNode == null) {
                rootNode.rightNode = new Node(newNode);
                return rootNode;
            }
            addNode(rootNode.rightNode, newNode);
        }

        return rootNode;
    }

    Node findSuccessor(Node root){

        if (root.leftNode == null) return root;

        root= findSuccessor(root.leftNode);

        return root;
    }

    Node deleteNode(Node root, int target) {
        if (root == null)
            return null;

        if (root.val == target) {
          
            if (root.leftNode == null && root.rightNode==null) return null; // No child
            else if (root.leftNode==null) return root.rightNode; // No left child
            else if (root.rightNode==null) return root.leftNode;   // No right child

            //if right and left is not null - Find the successor
            Node successorNode = findSuccessor(root.rightNode);
            root.val = successorNode.val;
            root.rightNode= deleteNode(root.rightNode, successorNode.val);
          
        }

        if (root.val > target) {
            root.leftNode = deleteNode(root.leftNode, target);
        } else
            root.rightNode = deleteNode(root.rightNode, target);

        return root;
    }

    public static void main(String[] args) {

        int arr[] = { 5, 6, 1, 2, 4, 3, 0 };

        Node rootNode = null;
        BinarySearchTree obj = new BinarySearchTree();
        for (int i : arr) {
            rootNode = obj.buildTree(i, rootNode);
        }

        obj.inOrderTraversal(rootNode);

        obj.levelOrderTraversal(rootNode);

        System.out.println("\n" + obj.searchBST(rootNode, 0));

        obj.addNode(rootNode, 7);

        obj.levelOrderTraversal(rootNode);

        obj.deleteNode(rootNode, 1);

        obj.levelOrderTraversal(rootNode);

    }

}
