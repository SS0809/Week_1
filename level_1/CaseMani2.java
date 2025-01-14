/*
Write a program to convert the complete text to lowercase and compare the results
Hint => 

*/
import java.util.Scanner;
public class CaseMani2{
	//Write a method to compare two strings using the ch-arAt() method and return a boolean result
	public static boolean compareCase(String s1, String s2){
		//Write a program to split the text into words and return the words along with their lengths in a 2D array
		if((int)s1.charAt(1)!=(int)s2.charAt(1))
			return false;
		return true;
	}
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
		//Take user input using the  Scanner nextLine() method to take the complete text into a String variable
		String s1 = scn.nextLine();
		//In the main() use the String built-in method toUpperCase() to get the Uppercase Text 
		//and compare the two strings using the user-defined method. And finally display the result
		if(compareCase(toUpperCasee(s1),s1.toUpperCase()))
			System.out.println("equal");
	}
}