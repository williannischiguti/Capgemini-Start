package capgemini.exerciciosSintaxe.exercicio35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio35 {

	public static double calculate(int previousReading, int currentReading, int category) {

		if (category == 1) {
			return (currentReading - previousReading) * 0.60;
		} else if (category == 2) {
			return (currentReading - previousReading) * 0.48;
		} else if (category == 3) {
			return (currentReading - previousReading) * 1.29;
		}

		return 0;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Previous reading: ");
			int previousReading = sc.nextInt();
			System.out.print("Current reading: ");
			int currentReading = sc.nextInt();
			System.out.print("Consumption category (1 - Residence | 2 - Business | 3 - Industry): ");
			int category = sc.nextInt();

			if ((previousReading > 0 && currentReading > 0) && 
				(category == 1 || category == 2 || category == 3) &&
				(currentReading > previousReading)) {
				System.out.printf("Month consumption: R$ %.2f", calculate(previousReading, currentReading, category));
			} else {
				System.out.println("Reading error");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Must be an Integer");
		}

		sc.close();
	}

}
