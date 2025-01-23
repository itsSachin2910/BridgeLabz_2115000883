import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount (in INR): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.printf("The Simple Interest is INR %.2f for Principal INR %.2f, Rate of Interest %.2f%%, and Time %.2f years.%n", 
                          simpleInterest, principal, rate, time);

        scanner.close();
    }
}

