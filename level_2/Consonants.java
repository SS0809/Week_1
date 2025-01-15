/*
Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
*/
import java.util.Scanner;
 
public class Consonants{
  static String convertingToLowerCase(String str) {
    StringBuilder ans = new StringBuilder(""); // for appending characters one by one.
    for (int i = 0; i<str.length(); i++) { 
      char ch = str.charAt(i); 
      if (ch <= 90 && ch >64) { 
        ch = (char)(ch + 32); // adds 32 for converting into small letters
      }
      ans.append(ch); // appending into the stringbuilder
    }
    return ans.toString(); // converting stringbuilder into string
  }
 
  static int[] countVowelConsonant(String text) {
    int vowels = 0, consonants = 0;
    int[] arr = new int[2];
    for (int i = 0; i<text.length(); i++) {
      char ch = text.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
      }
      else {
        consonants++;
      }
    }
    arr[0] = vowels;
    arr[1] = consonants;
    return arr;
  }
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
 
    convertingToLowerCase(str);
 
    int[] ans = countVowelConsonant(str);
    System.out.println("Vowels are: " + ans[0] + " consonants are " + ans[1]);
  }
}