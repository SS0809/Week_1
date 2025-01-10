/*
Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, 
along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. 
Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
*/
import java.util.Scanner;
public class EmployeeBonus{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		double totalBonus = 0.0 , totalNewSalary = 0.0 , totalSalary = 0.0 ;
		double salary[][] = new double[10][2];//salary and yearOfService
		for (int i=0;i<10 ;i++ ) {
			salary[i][0] = scn.nextDouble();			
			salary[i][1] = scn.nextDouble();			
		}
		int index =0 ;
		double newSalary[][] = new double[10][2];//new salary and bonus
		for (int i=0; i<10 ;i++ ) {
		//Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
			if(salary[i][1]>=5){
				newSalary[i][1] =  ((0.02) * salary[i][0]);
				totalBonus+=newSalary[i][1];
				newSalary[i][0] = salary[i][0] + newSalary[i][1];
				totalNewSalary+=newSalary[i][0];
				totalSalary+=salary[i][0];
			}else{
				newSalary[i][1] =  ((0.05) * salary[i][0]);
				totalBonus+=newSalary[i][1];
				newSalary[i][0] = salary[i][0] + newSalary[i][1];
				totalNewSalary+=newSalary[i][0];
				totalSalary+=salary[i][0];
			}
		}
		for (int i =0 ;i<10 ;i++ ) {
			 System.out.println("Employee " + (i + 1) + " - Bonus: " + newSalary[i][1] + ", Old Salary: " + salary[i][0] + ", New Salary: " + newSalary[i][0]);
		}
		System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

	}
}

/*
input
1 2 1 2 1 2 1 2 1 2 1 1 2 1 2
1 2 2 
 1 2 1 2 1 2 1 2 1

output
0.5 1.0 1.5
0.5 1.0 1.5
0.5 1.0 1.5
0.5 1.0 1.5
0.5 1.0 1.5
0.5 1.0 1.5
1.0 2.0 3.0
1.0 2.0 3.0
1.0 2.0 3.0
0.5 1.0 1.5
*/