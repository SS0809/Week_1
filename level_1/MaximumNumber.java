/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/
import java.util.Scanner;
public class MaximumNumber{
    //Write a method to use the combination formulae to calculate the number of handshakes
    public static int combinations(int number){
        return (number*(number-1)) / 2;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //Get integer input for number of students
        int numberOfStudnets = scn.nextInt();
        System.out.print("The maximum number of handshakes among N number of students are " + combinations(numberOfStudnets));
    }
}