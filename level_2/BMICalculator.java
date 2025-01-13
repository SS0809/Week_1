import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI formula
        }
    }
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double[][] data = new double[10][3];
        System.out.println("Enter the weight (kg) and height (cm) for 10 individuals:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = scn.nextDouble(); // Weight
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = scn.nextDouble(); // Height
        }
        calculateBMI(data);
        String[] statuses = determineBMIStatus(data);

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");// "\t" is used for tab and "\n" for newline
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n", data[i][1], data[i][0], data[i][2], statuses[i]);
        }

        scn.close();
    }
}
