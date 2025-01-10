import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double number1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double number2 = sc.nextDouble();

		System.out.println("Choose an operator(+, -, *, /): ");
		char operator = sc.next().charAt(0);
		double result = 0;
		
		switch(operator){
			case '+': result=number1 + number2;
			        System.out.println("The addition is: " + result);
			        break;
			case '-': result= number1 - number2;
			        System.out.println("The Subtraction is: " + result);
			        break;
			case '*': result= number1 * number2;
			        System.out.println("The multiplication is: " + result);
			        break;
			case '/': result= number1 / number2;
			        if (number2 != 0) {
			          System.out.println("The division is: " + result);
			        }
			        break;
			default: System.out.println("Invalid operator.");
		}
		sc.close();
	}
}