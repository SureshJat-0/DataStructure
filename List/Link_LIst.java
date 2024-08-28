// Scratch Implimentation 

package List;

class node {
    String data;
    node next;

    public node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    node head;

    // Add first, last 
    public void addFirst(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }


    // Print link list 
    public void printList() {
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

public class Link_LIst {

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        list.addLast("Link");
        list.addLast("List");
        list.printList();
    }
}
