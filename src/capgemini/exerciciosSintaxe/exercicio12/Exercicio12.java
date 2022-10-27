package capgemini.exerciciosSintaxe.exercicio12;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Factory cost: ");
			double factoryCost = sc.nextDouble();
			double percentage = 0.28;
			double taxes = 0.45;
			double newCarCost = (factoryCost + (factoryCost * taxes)) * percentage
							  +  factoryCost + (factoryCost * taxes);
			System.out.printf("New car cost: %.2f", newCarCost);
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}

		sc.close();
	}
}
