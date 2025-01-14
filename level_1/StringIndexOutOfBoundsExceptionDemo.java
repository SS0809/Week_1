/*
Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static char generateException(String ss) {
        try {
            return ss.charAt(89);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally executed");
        }
        return 0; // Return a default value
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ss = scn.next();
        System.out.println(generateException(ss));
    }
}