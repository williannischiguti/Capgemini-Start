package capgemini.exerciciosSintaxe.exercicio6;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main (String args []) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Enter the value to 'A': ");
			int A = sc.nextInt();
			System.out.print("Enter the value to 'B': ");
			int B = sc.nextInt();
			int C;
	
			C = B;
			B = A;
			A = C;
			
			System.out.println("Value of 'A': " + A);
			System.out.println("Value of 'B': " + B);
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		sc.close();
	}
}
