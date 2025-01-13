/*
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
*/
import java.util.Scanner;

public class YoungestFriend{
	//Write a Method to find the tallest of the 3 friends
	public static int findTallest(int[] height){
		int i=0 , youngest = Integer.MAX_VALUE, youngestIndex =0;
		for (i=0;i<3 ;i++ ) {
			if(youngest<height[1]){
				youngest=height[i];
				youngestIndex=i;
			}
		}
		return youngestIndex;
	}
	//Write a Method to find the youngest of the 3 friends
	public static int findYoungest(int[] age){
		int i=0 , tallest = Integer.MIN_VALUE, tallestIndex=0;
		for (i=0;i<3 ;i++ ) {
			if(tallest<age[1]){
				tallest=age[i];
				tallestIndex=age[i];
			}
		}
		return tallestIndex;
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		//Take user input for age and height for the 3 friends and 
		//store it in two arrays each to store the values for age and height of the 3 friends
		int age[] = new int[3];
		int height[] = new int[3];
		for(int i=0;i<3;i++){
			age[i] = scn.nextInt();
		}
		for(int i=0;i<3;i++){
			height[i] = scn.nextInt();
		}
		System.out.print("Tallest "+findTallest(height)+" Youngest "+findYoungest(age));
	}
} 