// Reverse Link List Iterativaly 
// Line no : 36

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
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // --> Reverse Link List Iterativaly <-- 

    public void reverseListIterativly() {

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node curNode = head.next;

        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;

            // Update 
            prevNode = curNode;
            curNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
}


public class LLReveseIterative {
    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.printList();
        list.reverseListIterativly();
        list.printList();
    }
}
