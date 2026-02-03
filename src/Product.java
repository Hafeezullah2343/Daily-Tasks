/**
 * Product.java
 *
 * This program finds all pairs of integers (i, j) such that i * j equals
 * a given target number. It demonstrates simple nested loops and
 * multiplication logic in Java.
 *
 * Author: Your Name
 * Date: 2026-02-01
 */

public class Product {

    public static void main(String[] args) {
        int target = 24;  // Target number to find multiplication pairs for
        int start = 1;    // Starting point for iteration

        // Iterate from target down to start
        for (int i = target; i >= start; i--) {
            // Iterate from start up to target
            for (int j = start; j <= target; j++) {
                // Check if the product of i and j equals the target
                if (i * j == target) {
                    System.out.println(j + " * " + i + " = " + target);
                    // Increment start to avoid duplicate pairs
                    start = j + 1;
                }
            }
        }
    }
}
