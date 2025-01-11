/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/
import java.util.Scanner;
public class SimpleInterest{
    private static int principal , rate , time;//accessible to same class only 
    private static double CalculateSI(int principal ,int rate ,int time){//PassByValue
        return (principal*rate*time)/100;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //Take user input for principal, rate, time
        System.out.print("Enter input for principal, rate, time ");
        principal = scn.nextInt();
        rate = scn.nextInt();
        time = scn.nextInt();
        System.out.println("The Simple Interest is "+CalculateSI(principal ,rate ,time )+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

    }
}