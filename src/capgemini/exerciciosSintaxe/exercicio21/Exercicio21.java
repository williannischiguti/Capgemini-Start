package capgemini.exerciciosSintaxe.exercicio21;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio21 {

	public static boolean result(String name, char gender, int yearOfBirth, int health, int currentYear) {

		return (gender == 'M' && currentYear - yearOfBirth >= 18 && 
				currentYear - yearOfBirth <= 45 && health == 1) ? true: false;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		LocalDate date = LocalDate.now();
		int currentYear = date.getYear();

		System.out.println("***Military service***");
		System.out.print("Enter the number of checks: ");
		int n = sc.nextInt();
		int approved = 0;
		int notApproved = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Check nº %d%n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Gender: ");
			char gender = sc.next().toUpperCase().charAt(0);
			System.out.print("Year of birth: ");
			int yearOfBirth = sc.nextInt();
			System.out.print("Health: 1 - Healthy 2 - Not Healthy ");
			int health = sc.nextInt();

			if (result(name, gender, yearOfBirth, health, currentYear)) {
				System.out.printf("Name: %s | Gender: %s | Year of Birth: %d", name, gender, yearOfBirth);
				approved += 1;
			} else {
				notApproved += 1;
			}
			System.out.println();
		}

		System.out.printf("Total approved: %d%n", approved);
		System.out.printf("Total not approved: %d%n", notApproved);

		sc.close();
	}
}
