class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackDS {
    Node head;

    // Add element at top of the Stack
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Delete element at the top of the Stack 
    public void pop() {
        if (head == null) {
            System.out.println("Stack is empty!");
            return;
        }
        head = head.next;
    }

    // Get the value of top element which is at the top of Stack
    public int peak() {
        if (head == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return head.data;
    }
}

public class stack {
    public static void main(String[] args) {
        StackDS stk = new StackDS();
        stk.push(1);
        stk.push(3);
        
        stk.pop();
        
        System.out.println(stk.peak());
    }
}