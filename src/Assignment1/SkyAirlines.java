package Assignment1;

import java.util.Scanner;
public class SkyAirlines {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        //Collecting the Passengers detail
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter source:");
        String source = scanner.nextLine();

        System.out.println("Enter destination:");
        String destination = scanner.nextLine();

        // Display the welcome message
        System.out.println("Dear " + name + ", welcome onboard with service from " + source + " to " + destination + ". Thank you for choosing Sky Airlines. Enjoy your flight.");

        // Close the scanner
        scanner.close();
	}

}
