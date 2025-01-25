import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        final int NUM_EMPLOYEES = 10;
        final double BONUS_ABOVE_5_YEARS = 0.05;
        final double BONUS_BELOW_5_YEARS = 0.02;
        double[] salaries = new double[NUM_EMPLOYEES];
        double[] yearsOfService = new double[NUM_EMPLOYEES];
        double[] bonuses = new double[NUM_EMPLOYEES];
        double[] newSalaries = new double[NUM_EMPLOYEES];
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the salary and years of service for 10 employees:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            while (true) {
                System.out.print("Employee " + (i + 1) + " - Salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Employee " + (i + 1) + " - Years of Service: ");
                double years = scanner.nextDouble();

                if (salary > 0 && years >= 0) {  // Valid input
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input! Salary must be positive and years of service cannot be negative. Please enter again.");
                }
            }
        }
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            double bonus;
            if (yearsOfService[i] > 5) {
                bonus = salaries[i] * BONUS_ABOVE_5_YEARS;
            } else {
                bonus = salaries[i] * BONUS_BELOW_5_YEARS;
            }
            bonuses[i] = bonus;
            newSalaries[i] = salaries[i] + bonus;
            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    (i + 1), salaries[i], bonuses[i], newSalaries[i]);
        }
        System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        scanner.close();
    }
}

