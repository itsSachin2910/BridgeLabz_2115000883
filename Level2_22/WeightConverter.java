import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the person in pounds: ");
        double weightInPounds = scanner.nextDouble();

        double weightInKilograms = weightInPounds / 2.2;

        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.%n", 
                          weightInPounds, weightInKilograms);

        scanner.close();
    }
}

