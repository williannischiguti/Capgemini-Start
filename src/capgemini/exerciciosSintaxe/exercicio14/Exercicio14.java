package capgemini.exerciciosSintaxe.exercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the first number: ");
			int number1 = sc.nextInt();
			System.out.print("Enter the second number: ");
			int number2 = sc.nextInt();
			
			if (number1 == number2) {
				System.out.println("Same values");
			} else {
				System.out.printf("Biggest number: %d", (number1 > number2) ? number1 : number2);
			}
		} catch (InputMismatchException e) {
			System.out.println("Must be an integer");
		}
		
		sc.close();
	}
}
