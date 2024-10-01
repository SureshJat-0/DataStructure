import java.util.Stack;

class QueueBuild{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int remove() {
        if (s1.isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }
        return s1.pop();
    }
}

public class queueTwoStack {
    public static void main(String[] args) {
        QueueBuild q = new QueueBuild();

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
    }
}
