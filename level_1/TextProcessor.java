/*
		//Write a method using the String built-in charAt() method to convert each character 
		//if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 
		//so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
		
		Hint => 
Take user input using the Scanner nextLine() method 
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
Create a method to to find and return the length of a string without using the length() method. 
Create a method to take the word array and return 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
The main function calls the user-defined method and display the result in a tabular format. During display make sure to convert the length value from String to Integer and then display
*/
import java.util.Scanner;

public class TextProcessor {

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
                words[wordIndex++] = currentWord();
                currentWord = "";
            }
        }
        if (findLength(currentWord.toString()) > 0) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = scanner.nextLine();
        scanner.close();

        // Split into words and process
        String[] words = splitIntoWords(input);
        String[][] wordLengthArray = createWordLengthArray(words);
        for (String[] wordData : wordLengthArray) {
            System.out.print( wordData[0] +" "+ Integer.parseInt(wordData[1])+ "\n");
        }
    }
}