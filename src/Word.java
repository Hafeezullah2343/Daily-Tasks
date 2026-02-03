import java.util.Set;

/**
 * Represents a word and provides utility methods to validate its characters.
 */
public class Word {

    private final String text;

    /**
     * Constructs a Word instance with the specified text.
     *
     * @param text the word text
     */
    public Word(String text) {
        this.text = text;
    }

    /**
     * Returns the text of the word.
     *
     * @return the word text
     */
    public String getText() {
        return text;
    }

    /**
     * Checks if the word contains only characters from the allowed set.
     *
     * @param allowedChars set of allowed characters
     * @return true if all characters in the word are in the allowed set, false otherwise
     */
    public boolean containsOnlyAllowedChars(Set<Character> allowedChars) {
        for (char c : text.toCharArray()) {
            if (!allowedChars.contains(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return text;
    }
}
