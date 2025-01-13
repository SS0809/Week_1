/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/
import java.util.Scanner;
public class NaturalNumbers{
	//Write a Method to find the sum of n natural numbers using recursion
 	public static int NaturalSum(int number) {
        if (number == 0) {
            return 0; // base case
        }
        return number + NaturalSum(number - 1); // recursive case
    }
    //Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
    public static int NaturalSum2(int n){
    	return n*(n+1)/2;
    }
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		//Take the user input number and check whether it's a Natural number, if not exit
		int number = scn.nextInt();
		if(number>=0){
			//Natural NUmbers
			int sum =0;
			System.out.print("recursive solution "+NaturalSum(number)+"\n");
			System.out.print("iterative solution "+NaturalSum2(number)+"\n");
		}else{
			// no hints
		}
	}
}