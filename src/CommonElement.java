/**
 * Finds a common element between two integer arrays.
 */
public class CommonElement {

    /**
     * Returns the first common element found in both arrays.
     *
     * @param first  first integer array
     * @param second second integer array
     * @return common element if found, otherwise -1
     */
    public static int findCommonElement(int[] first, int[] second) {
        if (first == null || second == null) {
            return -1;
        }

        for (int value1 : first) {
            for (int value2 : second) {
                if (value1 == value2) {
                    return value1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 70, 60, 20};

        int result = findCommonElement(arr1, arr2);
        System.out.println("Common Element: " + result);
    }
}
