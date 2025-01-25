import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return; // Exit the program for invalid input
        }
        final int MAX_DIGITS = 10; 
        int[] digits = new int[MAX_DIGITS];
        int index = 0;
        while (number != 0 && index < MAX_DIGITS) {
            digits[index] = number % 10; 
            number /= 10;
            index++; 
        }
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; 
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

