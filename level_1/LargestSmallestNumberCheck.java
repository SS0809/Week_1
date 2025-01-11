/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint => 
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)
*/
import java.util.Scanner;

public class LargestSmallestNumberCheck {
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int[] arr = new int[2];
		arr[0] = Math.max(number3,Math.max(number1,number2));
		arr[1] = Math.min(number3,Math.min(number1,number2));
		return arr;
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // Check if the first number is the smallest
        int[] arr = findSmallestAndLargest(number1 ,number2 ,number3);
        System.out.println("The Smallest " + arr[1]+ " The Largest " + arr[0]);
    }
}