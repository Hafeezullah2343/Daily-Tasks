import java.util.Scanner;

/**
 * Demonstrates a simple while-loop input until user types "exit".
 */
public class InputLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Type anything. Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter input: ");
            userInput = scanner.next();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("You entered: " + userInput);
        }

        System.out.println("Program terminated. Last input: " + userInput);
        scanner.close();
    }
}
