package capgemini.exerciciosSintaxe.exercicio22;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio22 {

	public static String result(double costPrice, double salePrice) {
		
		if(salePrice - costPrice > 0) {
			return "profit";
		}
		else if (salePrice < costPrice) {
			return "loss";
		} else {
			return "tie";
		}
		
	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			
		System.out.print("Number of products: ");
		int n = sc.nextInt();
		double totalCostPrice = 0;
		double totalSalePrice = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Product nº %d%n", i + 1);
			System.out.print("Product description: ");
			String productDescription = sc.nextLine();
			System.out.print("Cost Price: ");
			double costPrice = sc.nextDouble();
			System.out.print("Sale Price: ");
			double salePrice = sc.nextDouble();
			
			totalCostPrice += costPrice;
			totalSalePrice += salePrice;
			
			System.out.printf("Product nº %d - %s | Cost Price: %.2f | Sale Price: %.2f = %s%n", i + 1, productDescription, costPrice, salePrice, result(costPrice, salePrice));
			System.out.println();
		}
		
		System.out.printf("Total cost price: %.2f%n", totalCostPrice);
		System.out.printf("Total sale price: %.2f%n", totalSalePrice);
		System.out.printf("Average cost price: %.2f%n", totalCostPrice / n);
		System.out.printf("Average sale price: %.2f%n", totalSalePrice / n);
		System.out.printf("Result: %s", result(totalCostPrice, totalSalePrice));

		sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
	}
}
