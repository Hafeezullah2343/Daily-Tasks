/**
 * Inverted Pyramid Star Pattern:
 * * * * *
 *  * * * *
 *   * * *
 *    * *
 *     *
 */
public class InvertedPyramid {

    public static void main(String[] args) {
        int totalRows = 5;

        // Loop through each row (decreasing number of stars)
        for (int i = totalRows; i >= 1; i--) {
            // Print leading spaces for pyramid alignment
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print(" ");
            }

            // Print '*' i times with space
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
