import java.util.Arrays;
import java.util.Collections;

/**
 * SortDescendingOrder.java
 *
 * This program demonstrates how to sort an array in descending order.
 * It shows two approaches:
 * 1. Using Arrays.sort() with Collections.reverseOrder()
 * 2. Iterating the array in reverse order
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class SortDescendingOrder {

    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30, 40, 50, 60};

        // Approach 1: Using built-in sort with reverse order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted in descending order (using sort): " + Arrays.toString(arr));

        // Approach 2: Printing in reverse without sorting (if array is already sorted ascending)
        System.out.print("Sorted in descending order (manual reverse print): ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
