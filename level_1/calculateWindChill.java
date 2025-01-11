/*
Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)
*/
import java.util.Scanner;
public class calculateWindChill{
	public static double calculateWindChill(double temp, double windSpeed){
		return (35.74 + ( 0.6215 * temp ) + ( 0.4275 * temp - 35.75) * windSpeed * 0.16 );
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		double windSpeed = scanner.nextDouble();
		System.out.println("the wind chill temperature is "+ calculateWindChill(temp ,windSpeed));
	}
}