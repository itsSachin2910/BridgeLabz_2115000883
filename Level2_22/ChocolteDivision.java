import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the total number of children: ");
        int numberOfChildren = scanner.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild);
        System.out.println("The number of remaining chocolates are " + remainingChocolates);

        scanner.close();
    }
}

