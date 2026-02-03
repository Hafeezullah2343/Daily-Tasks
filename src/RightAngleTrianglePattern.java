/**
 * Prints a simple right-angled triangle pattern using asterisks
 */
public class RightAngleTrianglePattern {

    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print '*' i times in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
