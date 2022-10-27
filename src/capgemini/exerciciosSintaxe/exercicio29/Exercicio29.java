package capgemini.exerciciosSintaxe.exercicio29;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Exercicio29 {

	public static String result(int month) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "January"); map.put(2, "February"); map.put(3, "March"); map.put(4, "April");
		map.put(5, "May"); map.put(6, "June"); map.put(7, "July"); map.put(8, "August");
		map.put(9, "September"); map.put(10, "October"); map.put(11, "November"); map.put(12, "December");
		
		return (map.containsKey(month)) ? map.get(month) : "Invalid month number";
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter a month number: ");
			int month = sc.nextInt();
			System.out.println(result(month));
		} catch (InputMismatchException e) {
			System.out.println("Must be an Integer");
		}

		sc.close();
	}
}
