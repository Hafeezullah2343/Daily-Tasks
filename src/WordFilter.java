import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Utility class for filtering Word objects based on allowed characters.
 */
public class WordFilter {

    /**
     * Filters a list of words to include only those containing allowed characters.
     *
     * @param words      List of Word objects
     * @param allowedChars Set of allowed characters
     * @return List of Word objects that contain only allowed characters
     */
    public static List<Word> filterWordsByAllowedChars(List<Word> words, Set<Character> allowedChars) {
        List<Word> filtered = new ArrayList<>();
        for (Word word : words) {
            if (word.containsOnlyAllowedChars(allowedChars)) {
                filtered.add(word);
            }
        }
        return filtered;
    }

    /**
     * Filters a list of words using Java Streams to include only allowed characters.
     *
     * @param words       List of Word objects
     * @param allowedChars Set of allowed characters
     * @return List of Word objects that contain only allowed characters
     */
    public static List<Word> filterWordsByStream(List<Word> words, Set<Character> allowedChars) {
        return words.stream()
                .filter(word -> word.containsOnlyAllowedChars(allowedChars))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Set<Character> allowedChars = Set.of('a', 'b', 'c');
        List<Word> words = List.of(
                new Word("ab"),
                new Word("db"),
                new Word("ac")
        );

        // Using traditional loop
        List<Word> filteredWords = WordFilter.filterWordsByAllowedChars(words, allowedChars);
        System.out.println("Filtered words (loop):");
        filteredWords.forEach(System.out::println);

        // Using streams
        List<Word> filteredWordsStream = WordFilter.filterWordsByStream(words, allowedChars);
        System.out.println("\nFiltered words (stream):");
        filteredWordsStream.forEach(System.out::println);
    }
}
