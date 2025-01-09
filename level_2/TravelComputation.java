import java.util.Scanner;

class TravelComputation {

    public static void main(String[] args) {
        // Create a Scanner object to take user inputs
        Scanner scanner = new Scanner(System.in);

        // Take user input for name, fromCity, viaCity, and toCity
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the city you are traveling from: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the city you are traveling via: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter the city you are traveling to: ");
        String toCity = scanner.nextLine();

        // Take user input for distances in miles
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = scanner.nextDouble();

        // Take user input for time taken in hours and minutes for each segment
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours): ");
        int hoursFromToVia = scanner.nextInt();
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (minutes): ");
        int minutesFromToVia = scanner.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (hours): ");
        int hoursViaToFinalCity = scanner.nextInt();
        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (minutes): ");
        int minutesViaToFinalCity = scanner.nextInt();

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;

        int timeFromToVia = hoursFromToVia * 60 + minutesFromToVia;
        int timeViaToFinalCity = hoursViaToFinalCity * 60 + minutesViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details
        System.out.println("The Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes.");

        // Example additional operations to demonstrate operator precedence
        System.out.print("Enter a fee amount: ");
        int fee = scanner.nextInt();
        System.out.print("Enter a discount percentage: ");
        int discountPercent = scanner.nextInt();

        int discountAmount = (fee * discountPercent) / 100;
        int discountedFee = fee - discountAmount;
        int totalWithTax = discountedFee + (discountedFee * 18 / 100); // Assuming 18% tax

        System.out.println("The results of Int Operations are Discount Amount: " + discountAmount + ", Discounted Fee: " + discountedFee + ", Total with Tax: " + totalWithTax);

        // Close the scanner
        scanner.close();
    }
}
