import java.util.Scanner;
public class RocketLaunchCountdown2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); 
        }
        System.out.println("Liftoff! ");
        scanner.close();
    }
}
