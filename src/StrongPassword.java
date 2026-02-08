package SmallProject;

import java.util.Scanner;

public class StrongPassword
{

    public static boolean passwordValidation(String password)
    {

        boolean upCaseAlp = false;
        boolean smaCaseAlp = false;
        boolean special = false;
        boolean digit = false;

        if (password.length() < 8){
            return false;
        }
        String specialCharacter = "";

        for (char ch : password.toCharArray())
        {

            if (Character.isUpperCase(ch))
                upCaseAlp = true;
            else if (Character.isLowerCase(ch))
                smaCaseAlp =  true;
            else if (Character.isDigit(ch))
                digit = true;
            else if (specialCharacter.contains(String.valueOf(ch)))
                special = true;
        }
        return upCaseAlp && smaCaseAlp && special && digit;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int attempt = 3;

        while (attempt > 0) {
            System.out.print("Enter Password:");
            String password = sc.next();

            if (passwordValidation(password))
            {
                System.out.println("Strong password! OK");
                break;
            }else {
                System.out.println("Weak password. Please include:");
                System.out.println("- At least 8 characters");
                System.out.println("- Uppercase letter (A-Z)");
                System.out.println("- Lowercase letter (a-z)");
                System.out.println("- Digit (0-9)");
                System.out.println("- Special character (!@#$...)");
                attempt--;
                System.out.println("Attempts left: " + attempt);
            }
            if (attempt == 0){
                System.out.println("Don't try again ");
            }
        }

    }
}
