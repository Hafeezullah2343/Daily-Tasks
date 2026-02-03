public class EvenOddNumber {

    public static void main(String[] args) {
        int n = 10; // Number to check

        // Check even/odd using bitwise AND operator
        if ((n & 1) == 0) { // If least significant bit is 0, number is even
            System.out.println("even");
        } else {
            System.out.println("odd");  // Otherwise, number is odd
        }
    }
}
