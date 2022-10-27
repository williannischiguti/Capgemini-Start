package capgemini.exerciciosSintaxe.exercicio2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void calculate(double number1, double number2) {
		
		System.out.printf("Sum: %.2f + %.2f = %.2f%n", number1, number2, (number1 + number2));
		System.out.printf("Subtraction: %.2f - %.2f = %.2f%n", number1, number2, (number1 - number2));
		System.out.printf("Multiplication: %.2f * %.2f = %.2f%n", number1, number2, (number1 * number2));
		System.out.printf("Division: %.2f / %.2f = %.2f%n", number1, number2, (number1 / number2));

	}

	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the first number: ");
			double num1 = sc.nextDouble();
			System.out.print("Enter the second number: ");
			double num2 = sc.nextDouble();
			
			System.out.println();
			calculate(num1, num2);
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		sc.close();
	}
}
