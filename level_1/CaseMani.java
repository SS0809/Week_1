/*
Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result
*/
import java.util.Scanner;
public class CaseMani{
	public static String toUpperCasee(String s){
		String temp = "";
		for(int i=0; i< s.length();i++){
			//a-65
			//A-97
			int ch = (int)s.charAt(i);
			if(ch>= 97 &&ch<=122)
			{
				ch-=32;
			}
			temp=temp + (char)ch;
		}
		return temp;
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		System.out.print(toUpperCasee(s1));
	}
}