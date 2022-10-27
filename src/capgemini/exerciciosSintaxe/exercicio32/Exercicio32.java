package capgemini.exerciciosSintaxe.exercicio32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio32 {

	public static String result(int A, int B, int C) {
		
		if (B - C < A && A < B + C && 
			A - C < B && B < A + C && 
			A - B < C && C < A + B) {
			if (A == B && B == C) {
				return "Equilateral triangle";
			} else if (A == B || B == C || A == C) {
				return "Isosceles triangle";
			} else if (A != B && B != C) {
				return "Scalene triangle";
			}
		} else {
			return "Invalid triangle";
		}
		
		return null;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		try {
		System.out.print("Enter the first integer: ");
		int A = sc.nextInt();
		System.out.print("Enter the second integer: ");
		int B = sc.nextInt();
		System.out.print("Enter the third integer: ");
		int C = sc.nextInt();
		
		System.out.println(result(A, B, C));
		} catch (InputMismatchException e) {
			System.out.println("Must be an Integer");
		}

		sc.close();
	}

}
