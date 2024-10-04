import java.util.LinkedList;
import java.util.Queue;

public class sumAtKthLevel {
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

    static class BinaryTree {
        int index = -1;
        public Node BuildBinaryTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = BuildBinaryTree(nodes);
            newNode.right = BuildBinaryTree(nodes);

            return newNode;
        }

        // Question : Find the sum of Nodes at Kth level of tree
        public void sumAtLevel(Node root, int k) {
            int curLevel = 1;
            int levelSum = 0;
            if (root == null) {
                System.out.println("0");
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curNode = q.remove();
                if (curNode == null) {
                    if (q.isEmpty()) {
                        if (curLevel == k) {
                            System.out.println(levelSum);
                        }
                        break;
                    } else {
                        if (curLevel == k) {
                            System.out.println(levelSum);
                            break;
                        }
                        curLevel++;
                        levelSum = 0;
                        q.add(null);
                    }
                } else {
                    levelSum += curNode.data;
                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildBinaryTree(nodes);
        tree.sumAtLevel(root, 3);
        
    }
}