package capgemini.exerciciosSintaxe.exercicio8;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Amount R$: ");
			double brCoin = sc.nextDouble();
			
			System.out.print("Dollar quote: ");
			double dollarQuote = sc.nextDouble();
			
			System.out.printf("Amount of dollars: U$ %.2f", brCoin * dollarQuote);		
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		
		sc.close();
	}

}
