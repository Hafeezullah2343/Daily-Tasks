public class BeautifulArray {

    public static boolean bueatifullArray(int[] nums){

        if (nums == null || nums.length < 3) {
            return true;  // 0, 1, 2 elements are always beautiful
        }

        int n = nums.length;

        // Check all possible triples i < k < j
        for (int i = 0; i < n - 2; i++) {
            for (int k = i + 1; k < n - 1; k++) {
                for (int j = k + 1; j < n; j++) {

                    // If middle is average of left and right
                    if (nums[k] * 2 == nums[i] + nums[j]) {
                        return false;  // Not beautiful
                    }
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 4, 3};
        System.out.println(bueatifullArray(arr1));
        System.out.println(bueatifullArray(arr2));
    }
}
