public class queue {
    static class Queue {

        static int array[];
        static int size;
        static int rear = -1;

        Queue(int size) {
            Queue.size = size;
            array = new int[size];
        }

        // isEmpty function 
        boolean isEmpty() {
            return rear == -1;
        }
        
        // enqueue
        void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is Full!");
                return;
            }
            rear++;
            array[rear] = data;
        }

        // dequeue
        int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue!");
                return -1;
            }
            int front = array[0];

            for (int i = 0; i < rear; i++) {
                array[i] = array[i+1];
            }
            rear--;
            return front;
        }

        // peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue!");
                return -1;
            }
            return array[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(q.peek());
            q.remove();
        }
        

    }
}
