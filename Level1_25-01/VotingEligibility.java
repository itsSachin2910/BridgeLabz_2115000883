import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        int[] studentAges = new int[10];
        
        // Create a Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ages of 10 students:");

        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }
        for (int i = 0; i < studentAges.length; i++) {
            int age = studentAges[i];
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        scanner.close();
    }
}

