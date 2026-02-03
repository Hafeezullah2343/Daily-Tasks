public class MaxNumber {

    /**
     * Returns the maximum of two numbers
     *
     * @param n1 first number
     * @param n2 second number
     * @return the greater of n1 and n2
     */
    public static int maxNumber(int n1, int n2) {
        return (n1 > n2) ? n1 : n2;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 30;
        int n3 = 40;

        // Using maxNumber method for two numbers
        int max = maxNumber(n1, n2);
        System.out.println("Max of n1 and n2: " + max);

        // Using ternary operator for two numbers
        max = (n1 > n2) ? n1 : n2;
        System.out.println("Max of n1 and n2 (ternary): " + max);

        // Using nested ternary operator for three numbers
        max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.println("Max of n1, n2, and n3: " + max);
    }
}
