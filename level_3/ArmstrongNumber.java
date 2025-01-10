import java.util.Scanner;

public class ArmstrongNumber {
    public static int findPower(int remainder){
      int size =0;
      while (remainder !=0) {
        remainder /= 10;
        size++;
      }
      return size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        
        int sum = 0, originalNumber = number; // copy the number
        int power = findPower(originalNumber);
        while (originalNumber != 0) {
          int remainder = originalNumber % 10; // get's the last digit
          sum += Math.pow(remainder , power); // getting cube of last 
          originalNumber /= 10; // removes the last digit
        }
        
        if (sum == number) {
          System.out.println(number + " is an Armstrong number.");
        }
        else {
          System.out.println(number + " is not an Armstrong number.");
        }
        sc.close();
    }
}