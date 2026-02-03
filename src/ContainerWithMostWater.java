public class ContainerWithMostWater {


    public static int maxWater(int[] container){

        int left = 0;
        int right =  container.length-1;
        int maxWater = 0;


        while(left<right){

            int height = Math.min(container[left], container[right]);
            int width = right - left;
            int water = height * width;

            maxWater = Math.max(maxWater,water);

            if (container[left] < container[right]){
                left++;
            }else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(height));
    }
}
