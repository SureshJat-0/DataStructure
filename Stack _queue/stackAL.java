import java.util.ArrayList;

class Stack {
    ArrayList<Integer> list = new ArrayList<>();

    // Push function of Stack
    public void push(int data) {
        list.addFirst(data);
    }

    // Peek function of Stack
    public int peek() {
        if (list.size() == 0) {
            return -1;
        }
        return list.get(0);
    }

    // Pop function of Stack 
    public void pop() {
        if (list.size() == 0) {
            System.out.println("Stack is empty!");
            return;
        }
        list.removeFirst();
    }
}

public class stackAL {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (s.peek() != -1) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
