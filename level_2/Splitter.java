/*
Write a program to split the text into words, compare the result with the split() method and display the result 
Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to find the length of the String without using the built-in length() method. 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
*/
import java.util.*;

public class Splitter {

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception will be thrown when we reach end of string
        }
        return count;
    }

    // Method to split text into words without using split()
    public static String[] splitIntoWords(String text) {
        // First count words to determine array size
        int wordCount = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String currentWord = new String();
        int wordIndex = 0;

        // Split into words
        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                currentWord += ch;
            } else {
                words[wordIndex++] = currentWord;
                currentWord = "";
            }
        }
        if (findLength(currentWord) > 0) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

	//Create a method to compare the two String arrays and return a boolean
    public static boolean compareIt(String[] s1, String[] s2){
    	for (int i=0;i<s1.length ;i++ ) {
    		if (!s1[i].equals(s2[i]))  {
    			return false;
    		}
    	}
    	return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = scanner.nextLine();
        scanner.close();

        // Split into words and process
        String[] words = splitIntoWords(input);
        if(compareIt(words,input.split(" "))){
        	System.out.println("Both are same");
        }
        else{
        	System.out.println("Both are not same");
        }
    }
}