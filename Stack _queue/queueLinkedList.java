class QueueLL {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    class QueueLList {
        Node head = null;
        Node tail = null;
    }
    // isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    // enqueue
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // dequeue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return -1;
        }
        if (head == tail) {
            tail = null;
        }
        int front = head.data;
        head = head.next;
        return front;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return -1;
        }
        return head.data;
    }
}

public class queueLinkedList {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
