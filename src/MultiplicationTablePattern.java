/**
 * Multiplication Table Pattern:
 * 1 2 3 4 5
 * 2 4 6 8 10
 * 3 6 9 12 15
 * 4 8 12 16 20
 * 5 10 15 20 25
 */
public class MultiplicationTablePattern {

    public static void main(String[] args) {
        int size = 5; // Size of the multiplication table

        // Loop through each row
        for (int i = 1; i <= size; i++) {
            // Loop through each column
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + " ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
