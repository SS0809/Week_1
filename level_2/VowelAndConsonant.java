import java.util.Scanner;

public class VowelAndConsonant{
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
  
  // conveting vowel and consonant.
  static int[] countVowelConsonant(String text) {
    int vowels = 0, consonants = 0; 
    int[] arr = new int[2];
    
    // loop till string length
    for (int i = 0; i<text.length(); i++) {
      char ch = text.charAt(i);
      // checking if the character is vowel or not
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowels++;
      }
      else {
        consonants++;
      }
    }
    arr[0] = vowels; //storing into 0th index
    arr[1] = consonants; //storing into 1th index
    
    return arr;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String: ");
    String str = sc.nextLine();
    
    // converting string into lower case
    convertingToLowerCase(str);
    
    // counting the vowel and consonants.
    int[] ans = countVowelConsonant(str);
    
    //printing values
    System.out.println("Vowels are: " + ans[0] + " consonants are " + ans[1]);
  }
}
