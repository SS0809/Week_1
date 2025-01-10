//Question 1.
/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
*/
import java.util.*;
public class CanVote {
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		//Define an array of 10 integer elements and take user input for the student's age. 
		int n  = 10;
		int arr[]  =new int[n];
		for (int i=0 ; i< n ; i++){
			arr[i] = scn.nextInt();
		}
		//Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 

		for(int i=0 ; i< arr.length ; i++){
			if(arr[i]>=18)
				System.out.println("The student with the age "+arr[i]+" can vote.");
			else
				System.out.println("The student with the age "+arr[i]+" cannot vote. ");
		}
	}
}