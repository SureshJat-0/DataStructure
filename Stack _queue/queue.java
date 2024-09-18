// CORRECTION 

public class queue {
    static class Queue {

        static int array[];
        static int size;
        static int front = 0;
        static int rear = -1;

        Queue(int size) {
            this.size = size;
            array = new int[size];
        }

        // isEmpty function 
        boolean isEmpty() {
            if (front == rear + 1) {
                return true;
            }
            return false;
        }
        
        // adding element in queue
        void add(int data) {
            if (rear == size - 1) {
                System.out.println("No space in Queue to add element!");
                return;
            }
            rear++;
            array[rear] = data;
        }

        // removing element from queue 
        void remove() {
            if (isEmpty()) {
                System.out.println("No element left!");
                return;
            }
            front++;
        }

        // peek element in stack 
        int peek() {
            if (isEmpty()) {
                System.out.println("No element left!");
                return -1;
            }
            return array[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
