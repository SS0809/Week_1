//Create a program to print a multiplication table of a number.
import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		//Get an integer input and store it in the number variable.
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		// Also, define a integer array to store the results of multiplication from 1 to 10
		int multArray[] = new int[10];
		//Run a loop from 1 to 10 and store the results in the multiplication table array
		for (int i=0;i< 10 ;i++ ) {
			multArray[i] = number * (i+1);
		}
		//Finally, display the result from the array in the format number * i = ___
		for (int i=0 ;i<10 ;i++ ) {
			System.out.println(number+" * "+i+" = "+multArray[i]);
		}
	}
}