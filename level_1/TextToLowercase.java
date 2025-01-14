import java.util.Scanner;

public class TextToLowercase{
// converts the String into lower Case
  static String lowerCaseConvert(String str) {
    StringBuilder ans = new StringBuilder(""); // for appending characters one by one.
    for (int i = 0; i<str.length(); i++) { // loop through the string
      char ch = str.charAt(i); // takes ith character
      if (ch <= 90) { // compares with ascii value
        ch = (char)(ch + 32); // adds 32 for converting into small letters
      }
      ans.append(ch); // appending into the stringbuilder
    }
    return ans.toString(); // converting stringbuilder into string
  }
  
  // comparing both string and telling the output
  static boolean comparing(String str1, String str2) {
    if (str1.length() != str2.length()) { // if the length is not equal simply return false.
      return false;
    }  
    
    int j = 0; // enable counter for traversing into str2
    for (int i = 0; i<str1.length(); i++) { // for loop for traversing into str1
      if (str1.charAt(i) != str2.charAt(j)) {
        return false;
      }
      j++;
    }
    
    return true; 
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter String: ");
    String str = sc.nextLine();
    String convertViaMethod = lowerCaseConvert(str);
    String convertViaBuiltInMethod = str.toLowerCase();

    
    boolean ans = comparing(convertViaMethod, convertViaBuiltInMethod);
    
    if (ans) {
      System.out.println("Both strings are Equal. \n String 1: " + convertViaMethod + "\n String 2: " + convertViaBuiltInMethod);
    } else {
      System.out.println("Both strings are not Equal. \n String 1: " + convertViaMethod + "\n String 2: " + convertViaBuiltInMethod);
    }
  }
}
