import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        double[][] studentMarks = new double[numberOfStudents][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                double marks;
                do {
                    System.out.print("Enter marks in " + subject + " (0-100): ");
                    marks = scanner.nextDouble();
                    if (marks < 0 || marks > 100) {
                        System.out.println("Marks must be between 0 and 100.");
                    }
                } while (marks < 0 || marks > 100);
                studentMarks[i][j] = marks;
            }
            double totalMarks = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2];
            percentages[i] = totalMarks / 3;
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        System.out.println("\nMarks, Percentage, and Grade of each student:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student %d: Physics = %.2f, Chemistry = %.2f, Maths = %.2f, Percentage = %.2f%%, Grade = %s%n",
                    i + 1, studentMarks[i][0], studentMarks[i][1], studentMarks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}

