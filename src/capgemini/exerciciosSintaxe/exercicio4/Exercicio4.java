package capgemini.exerciciosSintaxe.exercicio4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	
	public static double comission (String name, double salary, double salesAmount, int comission) {
		return salary + (salesAmount * ((double) comission/100));
	}
	
	
	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		try {
			System.out.print("Seller name: ");
			String seller = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.print("Sales amount: ");
			double salesAmount = sc.nextDouble();
			System.out.print("Comission: ");
			int comission = sc.nextInt();
			
			System.out.printf("Comission calculated: %.2f", comission(seller, salary, salesAmount, comission));
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		sc.close();
	}

}
