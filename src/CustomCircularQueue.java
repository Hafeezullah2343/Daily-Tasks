/**
 * Custom Queue implementation using circular array.
 */
public class CustomCircularQueue {

    private final int capacity;
    private final int[] queue;
    private int front;
    private int rear;
    private int size;

    public CustomCircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    /* ================= ENQUEUE ================= */

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
    }

    /* ================= DEQUEUE ================= */

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int temp = queue[front];
        front = (front + 1) % capacity;
        size--;
        return temp;
    }

    /* ================= PEEK ================= */

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    /* ================= UTILITY ================= */

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    /* ================= MAIN ================= */

    public static void main(String[] args) {
        CustomCircularQueue queue = new CustomCircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Final Queue:");
        queue.display();
    }
}
