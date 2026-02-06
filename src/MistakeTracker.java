import java.util.*;

public class MistakeTracker {

    /**
     * MistakeTracker tracks typing mistakes in a session.
     * It records how many times each character was mistyped and provides statistics.
     */
    private final Map<Character, Integer> counts = new HashMap<>();

    /**
     * Record a mistake for the given character.
     * @param c the character typed incorrectly
     */
    public void recordMistake(char c) {
        counts.put(c, counts.getOrDefault(c, 0) + 1);
    }

    /**
     * @return total number of mistakes in this session
     */
    public int getTotalMistakes() {
        return counts.values().stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * @return the character with the most mistakes
     */
    public Optional<Character> getProblemCharacters() {
        return counts.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }

    /**
     * Reset all mistakes (start of a new session)
     */
    public void reset() {
        counts.clear();
    }

    /**
     * Get mistakes count per character
     */
    public Map<Character, Integer> getMistakeCounts() {
        return Map.copyOf(counts); // immutable copy for safety
    }

    /**
     * Demonstration main method
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MistakeTracker tracker = new MistakeTracker();

        // Sample text for typing
        String textToType = "HELLO";

        System.out.println("Type the following text:");
        System.out.println(textToType);

        for (int i = 0; i < textToType.length(); i++) {
            System.out.print("Character " + (i + 1) + ": ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("No input entered. Counting as mistake.");
                tracker.recordMistake(textToType.charAt(i));
                continue;
            }

            char typedChar = input.charAt(0);
            char expectedChar = textToType.charAt(i);

            if (typedChar != expectedChar) {
                System.out.println("Incorrect! Expected: " + expectedChar);
                tracker.recordMistake(expectedChar);
            } else {
                System.out.println("Correct!");
            }
        }

        // Show results
        System.out.println("\nTyping session complete!");
        System.out.println("Total mistakes: " + tracker.getTotalMistakes());

        tracker.getProblemCharacters().ifPresentOrElse(
                c -> System.out.println("Most problematic character: " + c),
                () -> System.out.println("No mistakes!")
        );

        System.out.println("\nMistakes per character:");
        tracker.getMistakeCounts().forEach((c, count) ->
                System.out.println(c + " : " + count)
        );

        scanner.close();
    }
}
