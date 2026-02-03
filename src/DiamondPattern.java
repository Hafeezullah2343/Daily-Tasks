/**
 * Diamond-like Star Pattern (Small Diamond):
 *   *
 *   * *
 *   * * *
 *   * *
 *   *
 */
public class DiamondPattern {

    public static void main(String[] args) {
        int totalRows = 3;

        // Upper half of the diamond
        for (int i = 1; i <= totalRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = totalRows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
