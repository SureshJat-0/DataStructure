package List;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;

    // --> Reverse Link List Iterativaly <--

    public void reverseLLIterative() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // --> Link List reverse Recursivaly <-- 

    public Node reverseLLRecursive(Node head) {
        // Base case: if the list is empty or has one element, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Recur for the rest of the list
        Node newHead = reverseLLRecursive(head.next);

        // Reverse the current node
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

public class LLRevese {
    public static void main(String[] args) {
        LL list = new LL();
        
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        list.printList();
        // list.reverseLLIterative();
        list.head = list.reverseLLRecursive(list.head);
        list.printList();
    }
}
