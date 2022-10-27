package capgemini.exerciciosSintaxe.exercicio9;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double fees = 0.07;

		try {
			System.out.print("Amount: ");
			double amount = sc.nextDouble();

			System.out.printf("Final amount: %.2f", amount + (amount * (fees / 100)));
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}

		sc.close();
	}
}
