package ConditionalState;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number (a): ");

		double a = sc.nextDouble();

		System.out.println("Enter the Second Number (a): ");
		double b = sc.nextDouble();

		System.out.println("\nChoose an operation:");
		System.out.println("1 : +(Addition)");
		System.out.println("2 : - (Subtraction)");
		System.out.println("3 : * (Multiplication)");
		System.out.println("4 : / (Division)");
		System.out.println("5 : % (Modulo)");

		System.out.print("Enter the operation number (1-5): ");
		int choice = sc.nextInt();

		calculator(a, b, choice);

	}

	public static void calculator(double a, double b, int choice) {
		double result;
		switch (choice) {
		case 1:
			result = a + b;
			System.out.println("The result of Addition is: " + result);
			break;
		case 2:
			result = a - b;
			System.out.println("The result of Subtraction is: " + result);
			break;
		case 3:
			result = a * b;
			System.out.println("The result of Multiplication is: " + result);
			break;
		case 4:
			if (b != 0) {
				result = a / b;
				System.out.println("The result of Multiplication is: " + result);
			} else {
				System.out.println("Error: Division by zero is not allowed");
			}
			break;
		case 5:
			if (b != 0) {
				result = a % b;
				System.out.println("The result of Modulo is: " + result);
			} else {
				System.out.println("Error: Division by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Invalid operation choice. Please enter a number between 1 and 5.");
		}

	}

	public static void printMonth(int month) {

		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("february");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Octomber");
			break;
		case 11:
			System.out.println("Nevember");
			break;
		case 12:
			System.out.println("December");
			break;
		}
	}

}
