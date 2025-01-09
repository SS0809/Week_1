import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        System.out.println("\nThe number of chocolates each child gets is " + chocolatesPerChild);

        if (remainingChocolates > 0) {
            System.out.println("and the number of remaining chocolates are " + remainingChocolates);
        } else {
            System.out.println("and there are no remaining chocolates.");
        }

        scanner.close();
    }
}