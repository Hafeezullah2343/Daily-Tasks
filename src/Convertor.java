/**
 * Utility class for converting character cases in a string.
 */
public class Convertor {

    /**
     * Converts lowercase characters to uppercase and
     * uppercase characters to lowercase.
     * Non-alphabetic characters remain unchanged.
     *
     * @param input the original string
     * @return converted string with toggled case
     */
    public static String convertCase(String input) {
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
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "PKStaN";
        System.out.println("Converted String: " + convertCase(input));
    }
}
