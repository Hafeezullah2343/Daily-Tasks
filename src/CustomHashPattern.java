/**
 * Custom Pattern with # borders and inner # lines:
 * #####
 * ####*
 * #***#
 * ####*
 * #####
 */
public class CustomHashPattern {

    public static void main(String[] args) {
        int rows = 5;

        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Loop through each column
            for (int j = 0; j < rows; j++) {
                // Print '#' for borders
                if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1) {
                    System.out.print("#");
                }
                // Print '#' for specific inner rows (row 1 and row 3, columns 1 to 3)
                else if ((i == 1 || i == 3) && j >= 1 && j <= 3) {
                    System.out.print("#");
                }
                // Print '*' for other positions
                else {
                    System.out.print("*");
                }
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
