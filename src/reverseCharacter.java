/**
 * ReverseString.java
 *
 * This program reverses the characters of a given string using
 * a two-pointer approach and StringBuffer.
 *
 * Example:
 * Input:  "ABCD"
 * Output: "DCBA"
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
class ReverseString {

    /**
     * Reverses the given string using a two-pointer approach.
     *
     * @param str the input string
     * @return the reversed string
     */
    public static String reverse(String str) {
        StringBuffer buffer = new StringBuffer(str);
        int left = 0;
        int right = buffer.length() - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = buffer.charAt(left);
            buffer.setCharAt(left, buffer.charAt(right));
            buffer.setCharAt(right, temp);

            left++;
            right--;
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}
