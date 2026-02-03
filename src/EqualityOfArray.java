import java.util.Arrays;

public class EqualityOfArray {

    public static void main(String[] args) {
        // Initialize two arrays to compare
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {10, 20, 30, 40};

        // Compare arrays using Arrays.equals method
        boolean equality = Arrays.equals(arr1, arr2);

        // Print the result
        if (equality) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
