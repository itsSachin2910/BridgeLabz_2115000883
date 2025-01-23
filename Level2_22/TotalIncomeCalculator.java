import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        double salary, bonus;

        System.out.print("Enter the salary (INR): ");
        salary = scanner.nextDouble();

        System.out.print("Enter the bonus (INR): ");
        bonus = scanner.nextDouble();

        double totalIncome = salary + bonus;

        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f.%n", 
                          salary, bonus, totalIncome);

        scanner.close();
    }
}

