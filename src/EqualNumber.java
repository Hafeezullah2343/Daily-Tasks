import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualNumber {

    /**
     * Compares two numbers and prints true if they are not equal, false otherwise
     *
     * @param num1 first number
     * @param num2 second number
     */
    public static void equalNumber(int num1, int num2) {
        if (num1 != num2) {
            System.out.println("true");  // Numbers are not equal
        } else {
            System.out.println("false"); // Numbers are equal
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt and read first number
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(br.readLine());

        // Prompt and read second number
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(br.readLine());

        // Call method to check equality
        equalNumber(num1, num2);

        br.close(); // Close BufferedReader to prevent resource leak
    }
}
