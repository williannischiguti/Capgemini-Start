package capgemini.exerciciosSintaxe.exercicio25;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio25 {

	public static String result(int number1, int number2) {

		int higherNumber = (number1 > number2) ? number1 : number2;

		return (number1 != number2)
				? String.format("%d is different from %d and the greater "
							  + "number is: %d", number1, number2, higherNumber)
				: String.format("%d is equal to %d", number1, number2);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		try {
		System.out.print("Enter the first number: ");
		int number1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int number2 = sc.nextInt();

		System.out.println(result(number1, number2));
		} catch (InputMismatchException e) {
			System.out.println("Number must be an Integer");
		}

		sc.close();
	}
}
