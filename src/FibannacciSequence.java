public class FibannacciSequence {

    public static void main(String[] args) {
        int a = 1; // First term of Fibonacci sequence
        int b = 1; // Second term of Fibonacci sequence
        int n = 6; // Number of terms to print

        System.out.print(a + " " + b + " "); // Print first two terms

        // Loop to calculate and print remaining terms
        for (int i = 2; i < n; i++) {
            int next = a + b; // Calculate next term
            System.out.print(next + " "); // Print next term

            // Update previous two terms
            a = b;
            b = next;
        }
    }
}
