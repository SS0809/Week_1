/*
Create a program to swap two numbers 
Hint => 
Create a variable number1 and take user input.
Create a variable number2 and take user input.
Swap number1 and number2  and print the swapped output
I/P => number1, number2
O/P => The swapped numbers are  ___ and ___
*/
import java.util.Scanner;

public class NumberSwaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for number1
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        // Take user input for number2
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Swap numbers using Addition and Substraction
        number1 = number1 + number2;
		number2 = number1 - number2;
        number1 = number1 - number2;

        // Print swapped numbers
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        scanner.close();
    }
}