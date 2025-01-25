import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return; 
        }
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }
        int[] digits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }
        System.out.println("Digits in reverse order:");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        scanner.close();
    }
}

