import Java_Self_Learning.numberNotEligibleException;

public class BInarySearchTree {
    static int index = -1;

    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }

    public Node buildTree(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.val > val) {
            root.left = buildTree(root.left, val);
        } else if (root.val < val || root.val == val) {
            root.right = buildTree(root.right, val);
        }

        return root;

    }

    public void InOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        InOrderTraversal(root.left);
        System.out.print(root.val + " ");
        InOrderTraversal(root.right);

    }

    public boolean searchKey(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.val == key) {
            System.out.print("Subtree containing the key (Root Left Right): ");
            printSubTree(root);
            return true;
        }

        if (root.val > key) {

            return searchKey(root.left, key);
        }

        else {

            return searchKey(root.right, key);
        }

    }

    public Node printSubTree(Node root) {

        if (root == null) {
            return null;
        }

        System.out.print(root.val + " ");
        printSubTree(root.left);
        printSubTree(root.right);

        return root;

    }

    public Node findSmallest(Node root) {

        if (root.left == null) {
            return root;
        }

        return findSmallest(root.left);

    }

    public Node deleteNode(Node root, int deleteKey) {

        if (root == null) {
            return null;
        }

        // if key is a leaf node
        if (root.val == deleteKey && root.left == null && root.right == null) {
            System.out.println("1st if worked");
            root = null;
            return root;
        } else if (root.val == deleteKey && root.left == null && root.right != null) {
            System.out.println("2st if worked");
            root = root.right;
            return root;
        } else if (root.val == deleteKey && root.left != null && root.right == null) {
            System.out.println("3st if worked");
            root = root.left;
            return root;
        } else if (root.val == deleteKey && root.left != null && root.right != null) {

            Node smallestValueNode = findSmallest(root.right);
            System.out.println("Smallest Value : " + smallestValueNode.val);
            System.out.println("4th if worked");

            root.val = smallestValueNode.val;
            root.right = deleteNode(root.right, smallestValueNode.val);
            return root;
        }

        if (root.val < deleteKey) {

            root.right = deleteNode(root.right, deleteKey);
            return root;

        } else {
            root.left = deleteNode(root.left, deleteKey);
            return root;
        }

    }

    public static void main(String[] args) {
        // BST SEARCH COMPLEXITY = O(Height of the tree)

        int[] nodes = { 50, 30, 70, 40, 60, 80 };

        Node root = null;

        BInarySearchTree BSTHandler = new BInarySearchTree();

        for (int i : nodes) {
            root = BSTHandler.buildTree(root, i);
        }

        // to check if the BST is build rigt, do In-Order Traversal as it will give a
        // sorted list of numbers.
        System.out.print("Original Values : ");
        for (int i : nodes) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Values after sorting using BST : ");
        BSTHandler.InOrderTraversal(root);

        System.out.println();

        // Search is BST
        int key = 3;

        System.out.print("Searching key " + key + " in the BST : ");
        BSTHandler.InOrderTraversal(root);
        System.out.println();

        if (BSTHandler.searchKey(root, key)) {
            System.out.println();
            System.out.println("Key exist in the Tree");
        } else
            System.out.println("Key not found");

        System.out.println();

        // Delete in BST : cases : If node is leaf node, if node has 1 child , if node
        // has 2 child
        int deleteKey = 50;
        if (BSTHandler.searchKey(root, deleteKey)) {

            root = BSTHandler.deleteNode(root, deleteKey);
            System.out.println("New BST Tree : ");
            BSTHandler.InOrderTraversal(root);

        } else
            System.out.println("Unable to delete " + deleteKey + " as it does not exist");

    }

}
