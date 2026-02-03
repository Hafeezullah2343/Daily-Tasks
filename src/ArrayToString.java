/**
 * Demonstrates converting an integer array to a string
 * representation without using Arrays.toString().
 */
public class ArrayToString {

    /**
     * Converts an integer array to string format like [10, 20, 30].
     *
     * @param array the input integer array
     * @return string representation of the array
     */
    public static String arrayToString(int[] array) {
        if (array == null || array.length == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }

        builder.append("]");
        return builder.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        String result = arrayToString(numbers);
        System.out.println(result);
    }
}
