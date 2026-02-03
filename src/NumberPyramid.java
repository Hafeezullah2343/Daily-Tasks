/**
 * Number Pyramid Pattern:
 *     1
 *    2 2
 *   3 3 3
 *  4 4 4 4
 * 5 5 5 5 5
 */
public class NumberPyramid {

    public static void main(String[] args) {
        int totalRows = 5;

        // Loop through each row
        for (int i = 1; i <= totalRows; i++) {
            // Print leading spaces for pyramid alignment
            for (int space = 1; space <= totalRows - i; space++) {
                System.out.print(" ");
            }

            // Print the row number i, i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
