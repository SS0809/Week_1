/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. 
Further for positive numbers check if the number is even or odd. 
Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less
*/
import java.util.Scanner;

public class CheckPositive {

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        return (number % 2 == 0) ? "even" : "odd";
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scn.nextInt();
        }
		for (int i = 0; i < numbers.length; i++) {
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is positive and " + isEven(numbers[i]));
            } else {
                System.out.println(numbers[i] + " is negative");
            }
        }
        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of the first and last numbers: ");
        if (result == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }
    }
}
