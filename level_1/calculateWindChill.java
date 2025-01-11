/*
Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)
*/
import java.util.Scanner;

public class WindChillTemperature{
  public double calculateWindChill(double temp, double windSpeed) {
    return (35.74 + ( 0.6215 * temp ) + ( 0.4275 * temp - 35.75) * windSpeed * 0.16 );
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input.
    System.out.print("Enter the temperature and Wind Speed: ");
    double temp = sc.nextDouble();
    double windSpeed = sc.nextDouble();
    
    // calling the method and storing it in the variable.
    WindChillTemperature obj = new WindChillTemperature();
    double windChill = obj.calculateWindChill(temp, windSpeed);
    System.out.println("The Wind Chill is : " + windChill);
  }
}