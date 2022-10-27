package capgemini.exerciciosSintaxe.exercicio1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static double sum(double number1, double number2) {

		return number1 + number2;
	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the first number: ");
			double num1 = sc.nextDouble();
			System.out.print("Enter the second number: ");
			double num2 = sc.nextDouble();
			System.out.println(sum(num1, num2));
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}

		sc.close();
	}
}
