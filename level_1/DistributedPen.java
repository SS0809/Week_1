public class DistributedPen{
	public static void main (String [] args){
		int pens = 14 , studentsPens = 3;
		int remaining = pens % studentsPens; // calculating remaining
		int perStudentPen = pens / studentsPens ; // calculating perStudentPen
		System.out.print("The Pen Per Student is "+ perStudentPen +" and the remaining pen not distributed is "+ remaining);
	}
}