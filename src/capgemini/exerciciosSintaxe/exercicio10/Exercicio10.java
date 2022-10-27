package capgemini.exerciciosSintaxe.exercicio10;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Amount: ");
		
		try {
			double amount = sc.nextDouble();
			System.out.println("Installments: ");
			for (int i = 0; i < 5; i++) {
				System.out.printf("%.2f%n", amount / 5);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		

		sc.close();
	}
}
