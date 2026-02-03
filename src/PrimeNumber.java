/**
 * Prints all prime numbers within a specified range
 */
public class PrimeNumber {

    /**
     * Checks whether a number is prime
     *
     * @param number the number to check
     * @return true if prime, false otherwise
     */
    static boolean isPrime(int number) {
        if (number < 2) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 2;
        int end = 5; // Change this to print more primes

        // Loop through the range and print prime numbers
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
