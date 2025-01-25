import java.util.Scanner;

public class LargestDigitsDynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return; // Exit the program for invalid input
        }
        int maxDigit = 10; // Initial size of the array
        int[] digits = new int[maxDigit];
        int index = 0;
        while (number != 0) {
            // If index equals maxDigit, increase the array size
            if (index == maxDigit) {
                maxDigit += 10; // Increase maxDigit by 10
                int[] temp = new int[maxDigit]; // Create a new temp array
                System.arraycopy(digits, 0, temp, 0, digits.length); // Copy elements
                digits = temp; // Assign temp to digits
            }
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++; // Increment index
        }
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest
            }
        }
        System.out.println("Digits in the number:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit: Not applicable (only one unique digit present).");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }
        scanner.close();
    }
}

