/*
Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. 
This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. 
Here access index larger then the length of the array. This will generate a runtime exception.
 Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo{
  static void gettingArrayIndexOut(int[] arr) {
    int abc = 0;
    try {
      for (int i = 0; i<=arr.length; i++){
        abc = arr[i];
      }
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error! Array index out of bound.");
    }
  }
  
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter elements: ");
    for(int i = 0; i<n; i++) {
      arr[i] = sc.nextInt();
    }
    
    gettingArrayIndexOut(arr);
 } 
}