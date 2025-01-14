/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
*/
import java.util.Scanner;
class CompareStrings{
	//Write a method to compare two strings using the charAt() method and return a boolean result
	public static boolean CompareString(String s1 , String s2){
		if(s1.length()!=s2.length())
			return false;
		for (int i=0;i<s1.length() ;i++ ) {
			if (s1.charAt(i)==s2.charAt(i)) {
				continue;		
			}else{
				return false;
			}
		}
		//Use the String Built-In method to check if the results are the same and display the result 
		return true;
	}
	public static void main(String[] args) {
		//Take user input using the  Scanner next() method for 2 String variables
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.print(CompareString(s1,s2));
	}
}