/**
 * StringByteConstructor.java
 *
 * This program demonstrates how to create a String from a byte array.
 * It also shows how to convert the resulting string to lowercase.
 *
 * Example:
 * Input byte array: {65, 66, 67, 68, 69, 70}
 * Output: "abcdef"
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class StringByteConstructor {

    public static void main(String[] args) {
        // Create a byte array representing ASCII values
        byte[] byteArray = {65, 66, 67, 68, 69, 70}; // Corresponds to "ABCDEF"

        // Construct a string from the byte array
        String str = new String(byteArray);

        // Convert string to lowercase and print
        System.out.println("Original string: " + str);
        System.out.println("Lowercase string: " + str.toLowerCase());
    }
}
