public class Factorial {

    public static void main(String[] args) {
        int factorial = 1; // Variable to store factorial result
        int number = 5;    // Number to calculate factorial for

        // Loop from 1 to 'number' to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply current factorial by i
        }

        // Print the factorial result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
