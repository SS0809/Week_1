/*
Write a program to find and return the length of a string without using the length() method 
Hint => 
*/
import java.util.Scanner;
public class FindLength{
	// Create a method to find and return a string's length without using the built-in length() method. 
	// The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception,
	// handles the exception, and then return the count
	public static int findCount(String s){
		int count = 0 ;
		try{
			while(true){
				s.charAt(count);
				count++;
			}
		}catch(StringIndexOutOfBoundsException e){
			return count;
		}
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		//Take user input using the Scanner next() method 
		System.out.println(findCount(s));
		System.out.println(s.length());
		//The main function calls the user-defined method as well as the built-in length() method and displays the result
	}
}