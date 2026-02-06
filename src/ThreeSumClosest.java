import java.util.Arrays;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);//-3,-1,1,2,6

        int closestSum = nums[0] + nums[1] + nums[2];//-3+(-1)+1 = -3,,,-1+1+3=4
        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int currentSum = nums[i] + nums[left] + nums[right];//-3+(-1)+1 = -3;
                // update closest sum//-3-3
                if (Math.abs(currentSum - target) <
                        Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum; // exact match
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {2,-3,1,-1,6};
        int target = 3;
        System.out.println(threeSumClosest(nums, target)); // 2
    }
}
