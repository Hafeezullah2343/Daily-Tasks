import java.util.HashSet;
import java.util.Scanner;

/**
 * Finds and prints numbers without repetition in an array
 */
public class NoRepeatedNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Read array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Numbers without repetition:");

        // Use HashSet to track seen numbers
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();

        for (int num : numbers) {
            if (!seen.add(num)) {
                repeated.add(num);
            }
        }

        // Print numbers that are not repeated
        for (int num : numbers) {
            if (!repeated.contains(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
