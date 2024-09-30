class QueueC {
    int arr[];
    int size;
    int front = -1;
    int rear = -1;

    QueueC(int size) {
        this.size = size;
        arr = new int[size];
    }

    // isEmpty
    boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    // enqueue
    public void add(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = x;
    }
    // dequeue
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Full!");
            return -1;
        }

        int frontVal = arr[front];
        // For single element 
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return frontVal;
    }
    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[front];
    }
}

public class queueCircular {
    public static void main(String[] args) {
        QueueC q = new QueueC(3);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(4);
        System.out.println(q.peek());



    }   
}
