package capgemini.exerciciosSintaxe.exercicio18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio18 {

	public static String result(String name, int age) {
		
		String ageCheck = (age >= 18) ? "is of legal age" : "is a minor";
		
		return String.format("Name: %s, age: %d / %s", name, age, ageCheck);
	}

	public static void main(String args[]) {

		String[] arr = {"Ana", "Alex", "Beatriz", "Bruno", "Alessandra",
						"Letícia", "João", "André", "Juliana", "Vitor",
						"Felipe", "Fernando", "Luana", "Lucas", "Bruna"};
		
		List<String> names = new ArrayList<String>(Arrays.asList(arr));
		List<Integer> ages = new ArrayList<Integer>();
		
		for (int i = 0; i < names.size(); i++) {
			ages.add((int)(Math.random() * 60) + 1); // add a random number range 1 to 60 to the list
		}
		
		Collections.shuffle(names); // shuffle the list
		System.out.println(names);
		System.out.println(ages);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(result(names.get(i), ages.get(i)));
		}
		
	}

}
