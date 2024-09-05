package List;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class CLL {
    Node head;
    Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        do {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        } while (currNode != head);
    }

}

public class CircularLinkedList {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.insert(1);
        list.insert(2);
        list.insert(3);

        list.print();

    }
}
