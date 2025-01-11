/*
Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.Scanner;

public class Chocolates {
	public static int[] findRemainderAndQuotient(int numberOfchocolates, int numberOfChildren) {
		int[] arr = new int[2];
		//Use division operator (/) for quotient and moduli operator (%) for reminder
		arr[0] = numberOfchocolates/numberOfChildren;
		arr[1] = numberOfchocolates%numberOfChildren;
		return arr;
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number Of numberOfchocolates: ");
        int numberOfchocolates = scanner.nextInt();
        System.out.print("Enter the number Of Children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if the first number is the smallest
        int[] arr = findRemainderAndQuotient(numberOfchocolates ,numberOfChildren);
        System.out.println("The number of chocolates " + arr[0]+ " and the number of remaining chocolates " + arr[1]);
	}
}