/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/
import java.util.Scanner;

public class LeapYear {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Year must be >= 1582 and satisfy leap year conditions
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    return true; // Leap year
                }
            }
        }
        return false; // Not a leap year
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scn.nextInt();

        if (isLeapYear(year)) {
            System.out.println("This is a Leap Year: " + year);
        } else {
            System.out.println("This is not a Leap Year: " + year);
        }
        scn.close();
    }
}
