import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightInCm = scanner.nextDouble();

        double inches = (heightInCm / (2.54));//calculating inches
		double feet = (inches / (12)) ;//calculating feet

        System.out.printf("Your Height in cm is "+heightInCm+" while in feet is "+feet+" and inches is "+inches);

        scanner.close();
    }
}