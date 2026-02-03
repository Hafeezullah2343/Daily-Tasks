import java.util.Arrays;

/**
 * Utility class for array operations.
 */
public class AddElementOSpecificPosition {

    /**
     * Inserts an element at a specific position in an integer array.
     *
     * @param originalArray the original array
     * @param index         the position to insert the element
     * @param element       the element to insert
     * @return a new array with the element inserted
     * @throws IllegalArgumentException if index is out of bounds
     */
    public static int[] insertElementAt(int[] originalArray, int index, int element) {
        if (index < 0 || index > originalArray.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }

        int[] newArray = new int[originalArray.length + 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArray[i] = originalArray[i];
        }

        // Insert new element
        newArray[index] = element;

        // Copy remaining elements
        for (int i = index; i < originalArray.length; i++) {
            newArray[i + 1] = originalArray[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 50};
        int insertIndex = 2;
        int valueToInsert = 200;

        System.out.println("Original Array: " + Arrays.toString(numbers));

        int[] updatedArray = insertElementAt(numbers, insertIndex, valueToInsert);

        System.out.println("Array After Insertion: " + Arrays.toString(updatedArray));
    }
}
