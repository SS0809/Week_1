/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
*/
import java.util.Scanner;

public class UnitConvertor {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Convert Kilometers to Miles");
            System.out.println("2. Convert Miles to Kilometers");
            System.out.println("3. Convert Meters to Feet");
            System.out.println("4. Convert Feet to Meters");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Kilometers: ");
                    double km = scn.nextDouble();
                    System.out.println(km + " Kilometers = " + convertKmToMiles(km) + " Miles");
                    break;
                case 2:
                    System.out.print("Enter Miles: ");
                    double miles = scn.nextDouble();
                    System.out.println(miles + " Miles = " + convertMilesToKm(miles) + " Kilometers");
                    break;
                case 3:
                    System.out.print("Enter Meters: ");
                    double meters = scn.nextDouble();
                    System.out.println(meters + " Meters = " + convertMetersToFeet(meters) + " Feet");
                    break;
                case 4:
                    System.out.print("Enter Feet: ");
                    double feet = scn.nextDouble();
                    System.out.println(feet + " Feet = " + convertFeetToMeters(feet) + " Meters");
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Add spacing between operations
        } while (choice != 5);

        scn.close();
    }
}
