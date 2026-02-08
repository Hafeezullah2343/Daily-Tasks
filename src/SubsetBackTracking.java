import java.util.*;

public class SubsetBackTracking {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        int total = (int) Math.pow(2, n); // total subsets

        for (int i = 0; i < total; i++) {

            String binary = Integer.toBinaryString(i);

            // pad with leading zeros
            while (binary.length() < n) {
                binary = "0" + binary;
            }

            List<Integer> subset = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                if (binary.charAt(j) == '1') {
                    subset.add(nums[j]);
                }
            }

            result.add(subset);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}
