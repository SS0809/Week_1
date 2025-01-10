import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt(); // taking number input
        int sum = 0;
        
        for (int i = 1; i<number; i++) {  // Runs the loop till number
          if (number % i == 0) { // checks if number is divisible by i
            sum += i; // if it does store it in sum
          }
        }
        
        if (sum > number) { // sum is greater then number then it is abundant
          System.out.println("Abundant Number");
        }
        else {
          System.out.println("Not a Abundant Number");
        }
        sc.close();
    }
}