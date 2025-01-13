
import java.util.Scanner;

class Quadraticequation{
    public static double[]getrootofNumber(double number1,double number2,double number3){  
        double []root=new double[2]; 
        double delta=Math.pow(number2, 2)+4*number1*number3; //The roots are computed using the following formulae  delta = b2+ 4*a*c
       
        if(delta>0){// check for the positivity
            root[0]=(-number2+Math.sqrt(delta))/2*number1;  //If delta is positive the find the two roots using formulae 
            //root1 of x = (-b + delta)/(2*a) 
            //root2 of x = (-b - delta)/(2*a)
            root[1]=(-number2-Math.sqrt(delta))/2*number1;


        } 
        else if(delta==0){//f delta is zero then there is only one root of x  
            //root of x = -b/(2*a)
            root[0]=-number2/2*number1;
        }
        return root;
        


    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //Take a, b, and c as input values to find the roots of x
        System.out.println("Enter the value of a"); 
        int a=sc.nextInt(); 
        System.out.println("Enter the value of b"); 
        int b=sc.nextInt();
        System.out.println("Enter the value of c"); 
        int c=sc.nextInt(); 
        double []result=getrootofNumber(a,b,c);  // calling the function 
        if(result.length==0){
        System.out.println("The root of the Quadratic equation are "+result[0]);  
        } 
        else if(result.length==2){
            System.out.println("The root of the Quadratic equation are "+result[0]+"and "+result[1]);
        } 
        else{
            System.out.println("Equation has no real roots");
        }
        sc.close();


        
    }

}