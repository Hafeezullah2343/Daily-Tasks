/**
 * Utility class to count vowels in a string.
 */
public class CountVowalNumber {

    /**
     * Checks whether a character is a vowel.
     *
     * @param ch input character
     * @return true if vowel, otherwise false
     */
    private static boolean isVowel(char ch) {
        ch = Character.toUpperCase(ch);
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    /**
     * Counts the number of vowels in a given string.
     *
     * @param text input string
     * @return number of vowels
     */
    public static int countVowels(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (isVowel(text.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Sarhad University Peshawar";
        System.out.println("Vowel Count: " + countVowels(input));
    }
}
