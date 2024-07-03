import java.util.LinkedList;

public class BinaryTreeBasicQuestions {
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

        } else
            return null;

    }

    public int nodeCounter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodeCount = nodeCounter(root.leftNode);
        int rightNodeCount = nodeCounter(root.rightNode);

        return leftNodeCount + rightNodeCount + 1;

    }

    public int totalSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = totalSum(root.leftNode);
        int rightSum = totalSum(root.rightNode);

        return leftSum + rightSum + root.data;
    }

    public int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = heightOfTree(root.leftNode);
        int rightHeight = heightOfTree(root.rightNode);

        return (Math.max(leftHeight, rightHeight) + 1);

    }

    public int DiameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiameter = DiameterOfTree(root.leftNode);
        int rightDiameter = DiameterOfTree(root.rightNode);
        int rootDiameter = heightOfTree(root.leftNode) + heightOfTree(root.rightNode) + 1;

        return Math.max(rootDiameter, Math.max(rightDiameter, leftDiameter));

    }

    public boolean ifIdentical(Node root, Node testroot) {
        if (root == null && testroot == null) {
            return true;
        }

        if (root == null || testroot == null) {
            return false;
        }

        if (root.data == testroot.data)
            return ifIdentical(root.leftNode, testroot.leftNode) && ifIdentical(root.rightNode, testroot.rightNode);

        else
            return false;

    }

    public boolean subtreeFinder(Node root, Node testroot) {
        if (root == null) {
            return false;
        }

        if (testroot == null) {
            return true;
        }

        if (root.data == testroot.data) {

            if (ifIdentical(root, testroot)) {
                return true;
            }

        }

        return subtreeFinder(root.leftNode, testroot) || subtreeFinder(root.rightNode, testroot);

    }

    public static void main(String[] args) {

        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = new BinaryTreeBasicQuestions().buildTree(nodes);

        System.out.println("Total nodes in the Tree : " + new BinaryTreeBasicQuestions().nodeCounter(root));
        System.out.println("Sum of all the nodes : " + new BinaryTreeBasicQuestions().totalSum(root));
        System.out.println("Height of the tree : " + new BinaryTreeBasicQuestions().heightOfTree(root));

        System.out
                .println("Diameter of the tree **IMP** FAANG : " + new BinaryTreeBasicQuestions().DiameterOfTree(root));
        // Max of Diameter of Left, Right and Root and Time Complexiti O(n x n)

        int[] subNodes = { 2, 4, -1, -1, 5, -1, -1 };
        i = -1;

        Node subroot = new BinaryTreeBasicQuestions().buildTree(subNodes);

        System.out.println("Subtree of the another tree ***IMP*** FAANG : "
                + new BinaryTreeBasicQuestions().subtreeFinder(root, subroot));

    }
}
