/**
 * Utility class to convert uppercase characters to lowercase
 * and lowercase characters to uppercase.
 */
public class CharUpperAndLowerCase {

    /**
     * Converts uppercase letters to lowercase and vice versa.
     * Non-alphabetic characters remain unchanged.
     *
     * @param input the original string
     * @return converted string with toggled character cases
     */
    public static String toggleCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch); // keep special characters unchanged
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "pAkIs@TaN";
        String output = toggleCase(input);

        System.out.println("Original : " + input);
        System.out.println("Converted: " + output);
    }
}
