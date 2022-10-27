package capgemini.exerciciosSintaxe.exercicio34;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio34 {
	
	public static String result (int age) {
		
		if (age >=5 && age <=7) {
			return "Infant A";
		} else if (age >=8 && age <=10) {
			return "Infant B";
		} else if (age >=11 && age <=13) {
			return "Juvenile A";
		} else if (age >=14 && age <=17) {
			return "Juvenile B";
		} else if (age >=18 && age <= 25) {
			return "Senior";
		} else {
			return "Age out of age range";
		}
		
	}
	
	public static void main (String args []) {
		
		Scanner sc = new Scanner (System.in);
		
		try {
		System.out.print("Swimmer's age: ");
		int age = sc.nextInt();
		System.out.println(result(age));
		
		sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Must be an Integer");
		}
	}

}
