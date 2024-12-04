
//Avg Time compexity O(h) height of the tree , in many cases O(logn)

import java.util.ArrayList;
import java.util.List;

public class BST_Basics {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }

    }

    static class BuildTree {
        static int index = -1;

        static Node treeBuilder(Node root, int node) {
            if (root == null) {
                root = new Node(node);
                return root;
            }

            if (root.val > node) {

                root.left = treeBuilder(root.left, node);

            }

            else if (root.val < node) {
                root.right = treeBuilder(root.right, node);

            }

            return root;

        }

    }

    public static void inOrderTraversal(Node root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // O(height of the tree) - time complexity
    public static boolean bstSearch(Node root, double key) {

        if (root == null)
            return false;
        if (root.val == key)
            return true;

        if (root.val > key) {

            return bstSearch(root.left, key);

        } else {
            return bstSearch(root.right, key);
        }

    }

    public static Node inOrderSuccessorFinder(Node root) {

        if (root.left == null) {
            return root;
        }

        return inOrderSuccessorFinder(root.left);

    }

    // Delete the Node
    public static Node delete(Node root, int val) {
        if (root == null)
            return null;

        if (root.val == val) {
            // case 1 - No Child
            if (root.right == null && root.left == null)
                return null;

            // case 2 - 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 , the node to be deleted has children
            Node inOrderSucessor = inOrderSuccessorFinder(root.right);
            root.val = inOrderSucessor.val;
            root.right = delete(root.right, inOrderSucessor.val);

        }

        else if (root.val > val) {
            root.left = delete(root.left, val);
        }

        else if (root.val < val) {
            root.right = delete(root.right, val);
        }

        return root;

    }

    // static List<Integer> inOrderArr = new ArrayList<>();
    public static void printInRangeApproach1(Node root, int x, int y) {
        // Get the inOrderTraversal, then print the range

        if (root == null)
            return;

        if (root.val > x) {
            printInRangeApproach1(root.left, x, y);
        }
        if (root.val >= x && root.val <= y)
            System.out.print(" " + root.val);

        if (root.val < y)
        printInRangeApproach1(root.right, x, y);

    }

    static void printPath(ArrayList<Integer> arr){
        System.out.print ("Path : ");
        for  (int i: arr){
            System.out.print ( i+ " -> ");
        }
        System.out.println();

    }

    public static void rootToLeafPaths(ArrayList<Integer> arr, Node root){

        if (root == null) return; 

        arr.add(root.val);

        if(root.left==null && root.right==null){
            printPath(arr);
        }
        rootToLeafPaths(arr, root.left);
        
        rootToLeafPaths(arr, root.right);
        arr.remove(arr.size()-1);



    }

    

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };

        Node rootNode = null;

        for (int i : nodes) {
            rootNode = BuildTree.treeBuilder(rootNode, i);
        }

        inOrderTraversal(rootNode);
        System.out.println(bstSearch(rootNode, 5));

   

        System.out.println();
        delete(rootNode, 5);
        inOrderTraversal(rootNode);

        printInRangeApproach1(rootNode, 6, 11); //Use InOrder Approach

        System.out.println();//Use PreOrder Approach
        rootToLeafPaths(new ArrayList<>(), rootNode);
        
       
    

    }

}
