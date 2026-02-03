import java.util.Arrays;

/**
 * Demonstrates different ways to get the length of an array in Java.
 */
public class LengthOfArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // 1. Using length property
        System.out.println("Length using property: " + arr.length);

        // 2. Using loop (manual count)
        int count = 0;
        for (int value : arr) {
            count++;
        }
        System.out.println("Length using loop: " + count);

        // 3. Using Streams
        long size = Arrays.stream(arr).count();
        System.out.println("Length using Streams: " + size);
    }
}
