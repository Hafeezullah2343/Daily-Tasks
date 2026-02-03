/**
 * Prints a character pattern using consecutive uppercase letters.
 *
 * Example Output:
 * A
 * B C
 * D E F
 * G H I J
 * K L M N O
 */
public class CharacterPattern {

    /**
     * Prints a character triangle pattern.
     *
     * @param rows number of rows to print
     */
    public static void printCharacterPattern(int rows) {
        char currentChar = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printCharacterPattern(5);
    }
}
