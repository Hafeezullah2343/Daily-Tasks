/**
 * Prints a decreasing number pattern like:
 * 4 4 4 4
 * 3 3 3
 * 2 2
 * 1
 */
public class DecreasingNumberPattern {

    public static void main(String[] args) {
        int i = 4;

        // Outer loop for each row (decreasing)
        do {
            int j = i;

            // Inner loop prints the current row number i, j times
            do {
                System.out.print(i + " ");
                j--;
            } while (j >= 1);

            // Move to next line after each row
            System.out.println();
            i--;
        } while (i >= 1);
    }
}
