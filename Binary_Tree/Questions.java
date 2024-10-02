public class Questions {
    static class Node {
        int data;
        Node left;
        Node right;
    
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    static class BinaryTreeBuild {
        static int index = -1;
    
        public Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
    
            Node newNode = new Node(nodes[index]);
    
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
    
            return newNode;
        }
    }

    // Question 1 : Count total nodes in the tree
    static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // Question 2 : Sum of nodes
    static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // Question 3 : Height of Tree
    static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftMax = heightOfTree(root.left);
        int rightMax = heightOfTree(root.right);

        return Math.max(leftMax, rightMax) + 1;
    }

    // Question 4 : Diameter of Tree --> Time complexity O(n^2)
    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(diameter1, Math.max(diameter2, diameter3));
    }

    // Question 5 : Diameter of Tree --> Time complexity O(n)
    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diameter1 = left.diameter;
        int diameter2 = right.diameter;
        int diameter3 = left.height + right.height + 1;

        int myDiameter = Math.max(Math.max(diameter1, diameter2), diameter3);

        TreeInfo newInfo = new TreeInfo(myHeight, myDiameter);
        return newInfo;
    }
    
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeBuild tree = new BinaryTreeBuild();
        Node root = tree.buildTree(nodes);

        int result = diameter(root);
        System.out.println(result);

        // int result2 = diameter2(root).diameter;
        // System.out.println(result2);

    }
}
