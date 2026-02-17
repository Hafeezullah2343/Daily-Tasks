public class SmallestAllSetBits {

    public static int smallestNumber(int n) {
        int k = 1;

        while (true) {
            int x = (1 << k) - 1;   // 2^k - 1

            if (x >= n) {
                return x;
            }

            k++;
        }
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(smallestNumber(n));
    }
}
