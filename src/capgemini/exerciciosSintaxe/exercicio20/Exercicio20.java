package capgemini.exerciciosSintaxe.exercicio20;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static double calculateDiscount(double carValue, int year) {
		return (year <= 2000) ? carValue * 0.12 : carValue * 0.07;
	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int oldCar = 0;
		int car = 0;

		while (true) {

			try {
				
			System.out.println("***CARANGO VELHO***");
			System.out.println("Would you like to calculate the discount? 1 - Yes 2 - no");
			int choice = sc.nextInt();

			if (choice == 2) {
				break;
			}
			if (choice == 1) {
				System.out.print("Enter the car value: ");
				double carValue = sc.nextDouble();
				System.out.print("Enter the car manufactoring year: ");
				int year = sc.nextInt();

				car += 1;
				if (year <= 2000) {
					oldCar += 1;
				}

				System.out.printf("Discount amount: %.2f%n", calculateDiscount(carValue, year));
				System.out.printf("Final amount: %.2f%n", carValue - calculateDiscount(carValue, year));
				System.out.println();
			}
			} catch (InputMismatchException e) {
				System.out.println("Invalid number format");
				break;
			} 
		}
		
		System.out.printf("Total cars from the 2000s: %d%n", oldCar);
		System.out.printf("Total cars: %d%n", car);
		
		sc.close();
	}
}
