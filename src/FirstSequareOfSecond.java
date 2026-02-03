import java.util.Scanner;

public class FirstSequareOfSecond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        // Check if the second number is the square of the first
        if (n1 * n1 == n2) {
            System.out.println(n2 + " is the square of " + n1);
        } else {
            System.out.println(n2 + " is not the square of " + n1);
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
