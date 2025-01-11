/*
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/
import java.util.Scanner;
public class CheckPositivity{
	public static int helper(int number){
		if(number>0){//positive
			return 0;
		}
		else if(number<0){//negative
			return -1;
		}	
		else {
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		System.out.print("The method response is " + helper(number));
	}
}