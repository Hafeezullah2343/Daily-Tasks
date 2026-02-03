import java.util.Arrays;
import java.util.Random;

/**
 * Utility class for generating arrays with random numbers.
 */
public class AddRandomNumber {

    private static final Random RANDOM = new Random();

    /**
     * Generates an integer array of given size with random values from 0 (inclusive) to maxValue (exclusive).
     *
     * @param size     the size of the array
     * @param maxValue the maximum value for random numbers (exclusive)
     * @return an integer array filled with random numbers
     * @throws IllegalArgumentException if size is negative or maxValue is non-positive
     */
    public static int[] generateRandomArray(int size, int maxValue) {
        if (size < 0) {
            throw new IllegalArgumentException("Array size cannot be negative");
        }
        if (maxValue <= 0) {
            throw new IllegalArgumentException("Max value must be greater than 0");
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextInt(maxValue);
        }
        return array;
    }

    public static void main(String[] args) {
        int size = 5;
        int maxValue = 100;

        int[] randomNumbers = generateRandomArray(size, maxValue);

        System.out.println("Random Array: " + Arrays.toString(randomNumbers));
    }
}
