/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/
import java.util.Scanner;
public class SpringSeason {
	public static boolean checkMonth(int month ,int day){
	if ((month == 3 && day >= 20 && day <= 31) || (month >= 4 && month <= 5 && day >= 1 && day <= 31) || (month == 6 && day <= 20 && day <= 31)) {
            return true;
        } else {
            return false;
        }
	}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int month = scn.nextInt();
        int day = scn.nextInt();
        if (checkMonth(month,day)) {
        	System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}