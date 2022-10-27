package capgemini.exerciciosSintaxe.exercicio33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio33 {
	
	public static double salary(int level, int hoursPerClass) {
		
		if (level == 1) {
			return hoursPerClass * 12;
		} else if (level == 2) {
			return hoursPerClass * 17;
		} else if (level == 3) {
			return hoursPerClass * 25;
		}
		return 0;
	}
	
	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.print("Enter the total hours per class: ");
			int hoursPerClass = sc.nextInt();
			System.out.print("Enter the teacher level (1, 2 or 3): ");
			int level = sc.nextInt();
			
			System.out.println((level == 1 || level == 2 || level == 3) ? 
				  String.format("Salary: R$ %.2f", salary (level, hoursPerClass))  : "Invalid level");
			
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Must be an Integer");
		}
		

	}

}
