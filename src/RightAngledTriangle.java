/**
 * Right-Angled Triangle Star Pattern:
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class RightAngledTriangle {

    public static void main(String[] args) {
        int totalRows = 5;

        // Loop through each row
        for (int i = 1; i <= totalRows; i++) {
            // Print '*' i times in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line after each row
            System.out.println();
        }
    }
}
