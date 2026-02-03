import java.util.Arrays;

/**
 * Utility class for array operations.
 */
public class Arrangment {

    /**
     * Arranges a binary array so that all 0s come first followed by 1s.
     *
     * @param array the binary array containing only 0s and 1s
     * @throws IllegalArgumentException if the array contains elements other than 0 or 1
     */
    public static void arrangeBinaryArray(int[] array) {
        int zeroCount = 0;

        // Count zeros and validate array
        for (int num : array) {
            if (num == 0) {
                zeroCount++;
            } else if (num != 1) {
                throw new IllegalArgumentException("Array must contain only 0s and 1s");
            }
        }

        // Fill zeros
        for (int i = 0; i < zeroCount; i++) {
            array[i] = 0;
        }

        // Fill ones
        for (int i = zeroCount; i < array.length; i++) {
            array[i] = 1;
        }
    }

    public static void main(String[] args) {
        int[] binaryArray = {0, 1, 0, 1, 0, 1, 0};

        System.out.println("Original Array: " + Arrays.toString(binaryArray));

        arrangeBinaryArray(binaryArray);

        System.out.println("Arranged Array: " + Arrays.toString(binaryArray));
    }
}
