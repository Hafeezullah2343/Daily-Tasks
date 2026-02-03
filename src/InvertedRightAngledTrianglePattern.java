/**
 * Prints an inverted right-angled triangle pattern aligned to the right:
 * *****
 *  ****
 *   ***
 *    **
 *     *
 */
public class InvertedRightAngledTrianglePattern {

    public static void main(String[] args) {
        int totalRows = 5;

        // Loop through each row
        for (int i = totalRows; i >= 1; i--) {
            // Print leading spaces for alignment
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print(" ");
            }

            // Print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
