import java.util.Arrays;

/**
 * Utility class for array operations.
 */
public class AddElementArray {

    /**
     * Adds an element to the end of an integer array.
     *
     * @param originalArray the original array
     * @param elementToAdd  the element to add
     * @return a new array with the added element
     */
    public static int[] addElement(int[] originalArray, int elementToAdd) {
        int length = originalArray.length;
        int[] newArray = new int[length + 1];

        // Copy original elements
        for (int i = 0; i < length; i++) {
            newArray[i] = originalArray[i];
        }

        // Add new element at the end
        newArray[length] = elementToAdd;
        return newArray;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int valueToAdd = 100;

        int[] updatedArray = addElement(numbers, valueToAdd);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Updated Array:  " + Arrays.toString(updatedArray));
    }
}
