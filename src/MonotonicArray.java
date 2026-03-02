public class MonotonicArray {

    public static boolean monotonic(int[] arr){


        boolean increase = false;
        boolean decrease = false;

        for (int i = 0; i < arr.length-1; i++){

            if (arr[i] < arr[i+1]){
                increase = true;
            }
            if (arr[i] > arr[i+1]){
                decrease = true;
            }
        }
        if (increase && decrease){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean result = monotonic(arr);
        if (result){
            System.out.println("monotonic");
        }else {
            System.out.println("not monotonic");
        }
    }
}
