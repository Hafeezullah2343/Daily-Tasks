import java.util.Scanner;

/**
 * Calculates the total salary including bonus based on employee grade.
 */
public class SalaryCalculator {

    /**
     * Computes the bonus based on salary and grade.
     *
     * @param salary Employee's base salary
     * @param grade Employee's grade
     * @return Calculated bonus
     */
    public static double calculateBonus(int salary, int grade) {
        return grade > 15 ? salary * 0.5 : salary * 0.25;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base salary: ");
        int salary = scanner.nextInt();

        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();

        double bonus = calculateBonus(salary, grade);
        double totalSalary = salary + bonus;

        System.out.println("Total salary including bonus: " + totalSalary);
        scanner.close();
    }
}
