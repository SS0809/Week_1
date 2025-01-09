import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        double weightInKg = weightInPounds * 2.2; //calculating weightInKg

        System.out.print("The weight of "+weightInPounds+" pounds is "+weightInKg+" kilograms.%n");
    }
}