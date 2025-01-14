/*
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/

import java.util.Scanner;
public class AllCharacter{
	public static boolean isEqual(char[] c1 ,char[] c2){
	// compare the result with the String built-in toCharArray() method, and display the result
		if(c1.length!=c2.length)
			return false;
		for (int i=0;i<c1.length ;i++ ) {
			if(c1[i]!=c2[i])
				return false;	
		}
		return true;
	}
	//Write a program to return all the characters in a string using the user-defined method, 
	public static char[] userdefined(String s){
		char ch[] = new char[s.length()];
		for (int i=0;i<s.length() ;i++) {
			ch[i] = s.charAt(i);
		}
		return ch;
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String ss = scn.nextLine();
		System.out.print(isEqual(userdefined(ss),ss.toCharArray()));//char array is returned 
	}
}