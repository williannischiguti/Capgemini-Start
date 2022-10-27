package capgemini.exerciciosSintaxe.exercicio30;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio30 {

	public static String result(int[] numbers) {
		
		Arrays.sort(numbers);
		return Arrays.toString(numbers);
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[3];

		try {
			for (int i = 0; i < numbers.length; i++) {
				System.out.printf("Enter the %dº number: ", i + 1);
				int n = sc.nextInt();
				numbers[i] = n;
			}

			System.out.println(result(numbers));
		} catch (InputMismatchException e) {
			System.out.println("Must be an Integer");
		}

		sc.close();
	}
}
