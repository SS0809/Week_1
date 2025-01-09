import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in ches): ");
        double baseInches = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in ches): ");
        double heightInches = scanner.nextDouble();

        // Calculate area in square inches
        double areaSquareInches = calculateArea(baseInches, heightInches);

        // Convert inches to centimeters (1 inch = 2.54 cm)
        double baseCentimeters = baseInches * 2.54;
        double heightCentimeters = heightInches * 2.54;

        // Calculate area in square centimeters
        double areaSquareCentimeters = calculateArea(baseCentimeters, heightCentimeters);

        System.out.printf("Area of the triangle in square inches: %.2f%n", areaSquareInches);
        System.out.printf("Area of the triangle in square centimeters: %.2f cm^2%n", areaSquareCentimeters);

        scanner.close();
    }

    private static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}