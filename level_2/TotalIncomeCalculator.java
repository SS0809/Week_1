/*
Create a program to find the total income of a person by taking salary and bonus from user
Hint => 
Create a variable named salary and take user input.
Create another variable bonus and take user input.
Compute income by adding salary and bonus and print the result
I/P => salary, bonus
O/P => The salary is INR ___ and bonus is INR ___. Hence Total Income is INR ___
*/
import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take salary input from user
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Take bonus input from user
        System.out.print("Enter your bonus: ");
        double bonus = scanner.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("\nThe salary is INR " + salary + " and bonus is INR " + bonus + ".");
        System.out.println("Hence Total Income is INR " + totalIncome + " in Java");
    }
}