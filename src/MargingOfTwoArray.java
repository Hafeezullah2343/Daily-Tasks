import java.util.Arrays;

/**
 * Demonstrates merging of two integer arrays in Java.
 */
public class MargingOfTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        // Create array to hold merged elements
        int[] merged = new int[arr1.length + arr2.length];

        // Method 1: Using loops
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged using loops: ");
        for (int val : merged) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Method 2: Using System.arraycopy
        int[] merged2 = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged2, 0, arr1.length);
        System.arraycopy(arr2, 0, merged2, arr1.length, arr2.length);

        System.out.println("Merged using System.arraycopy: " + Arrays.toString(merged2));
    }
}
