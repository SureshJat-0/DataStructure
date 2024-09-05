package List;

class NodeX {
    int val;
    NodeX next;

    public NodeX(int val) {
        this.val = val;
        this.next = null;
    }
}

class LLRM {
    NodeX head;

    public void deleteDuplicates(NodeX head) {
        if (head == null) {
            return;
        }

        NodeX currNode = head;
        while (currNode.next != null && currNode != null) {
            if (currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
    }

    public void printList() {
        NodeX currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        LLRM list = new LLRM();
        list.head = new NodeX(1);
        list.head.next = new NodeX(2);
        list.head.next.next = new NodeX(2);
        list.head.next.next.next = new NodeX(3);
        
        list.printList();
        list.deleteDuplicates(list.head);
        list.printList();
    }
}
