//Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
import java.util.Scanner;
public class MultipleValues{
	public static void main(String [] args){
		//Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. 
		//Also, the index variable is initialized to 0 for the array	
		double MultValues[] = new double[10];
		double sum = 0.0;
		int index  =0 ;
		Scanner scn = new Scanner(System.in);
		while(true){//Use infinite while loop as in while (true)
			//Take the user entry and check if the user entered 0 or a negative number to break the loop 			
			System.out.println("Enter the Element");
			double doubleValue = scn.nextDouble();
			if (doubleValue<=0 || index == 10) {
				//Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
				break;
			}else {
				MultValues[index] = doubleValue;
				//If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
				index++;
			}
		}
		for (int i=0;i<10;i++ ) {
			//Take another for loop to get the values of each element and add it to the total 		
			sum+=MultValues[i];	
		}	
		System.out.println(sum);
		//Finally display the total value	
	}
}