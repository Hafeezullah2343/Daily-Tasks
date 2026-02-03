public class JaggedArray {

    public static void main(String[] args) {
        // Initialize individual arrays of different lengths
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60};
        int[] arr3 = {110, 120, 130};

        // Create a jagged array (array of arrays)
        int[][] jaggedArray = {arr1, arr2, arr3};

        // Loop through each row of the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            // Loop through each element of the current row
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " "); // Print element
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
