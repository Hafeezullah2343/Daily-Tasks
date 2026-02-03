import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Demonstrates basic operations on Java's LinkedList.
 */
public class CustomArrayLIst{

    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // ========== ADD ELEMENTS ==========
        list.add(10); // Add at end
        list.add(20);
        list.add(30);
        list.addFirst(5); // Add at beginning
        list.addLast(40); // Add at end
        list.add(2, 15);  // Add at specific index

        System.out.println("List after additions: " + list);

        // ========== REMOVE ELEMENTS ==========
        list.removeFirst();       // Remove first element
        list.removeLast();        // Remove last element
        list.remove(Integer.valueOf(20)); // Remove specific element

        System.out.println("List after removals: " + list);

        // ========== UPDATE ELEMENT ==========
        list.set(1, 99); // Update element at index 1
        System.out.println("List after update: " + list);

        // ========== SEARCH ELEMENT ==========
        int searchValue = 15;
        if (list.contains(searchValue)) {
            System.out.println(searchValue + " is found at index " + list.indexOf(searchValue));
        } else {
            System.out.println(searchValue + " is not found in the list.");
        }

        // ========== ITERATE LIST ==========
        System.out.print("Forward iteration: ");
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Backward iteration: ");
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        // ========== SIZE & EMPTY CHECK ==========
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
