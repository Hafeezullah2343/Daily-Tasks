/**
 * Checks whether a given value is present in an array
 */
public class PresenceOfValue {

    /**
     * Checks if the array contains the specified value
     *
     * @param arr        the array to search
     * @param checkValue the value to check
     */
    public static void checkNumber(int[] arr, int checkValue) {
        boolean isPresent = false;

        for (int num : arr) {
            if (num == checkValue) {
                isPresent = true;
                break;
            }
        }

        System.out.println(checkValue + " is " + isPresent + " present in the array.");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int checkValue = 201;

        checkNumber(arr, checkValue);
    }
}
