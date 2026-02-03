public class DoWhileLoop {

    public static void main(String[] args) {
        int factorial = 1; // Variable to store the result of factorial
        int i = 1;         // Counter for the loop
        int number = 5;    // Number to calculate factorial for

        // Do-while loop to calculate factorial
        do {
            factorial *= i; // Multiply factorial by current counter
            i++;            // Increment counter
        } while (i <= number);

        // Print the factorial result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
