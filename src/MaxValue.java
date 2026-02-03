import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user and read three integer values
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Find the maximum value using helper method
        int max = findMax(a, b, c);

        // Display the maximum value
        System.out.println("Maximum value: " + max);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    /**
     * Returns the maximum of three integers
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return maximum value among a, b, and c
     */
    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
