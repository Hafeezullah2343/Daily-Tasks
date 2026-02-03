/**
 * FactorialCalculator.java
 *
 * This program calculates the factorial of a given number using recursion.
 *
 * Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class FactorialCalculator {

    /**
     * Recursively calculates the factorial of a number.
     *
     * @param n the number to calculate factorial for
     * @return factorial of n
     */
    public static int factorial(int n) {
        if (n <= 1) {  // Base case: factorial of 0 or 1 is 1
            return 1;
        }
        return n * factorial(n - 1);  // Recursive call
    }

    public static void main(String[] args) {
        int number = 10;  // Number to calculate factorial
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
