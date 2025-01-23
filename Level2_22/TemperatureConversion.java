import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double celsius;

        System.out.print("Enter the temperature in Celsius: ");
        celsius = scanner.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.printf("The %.2f Celsius is %.2f Fahrenheit.%n", celsius, fahrenheitResult);

        scanner.close();
    }
}

