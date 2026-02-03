import java.util.Arrays;

public class FindIndexOfElement {

    /**
     * Finds the index of a given element in the array.
     * Uses binary search; array must be sorted.
     *
     * @param arr     the array to search
     * @param element the element to find
     * @return the index of the element if found, otherwise -1
     */
    public static int findIndex(int[] arr, int element) {
        // Perform binary search
        int index = Arrays.binarySearch(arr, element);

        // If element is not found, binarySearch returns negative value
        return (index < 0) ? -1 : index;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Sorted array
        int element = 20;                 // Element to search

        int index = findIndex(arr, element); // Call method to find index

        // Print the index of the element
        System.out.println("Index of " + element + " is: " + index);
    }
}
