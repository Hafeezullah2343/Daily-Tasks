/**
 * Implementation of a Circular Singly Linked List.
 */
class CircularNode {
    int data;
    CircularNode next;

    CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {

    private CircularNode head;
    private CircularNode tail;
    private int size;

    /**
     * Inserts a node at the beginning of the list.
     */
    public void insertAtBeginning(int data) {
        CircularNode newNode = new CircularNode(data);

        if (isEmpty()) {
            head = tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    /**
     * Inserts a node at the end of the list.
     */
    public void insertAtEnd(int data) {
        CircularNode newNode = new CircularNode(data);

        if (isEmpty()) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    /**
     * Inserts a node at a specific position.
     */
    public void insertAtPosition(int position, int data) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        if (position == size) {
            insertAtEnd(data);
            return;
        }

        CircularNode newNode = new CircularNode(data);
        CircularNode current = head;

        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    /**
     * Deletes the first node.
     */
    public void deleteAtBeginning() {
        if (isEmpty()) return;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    /**
     * Deletes the last node.
     */
    public void deleteAtEnd() {
        if (isEmpty()) return;

        if (size == 1) {
            head = tail = null;
        } else {
            CircularNode current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = head;
            tail = current;
        }
        size--;
    }

    /**
     * Searches for a value in the list.
     */
    public boolean search(int key) {
        if (isEmpty()) return false;

        CircularNode current = head;
        do {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    /**
     * Returns the size of the list.
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the list is empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Displays the circular linked list.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        CircularNode current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);
        list.insertAtPosition(2, 15);

        list.display();

        list.deleteAtBeginning();
        list.deleteAtEnd();

        list.display();

        System.out.println("Search 20: " + list.search(20));
        System.out.println("Size: " + list.size());
    }
}
