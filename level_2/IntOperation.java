import java.util.*;
public class IntOperation {
	public static void main(String[]args){
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter variable a ");
	int a = scn.nextInt();
	System.out.print("Enter variable b ");
	int b = scn.nextInt();
	System.out.print("Enter variable c ");
	int c = scn.nextInt();
	/*
	Operations: a + b *c, a * b + c, c + a / b, and a % b + c. 
	*/
	int ops1 = a + b *c, ops2 =  a * b + c, ops3 = c + a / b, ops4 = a % b + c ; //calculating operations for each precedence order
	System.out.print("The result of operations for  a + b *c, a * b + c, c + a / b, and a % b + c are " + ops1 + " ,"+ ops2 + " ,"+ ops3 + " and "+ ops4 + " respectively");
	}
}