/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
import java.util.Scanner;
public class CalculateTrigonometric{
	public static double[] calculateTrigonometricFunctions(double angle){
		double[] arr = new double[4];
		// Firstly convert to radians and then use Math function to find sine, cosine and tangent.
		arr[0] = Math.toRadians(angle);
		arr[1] = Math.sin(angle);
		arr[2] =Math.cos(angle);
		arr[3] = Math.tan(angle);
		return arr; 
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double angle = scanner.nextDouble();
		System.out.println("Radians are "+ calculateTrigonometricFunctions(angle)[0]+", Sin = "+calculateTrigonometricFunctions(angle)[1]+", Cos= "+calculateTrigonometricFunctions(angle)[2]+", Tan= "+calculateTrigonometricFunctions(angle)[3]);
	}
}