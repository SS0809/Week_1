// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

// Hint => 
// Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
// Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
// Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
// Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 



import java.util.Scanner;

public class StudentMarks{
    // generating randomo marks for all three subject
    static int[][] generateRandomScores(int n){
        int[][] scores = new int[n][3];
        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                scores[i][j] = (int)(Math.random()*100);
            }
        }
        return scores;
    }

    static double[][] calculateTotalAveragePercentage(int[][] scores){
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total; // Total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Average rounded to 2 digits
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage rounded to 2 digits
        }
        return results;
    }

    // displaying result based on the chart
    static String[] calculateGrade(double[][] percentages){
        String[] grades = new String[percentages.length];
        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }
    // Method to display the scorecard using println
   static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
    // Header
    System.out.println("Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade");
    
    // Body
    for (int i = 0; i < scores.length; i++) {
        System.out.println(
            (i + 1) + "\t" + 
            scores[i][0] + "\t" + 
            scores[i][1] + "\t" + 
            scores[i][2] + "\t" + 
            (int)results[i][0] + "\t" + 
            results[i][1] + "\t" + 
            results[i][2] + "\t" + 
            grades[i]
        );
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt(); // Number of students

        // Generate PCM scores for students
        int[][] pcmScores = generateRandomScores(numberOfStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(pcmScores);

        // Calculate grades for each student
        String[] grades = calculateGrade(results);

        // Display the scorecard
        System.out.println("Student Scorecard:");
        displayScorecard(pcmScores, results, grades);

        sc.close();
    }
}
