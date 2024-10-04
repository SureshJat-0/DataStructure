// Binary Search Tree makes search efficient

public class BinarySearchTree {

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

    // Insert in BST 
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Inorder traversal in BST --> which gives shorted data 
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // search in BST --> Time complexity O(H) , where H = height of tree 
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {

        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        // inorder(root);
        // System.out.println(search(root, 3));

    }
}
