import java.util.Arrays;

/**
 * RemoveSameValues.java
 *
 * This program removes consecutive duplicate values from an integer array
 * and prints the array after removing duplicates.
 *
 * Example:
 * Input:  {1, 2, 3, 4, 4, 4, 5, 5, 6, 3}
 * Output: 1 2 3 4 5 6 3
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class RemoveSameValues {

    /**
     * Removes consecutive duplicate values from the array.
     *
     * @param arr the input array
     * @return a new array with consecutive duplicates removed
     */
    public static int[] removeConsecutiveDuplicates(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int index = 0;
        int[] temp = new int[arr.length];

        temp[index++] = arr[0]; // Add first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[index++] = arr[i];
            }
        }

        return Arrays.copyOf(temp, index); // Return array of correct length
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 5, 6, 3};

        int[] result = removeConsecutiveDuplicates(arr);

        System.out.println("Array after removing consecutive duplicates:");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
