public class FinalArray {

    public static void main(String[] args) {
        // Declare and initialize a final array
        final int[] arr1 = {10, 20, 30, 40, 50};

        // Print elements of arr1
        System.out.print("arr1 elements: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Assign arr1 reference to arr2
        int[] arr2 = arr1;

        // Print elements of arr2
        System.out.print("arr2 elements: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
