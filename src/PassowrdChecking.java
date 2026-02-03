/**
 * Validates a password based on numeric and special character requirements
 */
public class PassowrdChecking {

    /**
     * Checks if a password contains at least one digit and one special character
     *
     * @param password the password to check
     * @return true if valid, false otherwise
     */
    public static boolean isValidPassword(String password) {
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[!@#$%&()*^+].*");

        return hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        String password = "Hafeez006@";

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}
