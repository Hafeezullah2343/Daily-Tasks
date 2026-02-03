/**
 * SinglyLinkedList.java
 *
 * This program implements a singly linked list with operations including:
 * Insertion (beginning, end, any position), Deletion (beginning, end, any position),
 * Search, Update, Traversal, and Size check.
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
class NodeS {

    int data;
    Node next;

    public NodeS(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    /** ------------------- Insertion Methods ------------------- **/

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtPosition(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        if (index == size) {
            insertAtEnd(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    /** ------------------- Deletion Methods ------------------- **/

    public void deleteAtBeginning() {
        if (isEmpty()) return;

        head = head.next;
        if (head == null) tail = null;
        size--;
    }

    public void deleteAtEnd() {
        if (isEmpty()) return;

        if (head.next == null) {
            head = tail = null;
            size--;
            return;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current;
        size--;
    }

    public void deleteAtPosition(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Invalid index or empty list");
            return;
        }

        if (index == 0) {
            deleteAtBeginning();
            return;
        }

        if (index == size - 1) {
            deleteAtEnd();
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        size--;
    }

    public void deleteByValue(int value) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            deleteAtBeginning();
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found");
            return;
        }

        if (current.next == tail) tail = current;

        current.next = current.next.next;
        size--;
    }

    /** ------------------- Search & Update Methods ------------------- **/

    public int linearSearch(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == value) return index;
            current = current.next;
            index++;
        }
        return -1; // Not found
    }

    public void update(int oldValue, int newValue) {
        Node current = head;
        while (current != null) {
            if (current.data == oldValue) {
                current.data = newValue;
                return;
            }
            current = current.next;
        }
        System.out.println("Value not found");
    }

    /** ------------------- Utility Methods ------------------- **/

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void forwardTraversal() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /** ------------------- Main Method for Testing ------------------- **/

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.println("Forward traversal:");
        list.forwardTraversal();

        list.insertAtPosition(2, 25);
        System.out.println("After inserting 25 at index 2:");
        list.forwardTraversal();

        list.deleteAtPosition(2);
        System.out.println("After deleting element at index 2:");
        list.forwardTraversal();

        list.update(30, 35);
        System.out.println("After updating 30 to 35:");
        list.forwardTraversal();

        int pos = list.linearSearch(35);
        System.out.println("Position of 35 in the list: " + pos);

        System.out.println("Size of list: " + list.getSize());
    }
}
