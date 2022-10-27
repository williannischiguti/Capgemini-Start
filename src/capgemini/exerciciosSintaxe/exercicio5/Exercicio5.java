package capgemini.exerciciosSintaxe.exercicio5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	
	public static double averageGrade(double[] grades) {
		return Arrays.stream(grades).average().getAsDouble();
	}
	
	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] grades = new double[3];
		
		try {
			System.out.print("First grade: ");
			grades[0] = sc.nextDouble();
			System.out.print("Second grade: ");
			grades[1] = sc.nextDouble();
			System.out.print("Third grade: ");
			grades[2] = sc.nextDouble();
			
			System.out.printf("Average grade: %1f", averageGrade(grades));	
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		
		sc.close();
	}

}
