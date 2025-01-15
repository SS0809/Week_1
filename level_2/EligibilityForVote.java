import java.util.Scanner;

public class EligibilityForVote{
    // generates random age
    static int[] generateRandomAge(int n){
        int[] age = new int[n];
        for(int i=0;i<n;i++){
            age[i] = (int)(Math.random()*90)+10; // random age between 10 and 99
        }
        return age;
    }

    // checks if a person is eligible to vote
    static String[][] votingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) { // if age is negative
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "false (Invalid age)";
            } else if (ages[i] >= 18) { // if age is 18 or above
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "true";
            } else { // if age is below 18
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "false";
            }
        }
        return result;
    }

    // prints the result
    static void displayArray(String[][] str) {
        for (String[] strings : str) {
            System.out.println(strings[0] + "\t" + strings[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.print("Enter the number of students:");
        int n = sc.nextInt();
        // collecting random age
        int[] ages = generateRandomAge(n);
        // checking vote eligibility
        String[][] result = votingEligibility(ages);
        displayArray(result); // displaying result
        sc.close();
    }
}