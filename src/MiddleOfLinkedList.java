/**
 * Class representing a node in the linked list
 */
class MiddleNode {
    int data;
    MiddleNode next;

    public MiddleNode(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Class to represent a singly linked list and find its middle element
 */
public class MiddleOfLinkedList {

    private MiddleNode head;
    private MiddleNode tail;

    /**
     * Inserts a new node at the end of the linked list
     *
     * @param data the value to be inserted
     */
    public void insertAtEnd(int data) {
        MiddleNode newNode = new MiddleNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Returns the middle element of the linked list
     *
     * @return middle node's data
     */
    public int middleOfLinkedList() {
        MiddleNode slow = head;
        MiddleNode fast = head;

        // Move fast pointer twice as fast as slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();

        // Insert elements into the linked list
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        // Print the middle element
        System.out.println("Middle element: " + list.middleOfLinkedList());
    }
}
