import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Error: The number must be a natural number greater than 0.");
            return;  // Exit the program
        }

        int[] evenNumbers = new int[number / 2 + 1];  // Size for even numbers
        int[] oddNumbers = new int[number / 2 + 1];   // Size for odd numbers
        int evenIndex = 0, oddIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;  // Save even number
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;   // Save odd number
                oddIndex++;
            }
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();  // Print a newline
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();  // Print a newline
        scanner.close();
    }
}

