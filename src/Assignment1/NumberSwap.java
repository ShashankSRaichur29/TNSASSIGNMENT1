package Assignment1;
import java.util.Scanner;
public class NumberSwap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Input second number
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        // Swap numbers using bitwise XOR
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        firstNumber = firstNumber ^ secondNumber;

        // Display swapped numbers
        System.out.println("Swapped Numbers: First = " + firstNumber + ", Second = " + secondNumber);

        // Close the scanner
        scanner.close();


	}

}
