import java.util.Scanner;

public class FirstMultipleOfSecond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        // Prompt user to enter the second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Check if the first number is a multiple of the second
        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
