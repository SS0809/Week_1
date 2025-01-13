/*
Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops.
The first loop to find the count and initialize the array with the count. 
And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
*/
import java.util.Scanner;
public class DisplayFactors{
	public static int[] findFactors(int number){
		//Write a static Method to find the factors of the number and save them in an array and return the array. 
		int cnt =0;
		//The first loop to find the count and initialize the array with the count.
		for (int i =1;i<=number;i++ ) {
			if(number%i==0){
				cnt++;
			}
		}
		//And the second loop save the factors into the array
		int arr[] = new int[cnt];
		int index =0 ;
		for (int i=1;i<=number; i++) {
			if(number%i==0){
				arr[index++] = i;
			}
		}
		return arr;
	}
	//Write a method to find the sum of the factors using factors array
	public static int findSum(int[] arr){
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum;
	}
	//Write a method to find the product of the factors using factors array
	public static int findProduct(int[] arr){
		int product =1;
		for(int i=0;i<arr.length;i++){
			product *= arr[i];
		}
		return product;		
	}
	//Write a method to find the sum of square of the factors using Math.pow() method
	public static int findSquareSum(int[] arr){
		int product =0;
		for(int i=0;i<arr.length;i++){
			product += Math.pow(arr[i],2);
		}
		return product;	
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();

        int[] factors = findFactors(number);
		// Display factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display sum, product, and sum of squares
        System.out.println("Sum of factors: " + findSum(factors));
        System.out.println("Product of factors: " + findProduct(factors));
        System.out.println("Sum of squares of factors: " + findSquareSum(factors));

	}
}