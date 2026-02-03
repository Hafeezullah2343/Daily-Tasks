/**
 * SumArray.java
 *
 * This program calculates the sum of all elements in an integer array.
 *
 * Example:
 * Input:  {1, 2, 3}
 * Output: Sum: 6
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class SumArray {

    /**
     * Calculates and prints the sum of elements in the array.
     *
     * @param arr the input array
     */
    public static void sum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        sum(arr);
    }
}
