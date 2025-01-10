/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/
import java.util.Scanner;
public class MultiplicationTableOptimised{
	public static void main(String []args){
		//Take integer input and store it in the variable number 
		// define an integer array to store the multiplication result in the variable multiplicationResult
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int multiplicationResult[]  = new int[10];
		//Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
		if(number>=6 && number<=9){
			for (int i=0;i<=9;i++ ) {
				multiplicationResult[i] = (i+1) * number;
			}
			//Finally, display the result from the array in the format number * i = ___
			for (int i=0;i<=9 ;i++ ) {
				System.out.print(multiplicationResult[i]+"\n");
			}
		}
		else{
			System.out.println("entered number is not in range");
		}
	}
}