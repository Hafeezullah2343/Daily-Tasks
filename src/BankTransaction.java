import java.util.Scanner;

/**
 * Demonstrates a simple bank transaction for withdrawals and deposits.
 */
public class BankTransaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.0; // Initial balance
        System.out.println("Welcome to Simple Bank Transaction!");
        System.out.println("Current balance: $" + balance);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();

        // Validate withdrawal
        if (withdrawAmount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
        }

        // Optional: Deposit
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();

        if (depositAmount <= 0) {
            System.out.println("Invalid deposit amount.");
        } else {
            balance += depositAmount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        }

        System.out.println("Transaction complete. Final balance: $" + balance);
        scanner.close();
    }
}
