/*
Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.Scanner;

public class ReminderQuotient {
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int[] arr = new int[2];
		//Use division operator (/) for quotient and moduli operator (%) for reminder
		arr[0] = number/divisor;
		arr[1] = number%divisor;
		return arr;
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int number2 = scanner.nextInt();

        // Check if the first number is the smallest
        int[] arr = findRemainderAndQuotient(number1 ,number2);
        System.out.println("The Quotient " + arr[0]+ " The Reminder " + arr[1]);
	}
}