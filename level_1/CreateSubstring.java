/*
Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
*/
import java.util.Scanner;

public class CreateSubstring{
	//Write a method to compare two strings using the charAt() method and return a boolean result
	public static boolean CompareStringg(String s1, String s2){
		if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
		return true;
	}
	public static String SubStringByJava(String ss, int start , int end){
		return ss.substring(start,end);
	}
	//Write a method to create a substring from a string using the charAt() method with the string, 
	//start, and end index as the parameters
	public static String CreateSubstringg(String ss, int start , int end){
		String newString  = new String("");
		for (int i=0;i<ss.length() ;i++) {
			if(i>=start && i<end){
				newString+=ss.charAt(i);
			}
		}
		return newString;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Take user input using the  Scanner next() method to take the String variable and
		// also the start and the end index to get the substring from the given text
		System.out.println("Enter the string");
		String ss = scn.next();
		System.out.println("Enter the start index");
		int start = scn.nextInt();
		System.out.println("Enter the end index");
		int end = scn.nextInt();
		if(CompareStringg(SubStringByJava(ss,start,end),( CreateSubstringg(ss,start,end))))
		//if(SubStringByJava(ss,start,end).equals( CreateSubstringg(ss,start,end)))
		{
			System.out.println("equal");
		}else {
			System.out.println(CreateSubstringg(ss,start,end));
			System.out.println(SubStringByJava(ss,start,end));
			System.out.println("not equal");
		}
		//Use the String built-in method substring() to get the substring and
		// compare the two strings. And finally display the result
	}

}