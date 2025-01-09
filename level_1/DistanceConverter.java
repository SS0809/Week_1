import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int feet = scanner.nextInt();

        double yards = feet / 3.0;//Calculating yards
        double miles = yards / 1760.0;//Calculating miles

        System.out.print("The distance in yards and miles are " + yards +" and "+ miles+"respectively");
    }
}