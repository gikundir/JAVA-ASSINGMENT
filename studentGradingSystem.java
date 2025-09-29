package AssignmentDay2;

import java.util.Scanner;

public class studentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = 0;
        int passes = 0;
        int fails = 0;
        while (true) {
            System.out.print("Enter student's marks (0-100), or -1 to finish: ");
            int marks = scanner.nextInt();

            if (marks == -1) {
                break; 
            }
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                continue;
            }
            totalStudents++;
            String grade;
            if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade: " + grade);
            if (marks >= 50) {
                passes++;
            } else {
                fails++;
            }
        }
        System.out.println("\n--- Summary Report ---");
        System.out.println("Total students: " + totalStudents);
        System.out.println("Passed: " + passes);
        System.out.println("Failed: " + fails);
        if (totalStudents > 0) {
            double passRate = (passes * 100.0) / totalStudents;
            System.out.println("Pass rate of all students:"+passRate);
        } else {
            System.out.println("No student data entered.");
        }

        scanner.close();
    }
}