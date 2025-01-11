/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/
import java.util.Scanner;
public class AthleteRuns{
	public static double roundsComputation(double perimeter){
		return  ((5 * 1000) / perimeter);
	}
	public static void main(String[] args){
		double perimeter = 0.0 ;
		Scanner scn = new Scanner(System.in);
		for (int i=0 ; i<3 ; i++){
			perimeter += scn.nextDouble();	
		}
		System.out.print("the number of rounds user needs to do for perimeter "+perimeter+" to complete 5km run are " +roundsComputation(perimeter));//externally type conversion because rounds can't be in partial form 
	}	
}