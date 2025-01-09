import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        long maxHandshakes = calculateMaxHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes possible: " + maxHandshakes);

        scanner.close();
    }

    private static long calculateMaxHandshakes(int n) {
        return (long) (n * (n - 1)) / 2;
    }
}