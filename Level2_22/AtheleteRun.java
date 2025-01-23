import java.util.Scanner;

public class AtheleteRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangular park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangular park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangular park (in meters): ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;

        double totalDistance = 5 * 1000;

        double rounds = totalDistance / perimeter;

        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.%n", rounds);

        scanner.close();
    }
}

