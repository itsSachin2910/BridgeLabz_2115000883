import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        int number1, number2;

     
        System.out.print("Enter the first number (number1): ");
        number1 = scanner.nextInt();

     
        System.out.print("Enter the second number (number2): ");
        number2 = scanner.nextInt();

      
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;

    
        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);

    
        scanner.close();
    }
}
