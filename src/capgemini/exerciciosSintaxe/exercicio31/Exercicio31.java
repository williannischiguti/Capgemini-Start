package capgemini.exerciciosSintaxe.exercicio31;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio31 {

	public static double result(double A, double B, char C) {

		if (C == '+') {
			return A + B;
		} else if (C == '-') {
			return A - B;
		} else if (C == '*') {
			return A * B;
		} else if (C == '/') {
			return A / B;
		} else if (C == '%') {
			return A % B;
		} else {
			return 0;
		}
	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the first value: ");
			double A = sc.nextDouble();
			System.out.print("Enter the second value: ");
			double B = sc.nextDouble();
			System.out.print("Enter the math operator: ");
			char C = sc.next().charAt(0);

			if ((C + "").matches("[+-/%]") || C == '*') {
				if (B == 0 && C == '/') {
					System.out.println("Cannot divide by zero");
				} else {
					System.out.println(result(A, B, C));
				}
			} else {
				System.out.println("Invalid symbol");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}

		sc.close();
	}

}
