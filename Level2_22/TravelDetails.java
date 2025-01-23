import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city via which you are traveling: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

 
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        System.out.println("\nTravel Summary:");
        System.out.println("Name: " + name);
        System.out.println("Route: " + fromCity + " -> " + viaCity + " -> " + toCity);
        System.out.printf("Total Distance: %.2f miles%n", totalDistance);
        System.out.printf("Average Speed: %.2f miles/hour%n", averageSpeed);

        scanner.close();
    }
}
