package capgemini.exerciciosSintaxe.exercicio3;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static double consumoMedio(double distance, double fuel) {
		return distance/fuel;
	}
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Enter the distance: ");
			double distance =  sc.nextDouble();
			System.out.print("Enter the fuel used: ");
			double fuel = sc.nextDouble();
			
			System.out.printf("Average consumption: %.1f%n", consumoMedio(distance, fuel));
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		
		sc.close();
	}
}
