/*
Write a program to split the text into words and find the shortest and longest strings in a given text
Hint => 
Take user input using the Scanner nextLine() method 
Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
Create a Method that takes the 2D array of word and corresponding length as parameters, find the shortest and longest string and return them in an 1D int array. 
The main function calls the user-defined methods and displays the result. 
*/
import java.util.*;

public class SplitterShLo {

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
        if (findLength(currentWord.toString()) > 0) {
            words[wordIndex] = currentWord;
        }

        return words;
    }
    public static int[] shortestLongestArray(String[][] words){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for (int i=0;i<words.length;i++) {
            if(maxi < Integer.parseInt(words[i][1]))
                maxi = Integer.parseInt(words[i][1]);
            if(mini> Integer.parseInt(words[i][1]))
                mini = Integer.parseInt(words[i][1]);
        }
        int[] arr = new int[2];
        arr[0] = maxi;
        arr[1] = mini;
        return arr;
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
        int[] intt = shortestLongestArray(wordLengthArray);
        for (String[] wordData : wordLengthArray) {
            System.out.print( wordData[0] +" "+ Integer.parseInt(wordData[1])+ "\n");
        }
        System.out.println("longest "+ intt[0]+ "\nshortest "+intt[1]);
    }
}