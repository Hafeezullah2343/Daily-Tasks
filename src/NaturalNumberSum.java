/**
 * Calculates the sum of first N natural numbers.
 */
public class NaturalNumberSum {

    /**
     * Computes the sum of the first n natural numbers.
     *
     * @param n the number up to which the sum is calculated
     * @return sum of first n natural numbers
     */
    public static int calculateSum(int n) {
        // Using formula: sum = n * (n + 1) / 2
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 5; // Change this value as needed
        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
}
