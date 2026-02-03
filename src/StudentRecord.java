import java.util.Scanner;

/**
 * StudentRecord.java
 *
 * This program collects and displays student records including
 * name, roll number, and age.
 *
 * Author: Your Name
 * Date: 2026-02-01
 */
public class StudentRecord {

    private String name;
    private int rollNo;
    private int age;

    /**
     * Constructor to initialize student details.
     *
     * @param name   Student name
     * @param rollNo Student roll number
     * @param age    Student age
     */
    public StudentRecord(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    /**
     * Displays the student details.
     */
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        StudentRecord[] students = new StudentRecord[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline

            students[i] = new StudentRecord(name, rollNo, age);
        }

        System.out.println("\nStudent Records:");
        for (StudentRecord student : students) {
            student.display();
        }

        sc.close();
    }
}
