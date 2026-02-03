/**
 * WordValidator validates typed words against expected words.
 * Supports case-sensitive or case-insensitive validation.
 */
public final class WordValidator {

    private final boolean caseSensitive;

    /**
     * Constructs a WordValidator.
     *
     * @param caseSensitive whether validation should be case-sensitive
     */
    public WordValidator(boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    /**
     * Checks if a typed character matches the expected character.
     *
     * @param expected expected character
     * @param typed typed character
     * @return true if characters match based on case sensitivity, false otherwise
     */
    public boolean isCharCorrect(char expected, char typed) {
        return caseSensitive
                ? expected == typed
                : Character.toLowerCase(expected) == Character.toLowerCase(typed);
    }

    /**
     * Checks if a partially typed string matches the beginning of the expected string.
     *
     * @param expected the full expected word
     * @param typedSoFar the portion typed so far
     * @return true if typedSoFar matches the beginning of expected, false otherwise
     */
    public boolean isPartialCorrect(String expected, String typedSoFar) {
        if (typedSoFar.length() > expected.length()) {
            return false;
        }

        for (int i = 0; i < typedSoFar.length(); i++) {
            if (!isCharCorrect(expected.charAt(i), typedSoFar.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the typed word exactly matches the expected word.
     *
     * @param expected the expected word
     * @param typed the typed word
     * @return true if words match exactly, false otherwise
     */
    public boolean isWordCorrect(String expected, String typed) {
        if (expected.length() != typed.length()) {
            return false;
        }

        for (int i = 0; i < expected.length(); i++) {
            if (!isCharCorrect(expected.charAt(i), typed.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns the index of the first incorrect character in the typed word.
     *
     * @param expected the expected word
     * @param typed the typed word
     * @return index of the first mismatch, or -1 if no mistakes found
     */
    public int firstMistakeIndex(String expected, String typed) {
        int length = Math.min(expected.length(), typed.length());

        for (int i = 0; i < length; i++) {
            if (!isCharCorrect(expected.charAt(i), typed.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
