import java.util.Arrays;
import java.util.Comparator;

/**
 * StudentSorting.java
 *
 * This program defines a Student class and sorts an array of students
 * based on their roll numbers using a custom comparator.
 *
 * Author: Your Name
 * Date: 2026-02-01
 */

/**
 * Represents a student with roll number, name, and age.
 */
class Student {

    private int roll;
    private String name;
    private int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", Age: " + age;
    }
}

/**
 * Comparator to sort students by their roll numbers.
 */
class SortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRoll() - s2.getRoll();
    }
}

public class StudentSorting {

    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Ali", 50),
                new Student(2, "Usman", 30),
                new Student(4, "Asim", 30),
                new Student(1, "Hafeez", 20),
                new Student(5, "Khadija", 10)
        };

        // Sort students by roll number
        Arrays.sort(students, new SortByRoll());

        System.out.println("Students sorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
