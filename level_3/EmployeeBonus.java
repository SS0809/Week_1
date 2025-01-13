import java.util.*;

class EmployeeBonus{
	
    // Method to generate random salary and years of service for employees
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
		
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() *20);
		}
		
        return data;
	}
	
    // Method to calculate the bonus and new salary based on years of service
    public static double[][] calculateBonusAndSalary(int[][] data) {
        double[][] result = new double[data.length][3];
		
        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            int yearsOfService = data[i][1];
            double bonusPercentage = (yearsOfService >= 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;
			
            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
		}
		
        return result;
	}
	
    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateTotals(double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
		
        for (int i = 0; i < result.length; i++) {
            totalOldSalary += result[i][0];
            totalBonus += result[i][1];
            totalNewSalary += result[i][2];
		}
		
        System.out.println("Total Old Salary: " + String.format("%.2f", totalOldSalary));
		System.out.println("Total New Salary: " + String.format("%.2f", totalNewSalary));
		System.out.println("Total Bonus Paid: " + String.format("%.2f", totalBonus));
		
	}
	
    // Method to display the salary details in a tabular format
    public static void displaySalaryDetails(double[][] result) {
        System.out.println("Employee Salary Details:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Employee\tOld Salary\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------");
		
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i + 1, result[i][0], result[i][1], result[i][2]);
		}
		
        System.out.println("--------------------------------------------------------");
	}
	
    public static void main(String[] args) {
        int numEmployees = 10;
		
        int[][] employeeData = generateEmployeeData(numEmployees);
		
        double[][] salaryDetails = calculateBonusAndSalary(employeeData);
		
        displaySalaryDetails(salaryDetails);
		
        calculateTotals(salaryDetails);
	}
}