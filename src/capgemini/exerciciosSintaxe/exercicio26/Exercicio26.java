package capgemini.exerciciosSintaxe.exercicio26;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Exercicio26 {
	
	public static String result (int number) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "One"); map.put(2, "Two"); map.put(3, "Three");
		map.put(4, "Four"); map.put(5, "Five");
		
		return (number >= 1 && number <=5) ? map.get(number) : "Invalid number";
	}
	
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println(result(number));
		} catch (InputMismatchException e) {
			System.out.println("Invalid number format");
		}
		sc.close();
	}
}
