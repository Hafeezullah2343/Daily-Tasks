/**
 * Prints all 3-digit combinations where each digit ranges from 1 to 3:
 * 111   112   113   121   122   123   131   132   133
 * 211   212   213   221   222   223   231   232   233
 * 311   312   313   321   322   323   331   332   333
 */
public class ThreeDigitCombinations {

    public static void main(String[] args) {
        int range = 3;

        // Loop through each digit
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= range; j++) {
                for (int k = 1; k <= range; k++) {
                    System.out.print(i + "" + j + "" + k + "   ");
                }
            }
            System.out.println();
        }
    }
}
