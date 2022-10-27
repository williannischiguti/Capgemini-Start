package capgemini.exerciciosSintaxe.exercicio7;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	
	public static double convert (double degrees) {
		return (degrees*9/5) + 32;
	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Degrees Celsius: ");
			int degrees = sc.nextInt();
			
			if (convert(degrees) == (int)convert(degrees)) {
				System.out.printf("Converted to degrees Fahrenheit: %.0f", convert(degrees));
			} else {
				System.out.printf("Converted to degrees Fahrenheit: %.1f", convert(degrees));
			}
			
		} catch(InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		sc.close();
	}

}
