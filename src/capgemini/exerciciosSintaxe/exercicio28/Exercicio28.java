package capgemini.exerciciosSintaxe.exercicio28;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {

	public static double calculateNewSalary(double salary, double basicSalary) {

		if (salary < (3 * basicSalary)) {
			return salary * 1.50;
		} else if (salary >= (3 * basicSalary) && salary <= (10 * basicSalary)) {
			return salary * 1.20;
		} else if (salary > (10 * basicSalary) && salary <= (20 * basicSalary)) {
			return salary * 1.15;
		} else {
			return salary * 1.10;
		}
	}

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the number of employees: ");
			int numberOfEmployees = sc.nextInt();
			double previusTotalSalary = 0;
			double totalSalary = 0;

			for (int i = 0; i < numberOfEmployees; i++) {
				sc.nextLine();
				System.out.print("Employee: ");
				String employee = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				System.out.print("Basic salary: ");
				double basiscSalary = sc.nextDouble();

				double newSalary = calculateNewSalary(salary, basiscSalary);
				System.out.println();
				System.out.printf("Employee%d: %s%n", i + 1, employee);
				System.out.printf("Salary readjustment: %.2f%n", newSalary - salary);
				System.out.printf("New salary: %.2f%n", newSalary);
				System.out.println();

				previusTotalSalary += salary;
				totalSalary += newSalary;
			}
			
			System.out.printf("Previus total salary: %.2f%n", previusTotalSalary);
			System.out.printf("Current total salary: %.2f%n", totalSalary);
			System.out.printf("Difference: %.2f%n", totalSalary - previusTotalSalary);
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}

		sc.close();
	}
}
