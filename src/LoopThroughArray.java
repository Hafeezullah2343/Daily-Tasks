/**
 * Demonstrates looping through an array using a while loop.
 */
public class LoopThroughArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int index = 0;
        while (index < arr.length) {
            int value = arr[index];
            System.out.print(value + " ");
            index++;
        }
    }
}
