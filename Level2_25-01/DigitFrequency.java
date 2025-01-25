import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Initialize a frequency array of size 10
        int[] frequency = new int[10];

        // Find the digits in the number and update the frequency array
        long temp = Math.abs(number); // Handle negative numbers
        while (temp > 0) {
            int digit = (int) (temp % 10); // Extract the last digit
            frequency[digit]++;           // Increment the frequency of the digit
            temp /= 10;                   // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Digit frequencies in the number:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.printf("Digit %d: %d times%n", i, frequency[i]);
            }
        }

        scanner.close();
    }
}

