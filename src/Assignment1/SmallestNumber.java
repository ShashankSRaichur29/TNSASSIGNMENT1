package Assignment1;
import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get three numbers from the user
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        // Find the smallest number using ternary operator
        int smallestNumber = (num1 < num2) ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);

        // Display the result
        System.out.println("The smallest number is: " + smallestNumber);

        // Close the scanner
        scanner.close();

	}

}
