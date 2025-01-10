import java.util.Scanner;

public class NumberOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // taking number input
        int count = 0; // initialized counter
        
        while (number != 0) { // run loop till the number becomes zero
          number /= 10; // removes last digit
          count++; // increment counter by 1
        }
        
        System.out.println("The number of digit is: " + count);
        sc.close();
    }
}