public class ProfitLoss{
	public static void main(String[] args){
		int costPrice = 129, sellingPrice = 191 ;
		int profit = sellingPrice - costPrice ;//Calculating profit 
		double profitPercentage = (double)profit / costPrice * 100;// Calculating profitPercentage
		System.out.print("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\n"+"The Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage+"");
	}
}