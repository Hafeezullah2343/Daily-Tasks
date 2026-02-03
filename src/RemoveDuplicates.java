import java.util.Arrays;

/**
 * RemoveDuplicates.java
 *
 * This program removes duplicate elements from an integer array.
 * It first sorts the array and then removes duplicates in-place.
 *
 * Example:
 * Input:  {1, 2, 2, 3, 3, 4, 5}
 * Output: 1 2 3 4 5
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class RemoveDuplicates {

    /**
     * Removes duplicates from the given array and returns the new length.
     *
     * @param arr the input array
     * @param length the length of the array
     * @return the length of the array after removing duplicates
     */
    public static int removeDuplicates(int[] arr, int length) {
        if (length == 0 || length == 1) {
            return length;
        }

        Arrays.sort(arr); // Sort array first
        int j = 0;        // Index for unique elements
        int[] temp = new int[length];

        // Copy only unique elements to temp
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[length - 1]; // Add last element

        // Copy back to original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j; // Return new length
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5};
        int length = arr.length;

        int newLength = removeDuplicates(arr, length);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
