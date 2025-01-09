import java.util.Scanner;
public class UniversityDiscountUserInput{
	public static void main (String [] args){
		Scanner scn = new Scanner(System.in);
		double fee = scn.nextDouble(), discountedPercent = scn.nextDouble(); // Scanning variables
        double discount = fee * (discountedPercent / 100);//Calculating discount
        double subtractedFee = fee - discount;;//Calculating subtractedFee
		System.out.print(" The discount amount is INR "+discount +" and final discounted fee is INR "+subtractedFee);
	}
}