import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3]; // [height, weight, BMI]
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);
            personData[i][0] = height;
            double weight;
            do {
                System.out.print("Enter weight in kilograms (positive value): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);
            personData[i][1] = weight;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nHeight, Weight, BMI, and Weight Status of each person:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    i + 1, personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}

