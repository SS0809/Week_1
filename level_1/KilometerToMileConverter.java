import java.util.Scanner;

public class KilometerToMileConverter {
    public static void main(String[] args) {
        double km = 0;
        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        // Prompt user to enter kilometers
        System.out.print("Enter distance in kilometers: ");
        // Get user input for kilometers
        km = input.nextDouble();
        // Calculate miles using the conversion factor (1 mile = 1.6 km)
        double miles = km / 1.6;
        System.out.printf(km + " km is equal to "+miles+" miles.\n");
    }
}