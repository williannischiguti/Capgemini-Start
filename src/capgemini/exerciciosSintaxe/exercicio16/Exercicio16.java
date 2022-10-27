package capgemini.exerciciosSintaxe.exercicio16;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

	public static String result(String student, double[] grades) {

		if (Arrays.stream(grades).average().getAsDouble() >= 7) {
			return String.format("Student: %s / Average grade: %.1f / Status: approved", student,
					Arrays.stream(grades).average().getAsDouble());
			
		} else if (Arrays.stream(grades).average().getAsDouble() <= 5) {
			return String.format("Student: %s / Average grade: %.1f / Status: failed by grade", student,
					Arrays.stream(grades).average().getAsDouble());
			
		} else {
			return String.format("Student: %s / Average grade: %.1f / Status: grade recovery", student,
					Arrays.stream(grades).average().getAsDouble());
		}

	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Student name: ");
		String student = sc.nextLine();
		double[] grades = new double[3];

		for (int i = 0; i < grades.length; i++) {
			System.out.printf("Grade nº %d: ", i + 1);
			grades[i] = sc.nextDouble();
		}

		System.out.println(result(student, grades));

		sc.close();
	}
}
