import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // taking number input
        int sum = 0, originalNumber = number; //Getting copy of number
        
        while (originalNumber != 0) { // runs loop till the number is zero
          sum += originalNumber % 10; // adds all the digit in sum
          originalNumber /= 10; // removes last digit
        }
        if (number % sum == 0) { // checking if number is fully divisible
          System.out.println("Harshad Number.");
        }
        else {
          System.out.println("Not a harshad number.");
        }
        sc.close();
    }
}