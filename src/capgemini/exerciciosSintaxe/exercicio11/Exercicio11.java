package capgemini.exerciciosSintaxe.exercicio11;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
	
	public static void main (String args []) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Cost price: ");
			double costPrice = sc.nextDouble();
			System.out.print("Addition: ");
			int addition = sc.nextInt();
			
			System.out.printf("Sale price: %.2f", costPrice+(costPrice*addition/100));
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		
		
		sc.close();
	}
}
