
package com.example.maven_github_demo;

import java.util.Scanner;

public class GradeCalculator {

    // Method to calculate grade
    public static String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else {
            return "No Grade";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read marks from user
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Validate marks
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks!");
        } else {

            // Calculate grade
            String grade = calculateGrade(marks);

            // Display result
            System.out.println("Marks : " + marks);
            System.out.println("Grade : " + grade);
        }

        sc.close();
    }
}
