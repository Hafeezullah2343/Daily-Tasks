/**
 * Number Pyramid Pattern:
 *     1
 *    12
 *   123
 *  1234
 * 12345
 */
public class NumberPyramidPattern {

    public static void main(String[] args) {
        int totalRows = 5;

        // Loop through each row
        for (int i = 1; i <= totalRows; i++) {
            // Print leading spaces for pyramid alignment
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print(" ");
            }

            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
