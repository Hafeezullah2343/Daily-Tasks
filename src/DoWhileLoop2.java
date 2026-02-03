import java.util.Scanner;

public class DoWhileLoop2 {

    public static void main(String[] args) {
        char ch; // Variable to store user input
        Scanner sc = new Scanner(System.in);

        // Do-while loop continues until user enters 'n'
        do {
            System.out.print("Enter value: ");
            // Read the first character of the input
            ch = sc.next().charAt(0);
        } while (ch != 'n'); // Loop terminates if input is 'n'

        sc.close(); // Close the scanner to prevent resource leak
    }
}
