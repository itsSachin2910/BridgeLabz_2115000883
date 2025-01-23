import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter value for a: ");
        a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        c = scanner.nextInt();

        int result1 = a + b * c;       // Multiplication (*) is performed before addition (+)
        int result2 = a * b + c;       // Multiplication (*) is performed before addition (+)
        int result3 = c + a / b;       // Division (/) is performed before addition (+)
        int result4 = a % b + c;       // Modulus (%) is performed before addition (+)

        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}

