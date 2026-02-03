import java.util.Arrays;

/**
 * Separates even and odd numbers from an array and displays them
 */
public class OddEven {

    // Method to separate and display even numbers
    public static void separateEven(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) count++;
        }

        int[] evenNumbers = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers[index++] = num;
            }
        }

        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
    }

    // Method to separate and display odd numbers
    public static void separateOdd(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) count++;
        }

        int[] oddNumbers = new int[count];
        int index = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers[index++] = num;
            }
        }

        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        // Display even and odd numbers separately
        separateEven(arr);
        separateOdd(arr);
    }
}
