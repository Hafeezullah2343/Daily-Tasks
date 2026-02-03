import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElectrecityBill {

    public static void main(String[] args) throws IOException {
        float unit;        // Variable to store the number of units consumed
        float totalBill = 0; // Variable to store the total bill

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt user to enter electricity units
        System.out.print("Enter Units: ");
        unit = Float.parseFloat(br.readLine());

        // Calculate bill based on units
        if (unit <= 300) {
            totalBill = unit * 2;          // Rate: 2 per unit for <= 300 units
        } else if (unit <= 500) {          // unit > 300 and <= 500
            totalBill = unit * 5;          // Rate: 5 per unit
        } else {                           // unit > 500
            totalBill = unit * 7;          // Rate: 7 per unit
        }

        totalBill += 150; // Fixed surcharge added to all bills

        // Apply 5% surcharge if total exceeds 2000
        if (totalBill > 2000) {
            totalBill += totalBill * 0.05f; // 5% additional charge
        }

        // Display the total bill
        System.out.println("Total Bill: " + totalBill);
    }
}
