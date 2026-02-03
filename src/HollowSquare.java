/**
 * Hollow Square Star Pattern:
 *  *  *  *  *  *
 *  *           *
 *  *           *
 *  *           *
 *  *  *  *  *  *
 */
public class HollowSquare {

    public static void main(String[] args) {
        int size = 5; // Size of the square

        // Loop through each row
        for (int i = 1; i <= size; i++) {
            // Loop through each column
            for (int j = 1; j <= size; j++) {
                // Print '*' for borders, space for inside
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
