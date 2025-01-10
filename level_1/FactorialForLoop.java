import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) return;
        long fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }

        // Print the factorial
        System.out.println("The factorial of " + number + " is: " + fac);
    }
}
