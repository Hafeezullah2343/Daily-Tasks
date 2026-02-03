import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a node in the linked list
 */
class PalindromeNode {
    int data;
    PalindromeNode next;

    public PalindromeNode(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Class to represent a singly linked list and check if it's a palindrome
 */
public class PalindromInLinkedList {

    private PalindromeNode head;
    private PalindromeNode tail;

    /**
     * Inserts a new node at the end of the linked list
     *
     * @param data value to insert
     */
    public void insertAtEnd(int data) {
        PalindromeNode newNode = new PalindromeNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Checks whether the linked list is a palindrome
     *
     * @return true if palindrome, false otherwise
     */
    public boolean isPalindrome() {
        List<Integer> values = new ArrayList<>();
        PalindromeNode current = head;

        while (current != null) {
            values.add(current.data);
            current = current.next;
        }

        int left = 0;
        int right = values.size() - 1;

        while (left < right) {
            if (!values.get(left).equals(values.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromInLinkedList list = new PalindromInLinkedList();

        // Insert elements into the linked list
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(3);
        list.insertAtEnd(2);
        list.insertAtEnd(1);

        // Check and display if the list is palindrome
        if (list.isPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
