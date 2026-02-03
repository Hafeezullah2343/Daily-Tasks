/**
 * Demonstrates the use of nested loops to print a pattern
 */
public class NestedLoop {

    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 2; i++) {
            // Inner loop for columns
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
