import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = calculateTotalPrice(unitPrice, quantity);

        System.out.print("The total purchase price is INR "+totalPrice+" and the quantity is "+quantity+" an unit price is INR " + unitPrice);
    }

    private static double calculateTotalPrice(double unitPrice, int quantity) {//funtion to create total price
        return unitPrice * quantity;
    }
}