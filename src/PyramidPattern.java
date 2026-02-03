/**
 * PyramidPattern.java
 *
 * This program prints a pyramid star pattern to the console.
 * Example output for totalRows = 5:
 *
 *     *
 *    * *
 *   * * *
 *  * * * *
 * * * * * *
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class PyramidPattern {

    public static void main(String[] args) {
        int totalRows = 5;  // Total number of rows for the pyramid

        // Loop through each row
        for (int i = 1; i <= totalRows; i++) {

            // Print leading spaces for pyramid alignment
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print(" ");
            }

            // Print '*' i times with a space
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
