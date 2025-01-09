/* 
Write a TemperaturConversion program, given the temperature in Celsius as input outputs the temperature in Fahrenheit
Hint => 
Create a celsius variable and take the temperature as user input
Use the Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F and assign to farenheitResult  and print the result
I/P => celcius
O/P =>  The ____ celsius is _____ fahrenheit
*/
import java.util.Scanner;

public class TemperatureConversionCelsius{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Temperature in celsius ");
		double celsius = scn.nextDouble();
		double fahrenheit = ((celsius*9)/5)+32 ; // calculating fahrenheit to celsius with formula  ((celsius*9)/5)+32 
		System.out.print("The "+celsius+" celsius is "+fahrenheit+" fahrenheit");
	}
}