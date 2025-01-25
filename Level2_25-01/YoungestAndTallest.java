import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age and height for Amar, Akbar, and Anthony:");
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + " - Age: ");
            ages[i] = scanner.nextInt();
            System.out.print(names[i] + " - Height (in cm): ");
            heights[i] = scanner.nextDouble();
        }
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\nResults:");
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");
        scanner.close();
    }
}

