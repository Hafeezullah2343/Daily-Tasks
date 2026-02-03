public class MagicNumber {

    /**
     * Calculates the sum of digits of a number
     *
     * @param num the number whose digits will be summed
     * @return sum of digits
     */
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add last digit to sum
            num /= 10;        // Remove last digit
        }
        return sum;
    }

    /**
     * Checks if a number is a magic number
     * A magic number is a number whose repeated sum of digits reduces to 1
     *
     * @param num the number to check
     * @return true if magic number, false otherwise
     */
    public static boolean isMagicNumber(int num) {
        while (num > 9) {
            num = sumOfDigits(num); // Reduce number by summing its digits
        }
        return num == 1; // Magic number if final sum is 1
    }

    public static void main(String[] args) {
        System.out.println("Magic numbers between 1 and 20:");

        // Loop through numbers from 1 to 20 and print magic numbers
        for (int i = 1; i <= 20; i++) {
            if (isMagicNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
