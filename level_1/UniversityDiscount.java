public class UniversityDiscount{
	public static void main (String [] args){
		double fee = 125000, discountedPercent = 10;
        double discount = fee * (discountedPercent / 100); // Calculating discount
        double subtractedFee = fee - discount; // Calculating subtractedFee
		System.out.print(" The discount amount is INR "+discount +" and final discounted fee is INR "+subtractedFee);
	}
}