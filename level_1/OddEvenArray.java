/*
Create a program to save odd and even numbers into odd and even arrays 
between 1 to the number entered by the user. Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number. If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/
import java.util.Scanner;

public class OddEvenArray{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[11]; // initializing array.
    System.out.print("Enter Number: "); 
    int number = sc.nextInt();
    if (number < 0) {
      System.err.println(number + " is not a natural number.");
      System.exit(0);
    }
    
    int size = number / 2 + 1, oddIndex = 0, evenIndex = 0;
    int oddArray[] = new int[size]; // odd array creation
    int evenArray[] = new int[size]; // even array creation
    
    System.out.print("Enter numbers: ");
    for (int i = 1; i <= number; i++) { // traversing and storing the value
      int num = sc.nextInt();
      if (num % 2 != 0) { // checking if value is odd
        oddArray[oddIndex++] = num; // storing odd
      }
      else {
        evenArray[evenIndex++] = num; // storing even
      }
    }
    
    // printing all Odd numbers
    System.out.print("Odd Numbers are: ");
    for (oddIndex = 0; oddIndex < oddArray.length; oddIndex++) {
      System.out.print(oddArray[oddIndex] + " ");
    }
    // printing all Even numbers
    System.out.print("\nEven Numbers are: ");
    for (evenIndex = 0; evenIndex < evenArray.length; evenIndex++) { 
      System.out.print(evenArray[evenIndex] + " ");
    }
    
    sc.close();
  }
}