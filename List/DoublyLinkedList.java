package List;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class DLL {
    ListNode head;

    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.prev.next = null;
        currNode.prev = null;
    }

    public void printList() {
        ListNode currNode = head;
        System.out.print("N <-> ");
        while(currNode != null) {
            System.out.print(currNode.val + " <-> ");
            currNode = currNode.next;
        }
        System.out.println("N");
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DLL list = new DLL();
        
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        list.deleteFirst();
        list.deleteLast();

        list.printList();
    }
    
}
