import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to generate multiplication tables from 6 to 9: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4 * 10];  // 4 numbers (6 to 9) with 10 multiplications each

        int index = 0;  // To keep track of the position in the array
        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                multiplicationResult[index] = i * j;  // Store the result in the array
                index++;
            }
        }
        System.out.println("Multiplication Tables from 6 to 9:");
        index = 0;  // Reset the index for displaying the results
        for (int i = 6; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + multiplicationResult[index]);
                index++;
            }
        }
        scanner.close();
    }
}

