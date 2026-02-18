import java.util.Arrays;

public class OrderlyQueue {

    public static String orderlyQueue(String s, int k) {
        // Case 1: If k > 1, we can fully sort the string
        if (k > 1) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }

        // Case 2: If k == 1, we can only rotate the string
        String smallest = s;
        int n = s.length();
        for (int i = 1; i < n; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.compareTo(smallest) < 0) {
                smallest = rotated;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        System.out.println(orderlyQueue("bac", 1));

    }
}
