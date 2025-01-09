public class TypeConversion{
	public static void main(String []args){
		double halfLitre = 500/1000;
		System.out.print(halfLitre + "\n");
		halfLitre = (double)500 / (double)1000;
		System.out.print(halfLitre);
		
		//int value1 = 20 + 45.68 ;// Compiler Error as double cannot be converted to int
		double value2 = 20 + (double) 45.68; // Correction using Explicit Conversion
		System.out.print("\n" + value2);
	}
}