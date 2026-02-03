/**
 * Custom Stack implementation using an array.
 */
public class CustomStack {

    private final int[] data;
    private int top;
    private final int capacity;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
        this.top = -1;
    }

    /* ================= PUSH ================= */
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        data[++top] = value;
    }

    /* ================= POP ================= */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return data[top--]; // Return top and then decrement
    }

    /* ================= PEEK ================= */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return data[top];
    }

    /* ================= CLEAR ================= */
    public void clear() {
        top = -1;
    }

    /* ================= SIZE ================= */
    public int size() {
        return top + 1;
    }

    /* ================= EMPTY / FULL ================= */
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    /* ================= DISPLAY ================= */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack elements (top -> bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /* ================= MAIN ================= */
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());

        stack.pop();
        stack.display();

        stack.clear();
        stack.display();
    }
}
