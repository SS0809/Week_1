/*
Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number

*/
import java.util.Scanner;
public class LargestElement{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();//Create a number variable and Take user input. 
		int maxDigit = 10;
		int digits[] = new int[maxDigit];//Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
		int index = 0 ;
		while(number!=0){
			digits[index] = number%10;//Remove the last digit from the number in each iteration and add it to the array.
			number/=10;
			index++;
			if(index == maxDigit) break;
		}		
		//Define variable to store largest and second largest digit and initialize it to zero
		int largestElement = 0 , secondLargest = 0;
		//Loop through the array and use conditional statements to find the largest and second largest number in the array
		for (int i : digits ) {
			if(digits[i]>largestElement){
				largestElement=digits[i];
			}
			else if(digits[i]!=largestElement && digits[i]>secondLargest){
				secondLargest = digits[i];
			}
		}
		//Finally display the largest  and second-largest number
		System.out.print("largestElement"+largestElement+"secondLargest"+secondLargest);
	}
}