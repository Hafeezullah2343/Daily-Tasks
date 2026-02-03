/**
 * RemoveLoopInLinkedList.java
 *
 * This program demonstrates how to detect and remove a loop
 * in a singly linked list using Floyd’s Cycle Detection Algorithm (Tortoise and Hare).
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveLoopInLinkedList {

    private Node head;
    private Node tail;

    /**
     * Adds a new node with the given value to the end of the linked list.
     *
     * @param value the value to add
     */
    public void add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    /**
     * Detects and removes a loop in the linked list if present.
     */
    public void removeLoop() {
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd's Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break; // Loop detected
            }
        }

        // If no loop, return
        if (slow != fast) {
            return;
        }

        // Find the start of the loop
        Node prev = null;
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the loop
        prev.next = null;
    }

    /**
     * Prints the linked list elements.
     */
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveLoopInLinkedList list = new RemoveLoopInLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Create a loop manually for testing (optional)
        // list.tail.next = list.head.next; // Uncomment to test loop removal

        System.out.println("Linked List before removing loop:");
        list.printList();

        list.removeLoop();

        System.out.println("Linked List after removing loop:");
        list.printList();
    }
}
