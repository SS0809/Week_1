/*
Write a program to demonstrate NumberFormatException
Hint => 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class NumberFormatExceptionDemo {
    // Method to generate the NumberFormatException
    public static void generateError(String input) {
        try {
            System.out.println(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            System.out.println(e + input + "' could not be parsed as an integer.");
        }
    }

    // Method to handle RuntimeException
    public static void handleException() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Generate NumberFormatException
        generateError("abc");

        // Handle RuntimeException
        handleException();
    }
}