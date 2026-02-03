/**
 * Problem: Reverse a 32-bit signed integer.
 * If reversing x causes overflow, return 0.
 */
public class ReverseIntegerNumber {

    /**
     * Reverses the digits of an integer safely.
     *
     * @param x the integer to reverse
     * @return the reversed integer or 0 if overflow occurs
     */
    public static int reverse(int x) {
        int rev = 0; // Initialize the reversed number

        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x = x / 10;         // Remove the last digit from x

            // Check for potential overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Positive overflow
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Negative overflow
            }

            rev = rev * 10 + digit; // Append the digit
        }

        return rev; // Return the reversed integer
    }

    public static void main(String[] args) {
        // Test cases covering all scenarios

        int[] testCases = {123, -123, 120, 0, 1534236469, -2147483648};

        for (int x : testCases) {
            System.out.println("Input: " + x + " → Reversed: " + reverse(x));
        }
    }
}
