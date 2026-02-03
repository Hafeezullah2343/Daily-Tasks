import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ScholarshipEligibility.java
 *
 * This program determines if a student is eligible for a scholarship
 * based on GPA, completed credits, and family income.
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class ScholarshipEligibility {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input GPA
        System.out.print("Enter GPA: ");
        float gpa = Float.parseFloat(br.readLine());

        // Input completed credits
        System.out.print("Enter completed credits: ");
        int credits = Integer.parseInt(br.readLine());

        // Input family income
        System.out.print("Enter family income: ");
        int income = Integer.parseInt(br.readLine());

        // Check eligibility
        if (gpa >= 3.5 && credits >= 12 && income <= 50000) {
            System.out.println("You are eligible for the scholarship.");
        } else {
            System.out.println("You are not eligible for the scholarship.");
        }
    }
}
