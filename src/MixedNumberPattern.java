/**
 * Mixed Number Pattern:
 * 1 2 4 6
 * 2 2 4 6
 * 3 2 4 6
 * 4 2 4 6
 */
public class MixedNumberPattern {

    public static void main(String[] args) {
        int rows = 4;

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print the first number (row index)
            System.out.print(i + " ");

            // Print the sequence 2 4 6
            for (int j = 2; j <= 6; j += 2) {
                System.out.print(j + " ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
