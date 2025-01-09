import java.util.*;
public class DoubleOperation {
	public static void main(String[]args){
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter variable a ");
	double a = scn.nextDouble();
	System.out.print("Enter variable b ");
	double b = scn.nextDouble();
	System.out.print("Enter variable c ");
	double c = scn.nextDouble();
	/*
	Operations: a + b *c, a * b + c, c + a / b, and a % b + c. 
	*/
	double ops1 = a + b *c, ops2 =  a * b + c, ops3 = c + a / b, ops4 = a % b + c ; //calculating operations for each precedence order
	System.out.print("The result of operations for  a + b *c, a * b + c, c + a / b, and a % b + c are " + ops1 + " ,"+ ops2 + " ,"+ ops3 + " and "+ ops4 + " respectively");
	}
}