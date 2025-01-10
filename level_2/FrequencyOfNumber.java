// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number?


import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initializing a frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];

        // Counting digits in the number
        while (number != 0) {
            int digit = number % 10; 
            frequency[digit]++;     // Incrementing the frequency of the digit
            number /= 10;           
        }

        // printing the frequency of each digit
        System.out.println("Frequency of digits in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
