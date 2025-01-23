import java.util.Scanner;

public class StoreValuesAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array is full. No more entries allowed.");
                break;
            }
            numbers[index] = input;
            index++;
        }
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("\nThe total sum of the numbers is: " + total);
        scanner.close();
    }
}

