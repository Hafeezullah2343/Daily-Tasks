public class CustomSimpleQueue {

    int[] array;
    int front;
    int rear;
    int size;
    int capacity;

    CustomSimpleQueue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        array[++rear] = value;   // FIXED
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = array[front];
        front++;
        size--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CustomSimpleQueue queue = new CustomSimpleQueue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}
