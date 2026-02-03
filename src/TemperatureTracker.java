import java.util.Scanner;

/**
 * TemperatureTracker manages temperature readings for multiple days.
 * Supports input, display, update, search, min/max, average, and reverse display.
 */
public class TemperatureTracker {

    private int[] temperatures;
    private int numberOfDays;
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Input temperature readings for given number of days.
     */
    public void inputTemperatures() {
        System.out.print("Enter number of days: ");
        numberOfDays = scanner.nextInt();
        temperatures = new int[numberOfDays];

        System.out.println("Enter temperature readings for " + numberOfDays + " days:");
        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }
        System.out.println("Temperatures stored successfully.");
    }

    /**
     * Display all temperature readings.
     */
    public void displayTemperatures() {
        System.out.println("Temperature readings:");
        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");
        }
    }

    /**
     * Update temperature for a specific day.
     * @param day Day to update (1-based)
     * @param newTemp New temperature
     */
    public void updateTemperature(int day, int newTemp) {
        if (isValidDay(day)) {
            temperatures[day - 1] = newTemp;
            System.out.println("Temperature updated successfully.");
        } else {
            System.out.println("Invalid day.");
        }
    }

    /**
     * Search and display temperature for a specific day.
     * @param day Day to search (1-based)
     */
    public void searchTemperature(int day) {
        if (isValidDay(day)) {
            System.out.println("Temperature on Day " + day + ": " + temperatures[day - 1] + "°C");
        } else {
            System.out.println("Invalid day.");
        }
    }

    /**
     * Find and display minimum and maximum temperatures.
     */
    public void displayMinMaxTemperature() {
        if (temperatures == null || temperatures.length == 0) {
            System.out.println("No temperature data available.");
            return;
        }

        int min = temperatures[0];
        int max = temperatures[0];

        for (int temp : temperatures) {
            if (temp < min) min = temp;
            if (temp > max) max = temp;
        }

        System.out.println("Minimum temperature: " + min + "°C");
        System.out.println("Maximum temperature: " + max + "°C");
    }

    /**
     * Calculate and display average temperature.
     */
    public void displayAverageTemperature() {
        if (temperatures == null || temperatures.length == 0) {
            System.out.println("No temperature data available.");
            return;
        }

        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        float average = (float) sum / numberOfDays;
        System.out.println("Average temperature: " + average + "°C");
    }

    /**
     * Display temperatures in reverse order.
     */
    public void displayReverseTemperatures() {
        if (temperatures == null || temperatures.length == 0) {
            System.out.println("No temperature data available.");
            return;
        }

        System.out.println("Temperatures in reverse order:");
        for (int i = numberOfDays - 1; i >= 0; i--) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");
        }
    }

    /**
     * Check if the day is valid (1-based index).
     */
    private boolean isValidDay(int day) {
        return day > 0 && day <= numberOfDays;
    }

    /**
     * Main menu loop for user interaction.
     */
    public void run() {
        int choice;
        do {
            System.out.println("\n---- TEMPERATURE MENU ----");
            System.out.println("1. Add temperature readings");
            System.out.println("2. Display temperatures");
            System.out.println("3. Update temperature");
            System.out.println("4. Search temperature");
            System.out.println("5. Min & Max temperature");
            System.out.println("6. Average temperature");
            System.out.println("7. Reverse temperatures");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            int day, newTemp;
            switch (choice) {
                case 1 -> inputTemperatures();
                case 2 -> displayTemperatures();
                case 3 -> {
                    System.out.print("Enter day to update: ");
                    day = scanner.nextInt();
                    System.out.print("Enter new temperature: ");
                    newTemp = scanner.nextInt();
                    updateTemperature(day, newTemp);
                }
                case 4 -> {
                    System.out.print("Enter day to search: ");
                    day = scanner.nextInt();
                    searchTemperature(day);
                }
                case 5 -> displayMinMaxTemperature();
                case 6 -> displayAverageTemperature();
                case 7 -> displayReverseTemperatures();
                case 8 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 8);

        System.out.println("Thank you for using TemperatureTracker!");
    }

    public static void main(String[] args) {
        TemperatureTracker tracker = new TemperatureTracker();
        tracker.run();
    }
}
