/*
Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/
import java.util.*;
public class FindSide {
	public static void main (String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Perimeter");
		int perimeter = scn.nextInt();//Taking Input 
		System.out.print(" The length of the side is "+( perimeter / 4 )+" whose perimeter is "+ perimeter);
	}
}