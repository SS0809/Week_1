import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown start value: ");
        int cnt = scanner.nextInt();
        for (int i = cnt; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch!");
    }
}
