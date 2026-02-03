import java.util.ArrayList;
import java.util.Scanner;

/**
 * NumberManager allows users to:
 * 1. Add numbers to a list
 * 2. Display all numbers
 * 3. Display even numbers
 * 4. Search for a number
 * 5. Exit the application
 */
public class NumberManager {

    private static final ArrayList<Integer> numberList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addNumbersToList(scanner);
                case 2 -> displayAllNumbers();
                case 3 -> displayEvenNumbers();
                case 4 -> searchNumber(scanner);
                case 5 -> {
                    exitApplication(scanner);
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Display the main menu
    private static void displayMenu() {
        System.out.println("\n===== Number Manager Menu =====");
        System.out.println("1. Add Numbers");
        System.out.println("2. Display All Numbers");
        System.out.println("3. Display Even Numbers");
        System.out.println("4. Search for a Number");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    // Add numbers to the list
    private static void addNumbersToList(Scanner scanner) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            numberList.add(number);
        }
        System.out.println("Numbers added successfully.");
    }

    // Display all numbers in the list
    private static void displayAllNumbers() {
        if (numberList.isEmpty()) {
            System.out.println("No numbers in the list.");
        } else {
            System.out.println("Numbers in the list: " + numberList);
        }
    }

    // Display only even numbers
    private static void displayEvenNumbers() {
        if (numberList.isEmpty()) {
            System.out.println("No numbers in the list.");
            return;
        }

        System.out.print("Even numbers: ");
        for (int number : numberList) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Search for a number in the list
    private static void searchNumber(Scanner scanner) {
        if (numberList.isEmpty()) {
            System.out.println("No numbers in the list.");
            return;
        }

        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();

        if (numberList.contains(target)) {
            System.out.println(target + " is found in the list.");
        } else {
            System.out.println(target + " is not found in the list.");
        }
    }

    // Exit the application with confirmation
    private static void exitApplication(Scanner scanner) {
        System.out.print("Do you really want to exit? (yes/no): ");
        String confirmation = scanner.next();
        if (confirmation.equalsIgnoreCase("yes")) {
            System.out.println("Exiting the application. Thank you!");
        } else {
            System.out.println("Returning to the menu...");
        }
    }
}
