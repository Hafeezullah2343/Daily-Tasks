/**
 * RatioOfNumbers.java
 *
 * This program calculates the count of positive, negative,
 * and zero numbers in an integer array.
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class RatioOfNumbers {

    private int positiveCount = 0;
    private int negativeCount = 0;
    private int zeroCount = 0;

    /**
     * Calculates and prints the count of positive, negative, and zero numbers.
     *
     * @param arr the input array of integers
     */
    public void calculateRatio(int[] arr) {
        for (int num : arr) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zero numbers: " + zeroCount);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, -1, -2, 0, 0, 3, -5, 0};

        RatioOfNumbers ratioCalculator = new RatioOfNumbers();
        ratioCalculator.calculateRatio(numbers);
    }
}
