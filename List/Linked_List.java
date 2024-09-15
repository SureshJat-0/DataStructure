// Scratch Implimentation 

package List;

class LNode {
    String data;
    LNode next;

    public LNode(String data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    LNode head;
    private int size;

    LL() {
        this.size = 0;
    }

    // Add first, last 
    public void addFirst(String data) {
        LNode newNode = new LNode(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        LNode newNode = new LNode(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        LNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    // Print link list 
    public void printList() {
        LNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete in Link List - first, last
    public void deleteFirst() {
        size--;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        LNode lastNode = head.next;
        LNode secLastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
        }
        secLastNode.next = null;
        
    }

    public int returnSize() {
        return size;
    }
}

public class Linked_List {

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        list.addLast("Link");
        list.addLast("List");
        System.out.println(list.returnSize());
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteLast();
        list.printList();
        
        System.out.println(list.returnSize());
    }
}
