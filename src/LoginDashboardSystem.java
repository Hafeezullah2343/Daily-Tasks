package SmallProject;

import java.util.Scanner;

public class LoginDashboardSystem
{

    public static void authentication(String user , String pass)
    {
        String userName = "admin";
        String password = "admin";
        int attempt = 0;

        while (attempt < 3)
        {
            if (userName.equals(user) && password.equals(pass)){
                System.out.println("Successfully login");
                dashboard();
                break;
            }else {
                attempt++;
                System.out.println("Left attempt "+(3 - attempt));
            }
        }
    }

    public static void dashboard()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n------ Dashboard ------");
            System.out.println("1. View Profile");
            System.out.println("2. Settings");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Profile: admin | Role: Administrator");
                    break;
                case 2:
                    System.out.println("Settings: [Under development]");
                    break;
                case 3:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 3);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter user name:");
        String userName = sc.next();

        System.out.print("Enter password:");
        String password = sc.next();
        authentication(userName , password);

    }
}
