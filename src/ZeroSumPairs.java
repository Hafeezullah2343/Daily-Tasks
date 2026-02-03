import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Finds all unique pairs in an array whose sum is zero.
 */
public class ZeroSumPairs {

    /**
     * Finds all unique pairs of integers in the array that sum to zero.
     *
     * @param arr Input array of integers
     * @return List of unique pairs that sum to zero
     */
    public static List<List<Integer>> findZeroSumPairs(int[] arr) {
        Arrays.sort(arr); // Sort the array for two-pointer approach
        List<List<Integer>> result = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                result.add(Arrays.asList(arr[left], arr[right]));

                int leftVal = arr[left];
                int rightVal = arr[right];

                // Skip duplicates
                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, -2, 3, -3, 0, 0, 2};
        List<List<Integer>> zeroSumPairs = findZeroSumPairs(arr);

        System.out.println("Unique pairs with sum 0: " + zeroSumPairs);
        // Output: [[-3, 3], [-2, 2], [0, 0]]
    }
}
