package question;
import java.util.Stack;

public class reverseStack {
    // Push at bottom function 
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    // Using Extra Space 
    public static void reverse_Stack(Stack<Integer> s, Stack<Integer> rs) {
        if (s.isEmpty()) {
            return;
        }
        rs.push(s.peek());
        s.pop();
        reverse_Stack(s, rs);

    }

    // Without using Extra space
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // Stack<Integer> rs = new Stack<>(); // For Extra Space
        s.push(1);
        s.push(2);
        s.push(3);

        // reverse_Stack(s, rs); 
        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
