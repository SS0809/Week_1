/*
Write a program to demonstrate NullPointerException. 
Hint => 
*/
public class DemonstrateException{
//Write a Method to generate the Exception. 
	public static void helper(String ss){
		//Here define the variable text and initialize it to null. 
		//Write the Method to demonstrate NullPointerException.
		try{
			//Then call one of the String Method to generate the exception
			System.out.println(ss.length());
 			//Then write try catch block for handling the Exception while accessing one of the String method
		}catch(NullPointerException e){
		//From the main Firstly call the method to generate the Exception then
		//refactor the code to call the method to handle the RuntimeException
			System.out.println(e+"\n exception catched ");
		}
		finally{
			System.out.println("finally executed");
		}
	}
	public static void main(String[] args){
 		//Here define the variable text and initialize it to null. 
		String ss = null;
		helper(ss);
	}
}