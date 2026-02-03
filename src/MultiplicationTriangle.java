/**
 * Multiplication Triangle Pattern:
 * 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 * 5 10 15 20 25
 * 6 12 18 24 30 36
 */
public class MultiplicationTriangle {

    public static void main(String[] args) {
        int totalRows = 6;

        // Loop through each row
        for (int i = 1; i <= totalRows; i++) {
            // Print multiplication values for the row
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
