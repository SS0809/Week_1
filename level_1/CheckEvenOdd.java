/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
*/
import java.util.Scanner;

public class CheckEvenOdd {
	public static void main (String[] args){
		Scanner scn =new Scanner(System.in);
		//Define an integer array of 5 elements and get user input to store in the array.
		int n = 5;
		int arr[] = new int[n];
		int size = arr.length;
		for(int i=0 ; i<size;i++){
			arr[i] = scn.nextInt();
		}
		//Loop through the array using the length ,
		for (int i=0;i<size ;i++ ) {
			if(arr[i]>0){
				//If the number is positive, check for even or odd numbers and print accordingly
				if(arr[i]%2==0){//even
					System.out.println(arr[i] + " is positive and even");
				}
				else{ //odd
					System.out.println(arr[i] + " is positive and odd");
				}
			}else if(arr[i]<0){
				//If the number is negative, print negative.
				if(Math.abs(arr[i])%2==0){//even
					System.out.println(arr[i] + " is negative and even");
				}
				else{ //odd
					System.out.println(arr[i] + " is negative and odd");
				}
			}else if(arr[i]==0){
				// Else if the number is zero, print zero. 
				System.out.println("Zero");
			}
		}
		if (arr[0]==arr[size-1]) {
			//compare the first and last element of the array and display if they equal
			System.out.println("First and Last elements are Equal");
		}else if (arr[0]>arr[size-1]) {
			System.out.println("Last element is Smaller than first element");
		}else if (arr[0]<arr[size-1]) {
			System.out.println("First element is Smaller than last element");
		}
	}
}