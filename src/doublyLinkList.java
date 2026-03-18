/**
 * Custom Doubly Linked List Implementation in Java.
 */
public class doublyLinkList {

    // Node class
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    /* ================= INSERTION ================= */

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtPosition(int pos, int data) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid index...");
            return;
        }
        if (pos == 0) {
            insertAtBeginning(data);
            return;
        }
        if (pos == size) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < pos; i++) current = current.next;

        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
        size++;
    }

    /* ================= DELETION ================= */

    public void deleteAtEnd() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void deleteAtBeginning() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void deleteAtPosition(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid index...");
            return;
        }
        if (pos == 0) {
            deleteAtBeginning();
            return;
        }
        if (pos == size - 1) {
            deleteAtEnd();
            return;
        }

        Node current = head;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    /* ================= SEARCH & UPDATE ================= */

    public void update(int oldValue, int newValue) {
        Node current = head;
        boolean found = false;
        while (current != null) {
            if (current.data == oldValue) {
                current.data = newValue;
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println(oldValue + " not found.");
    }

    public int getAtPosition(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid index...");
            return -1;
        }
        Node current = head;
        for (int i = 0; i < pos; i++) current = current.next;
        return current.data;
    }

    /* ================= TRAVERSAL ================= */

    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.prev;
        }
        System.out.println("Null");
    }

    /* ================= UTILITY ================= */

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return false; // Dynamic list, never full
    }

    /* ================= MAIN TEST ================= */

    public static void main(String[] args) {
        doublyLinkList list = new doublyLinkList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Forward:");
        list.displayForward();
        System.out.println("Backward:");
        list.displayBackward();

        list.insertAtPosition(1, 199);
        System.out.println("After insertion at pos 1:");
        list.displayForward();

        list.update(20, 200);
        System.out.println("After updating 20 -> 200:");
        list.displayForward();

        list.deleteAtPosition(2);
        System.out.println("After deletion at pos 2:");
        list.displayForward();

        System.out.println("Size: " + list.size());
        System.out.println("Is Empty? " + list.isEmpty());
    }
}
