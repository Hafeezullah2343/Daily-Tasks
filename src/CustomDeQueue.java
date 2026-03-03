/**
 * Custom Deque implementation using a circular array.
 */
public class CustomDeQueue {

    private final int capacity;
    private final int[] data;
    private int front;
    private int rear;
    private int size;

    public CustomDeQueue(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    /* ================= INSERT ================= */

    public void insertFront(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + capacity) % capacity;
        }
        data[front] = value;
        size++;
    }

    public void insertRear(int value) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }

        data[rear] = value;
        size++;
    }

    /* ================= DELETE ================= */

    public void deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        if (size == 1) { // Only one element
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
    }

    public void deleteRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        if (size == 1) { // Only one element
            front = rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity;
        }
        size--;
    }

    /* ================= PEEK ================= */

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front value: " + data[front]);
        }
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Rear value: " + data[rear]);
        }
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
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(data[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }

    /* ================= MAIN ================= */

    public static void main(String[] args) {
        CustomDeQueue deque = new CustomDeQueue(5);

        deque.insertRear(10);
        deque.insertRear(30);
        System.out.println("Insert value in rear:");
        deque.display();

        deque.insertFront(40);
        deque.insertFront(50);
        System.out.println("Insert value in front:");
        deque.display();

        deque.peekFront();
        deque.peekRear();
        System.out.println("Size: " + deque.getSize());

        System.out.println("Delete from front:");
        deque.deleteFront();
        deque.display();

        System.out.println("Delete from rear:");
        deque.deleteRear();
        deque.display();
    }
}
