public class ElementOnEvenPosition {

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Loop through the array to access elements at even positions (0, 2, 4, ...)
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // Check if the index is even
                System.out.print(arr[i] + " "); // Print element at even index
            }
        }
    }
}
