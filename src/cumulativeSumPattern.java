/**
 * Prints a cumulative sum pattern like:
 * 1=1
 * 1+2=3
 * 1+2+3=6
 * and so on...
 */
public class cumulativeSumPattern {

    public static void main(String[] args) {
        int totalRows = 5;
        int sum;

        // Loop through each row
        for (int i = 1; i <= totalRows; i++) {
            sum = 1; // Reset sum for each row
            System.out.print("1"); // Start with 1

            // Add numbers from 2 up to i
            for (int j = 2; j <= i; j++) {
                System.out.print("+" + j);
                sum += j;
            }

            // Print the sum at the end of the row
            System.out.println("=" + sum);
        }
    }
}
