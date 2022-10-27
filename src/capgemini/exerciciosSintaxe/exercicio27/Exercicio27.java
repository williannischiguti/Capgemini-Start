package capgemini.exerciciosSintaxe.exercicio27;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {

	public static double calculateDiscount(double vehicleValue, int fuelType) {

		double discount = 0;

		switch (fuelType) {
		case 1:
			discount = vehicleValue * 0.25;
			break;
		case 2:
			discount = vehicleValue * 0.21;
			break;
		case 3:
			discount = vehicleValue * 0.14;
			break;
		default:
			return discount;
		}
		return discount;
	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double totalDiscount = 0;
		double totalAmount = 0;
		int count = 0;

		while (true) {

			try {
			System.out.printf("Vehicle nº%d%n", count + 1);
			System.out.print("Vehicle value: ");
			double vehicleValue = sc.nextDouble();

			if (vehicleValue == 0) {
				break;
			}

			System.out.print("Fuel type: 1 - Alcohol | 2 - Gasoline | 3 - Diesel: ");
			int fuelType = sc.nextInt();
			double discount = calculateDiscount(vehicleValue, fuelType);
			double amount = vehicleValue - discount;

			System.out.printf("Discount: %.2f%n", discount);
			System.out.printf("Amount: %.2f%n", amount);
			System.out.println();

			totalDiscount += discount;
			totalAmount += amount;
			count ++;
			} catch (InputMismatchException e) {
				System.out.println("Invalid number format");
				break;
			}
		}

		sc.close();
		System.out.printf("Total discount: %.2f%n", totalDiscount);
		System.out.printf("Total amount: %.2f%n", totalAmount);

	}
}
