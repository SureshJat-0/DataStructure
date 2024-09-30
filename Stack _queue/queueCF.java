import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queueCF {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>(); // Because Queue is Interface 

        Queue<Integer> q2 = new ArrayDeque<>(); // We can use both Linked List or Array

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        System.out.println(q.peek());

        q2.add(4);
        System.out.println(q2.peek());
        System.out.println(q2.remove());

    }
}
