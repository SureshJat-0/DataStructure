import java.util.ArrayList;

public class Questions2 {

    // Question 1 : Print values of nodes if it is in the range of x and y ( x <= root.data <= y )
    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (x <= root.data && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);
        } 
        else if (root.data < x) {
            printInRange(root.right, x, y);
        } 
        else if (root.data > y) {
            printInRange(root.left, x, y);
        }
    }

    // Question 2 : Print all paths from Root to Leaf
    static ArrayList<Integer> list = new ArrayList<>();
    public static void printPaths(Node root) {
        if (root == null) {
            return;
        }

        list.add(root.data);

        if (root.left == null && root.right == null) {
            printList(list);
        } else {
            printPaths(root.left);
            printPaths(root.right);
        }
        list.remove(list.size() - 1);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void main(String[] args) {
        int nodes[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }
        // inorder(root);
        System.out.println();
        
        // printInRange(root, 3, 10);

        printPaths(root);

    }
}