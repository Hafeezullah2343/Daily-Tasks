import java.util.HashMap;
import java.util.Map;

/**
 * Counts repeated elements in an integer array.
 */
public class CountRepeatedElement {

    /**
     * Prints elements that appear more than once along with their count.
     *
     * @param array input integer array
     */
    public static void countRepeatedElements(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int value : array) {
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }

        // Print repeated elements
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};

        countRepeatedElements(arr);
    }
}
