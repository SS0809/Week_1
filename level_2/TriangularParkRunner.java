import java.util.Scanner;

public class TriangularParkRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 length in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 length in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 length in meters: ");
        double side3 = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters (5000 meters)
        double totalDistanceMeters = 5000 * 1000; // 5000 m

        // Calculate number of rounds
        int numberOfRounds = (int) Math.ceil(totalDistanceMeters / perimeter);

        System.out.println("The athlete will need to complete " + numberOfRounds + " rounds to run 5 km.");
    }
}