import java.util.Scanner;

/**
 * Calculates the net salary based on given conditions
 */
public class NetSalary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the basic salary from user
        System.out.print("Enter Salary: ");
        int salary = scanner.nextInt();

        float netSalary;

        // Calculate net salary based on conditions
        if (salary > 20000) {
            netSalary = salary - (salary * 7.0f / 100.0f); // 7% deduction
        } else if (salary > 10000) {
            netSalary = salary - 1000; // fixed deduction
        } else {
            netSalary = salary; // no deduction
        }

        // Display the net salary
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
