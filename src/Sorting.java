/**
 * Sorting.java
 *
 * This program sorts an integer array in ascending order using a simple
 * comparison-based sorting algorithm (Selection Sort).
 *
 * Example:
 * Input:  {3, 2, 4, 6, 5, 1}
 * Output: 1 2 3 4 5 6
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class Sorting {

    /**
     * Sorts the given array in ascending order using selection sort.
     *
     * @param arr the array to sort
     */
    public static void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 5, 1};

        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        sortAscending(arr);

        System.out.println("Array after sorting in ascending order:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
