import java.util.Scanner;
public class DivisionModuli{
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		int operand1  = scn.nextInt();
		int operand2  = scn.nextInt();
		int quotient = operand1 / operand2 ; //calcultaing quotient
		int reminder = operand1 % operand2 ; //calcultaing reminder
		System.out.print("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+operand1+" and "+operand2);
	}
}