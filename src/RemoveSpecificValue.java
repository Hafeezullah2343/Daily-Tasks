/**
 * RemoveSpecificValue.java
 *
 * This program removes an element at a specified index from an integer array.
 *
 * Example:
 * Input:  {10, 20, 30, 40, 50, 60}, remove index = 0
 * Output: 20 30 40 50 60
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class RemoveSpecificValue {

    /**
     * Removes the element at the specified index from the array.
     *
     * @param arr the input array
     * @param indexToRemove the index of the element to remove
     * @return a new array with the specified element removed
     */
    public static int[] removeSpecificValue(int[] arr, int indexToRemove) {
        if (arr == null || indexToRemove < 0 || indexToRemove >= arr.length) {
            return arr; // Return original array if index is invalid
        }

        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == indexToRemove) {
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int indexToRemove = 0;

        arr = removeSpecificValue(arr, indexToRemove);

        System.out.print("Array after removing index " + indexToRemove + ": ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
