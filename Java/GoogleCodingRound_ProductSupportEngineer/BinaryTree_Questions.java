public class BinaryTree_Questions {

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

        static Node treeBuilder(int nodes[]) {
            index++;
            if (nodes[index] == -1)
                return null;

            Node newNode = new Node(nodes[index]);
            newNode.leftNode = treeBuilder(nodes);
            newNode.rightNode = treeBuilder(nodes);

            return newNode;

        }

    }

    public static int NodeCounter(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }

        int leftNode = NodeCounter(rootNode.leftNode);
        int rightNode = NodeCounter(rootNode.rightNode);

        return leftNode + rightNode + 1;
    }

    public static int SumOfNodes(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }

        int leftNode = SumOfNodes(rootNode.leftNode);
        int rightNode = SumOfNodes(rootNode.rightNode);

        return leftNode + rightNode + rootNode.data;

    }

    public static int treeHeight(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }

        int leftHeight = treeHeight(rootNode.leftNode);
        int rightHeight = treeHeight(rootNode.rightNode);

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static int treeDiameter(Node rootNode) {

        if (rootNode == null) {
            return 0;
        }

        int DiaLHS = treeDiameter(rootNode.leftNode);
        int DiaRHS = treeDiameter(rootNode.rightNode);
        int diameterWithRoot = treeHeight(rootNode.leftNode) + treeHeight(rootNode.rightNode) + 1;

        return (Math.max((Math.max(DiaLHS, DiaRHS)), diameterWithRoot));

    }

    static class TreeInfo {

        int diameter;
        int height;

        TreeInfo(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }

    }

    static TreeInfo treeDiameterApproach2(Node rootNode) {

        if (rootNode == null)
            return new TreeInfo(0, 0);

        TreeInfo lefTreeInfo = treeDiameterApproach2(rootNode.leftNode);
        TreeInfo righTreeInfo = treeDiameterApproach2(rootNode.rightNode);

        int treeHeight = Math.max(lefTreeInfo.height, righTreeInfo.height) + 1;

        int LSTDiameter = lefTreeInfo.diameter;
        int RSTDiameter = righTreeInfo.diameter;
        int DiameterOfTreeWithRoot = lefTreeInfo.height + righTreeInfo.height + 1;

        int myDiameter = Math.max(Math.max(LSTDiameter, RSTDiameter), DiameterOfTreeWithRoot);

        TreeInfo myInfo = new TreeInfo(myDiameter, treeHeight);

        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node rootNode = BuildTree.treeBuilder(nodes);

        System.out.println("PreOrder RootNode : " + rootNode.data);

        System.out.println("Total Nodes : " + NodeCounter(rootNode));

        System.out.println("Sum of all the nodes : " + SumOfNodes(rootNode));

        System.out.println("Height of the Tree : " + treeHeight(rootNode));

        System.out.println("Diameter of the tree : " + treeDiameter(rootNode));

        System.out.println("Diameter of Tree (Approach 2) : " + treeDiameterApproach2(rootNode).diameter);

    }

}
