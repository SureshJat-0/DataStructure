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

    // Question 1 : Count total nodes in the tree.
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
    
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTreeBuild tree = new BinaryTreeBuild();
        Node root = tree.buildTree(nodes);

        int totalNodes = sumOfNodes(root);
        System.out.println(totalNodes);
    }
}
