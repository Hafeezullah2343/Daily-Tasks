import java.util.*;

public class CombinationsBackTracking {

    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        int k = 2;

        List<List<Character>> result = new ArrayList<>();
        backtrack(arr, k, 0, new ArrayList<>(), result);

        System.out.println(result);
    }

    static void backtrack(char[] arr, int k, int start,
                          List<Character> current,
                          List<List<Character>> result) {

        // base case: picked k elements
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        // try all possible choices
        for (int i = start; i < arr.length; i++) {

            // choose
            current.add(arr[i]);

            // explore
            backtrack(arr, k, i + 1, current, result);

            // undo (backtrack)
            current.remove(current.size() - 1);
        }
    }
}
