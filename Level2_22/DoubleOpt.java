import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.print("Enter value for a: ");
        a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        c = scanner.nextDouble();

        double result1 = a + b * c;    
        double result2 = a * b + c;      
        double result3 = c + a / b;       
        double result4 = a % b + c;  

        System.out.println("The results of Double Operations are:");
        System.out.printf("a + b * c = %.2f%n", result1);
        System.out.printf("a * b + c = %.2f%n", result2);
        System.out.printf("c + a / b = %.2f%n", result3);
        System.out.printf("a %% b + c = %.2f%n", result4); // Use %% to escape % in printf

        scanner.close();
    }
}

