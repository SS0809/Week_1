/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends
*/
import java.util.Scanner;
public class YoungestFriend{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] age = new int[3];
		int[] height = new int[3];
		for (int i =0 ;i<3 ;i++ ) {
			age[i] = scn.nextInt();
		}
		for (int i =0 ;i<3 ;i++ ) {
			height[i] = scn.nextInt();
		}
		int Youngestfriend = Integer.MAX_VALUE ;
		int Tallestfriend = Integer.MIN_VALUE;
		for (int i =0 ;i<3 ;i++ ) {
			if(age[i]<Youngestfriend)
				Youngestfriend = age[i];
			else if(age[i]>Tallestfriend)
				Tallestfriend = age[i];
		}
		System.out.print("Youngestfriend is "+Youngestfriend+" and Tallestfriend is "+Tallestfriend );

	}
}