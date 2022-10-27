package capgemini.exerciciosSintaxe.exercicio17;

import java.util.ArrayList;
import java.util.List;

public class Exercicio17 {

	public static int result(List<Integer> list) {
		
		int count = 0;
		
		for (int number : list) {
			if (number >= 10 && number <= 150) {
				count ++;
			}
		}
		
		return count;
	}
	
	public static void main (String args[]) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 80; i++) {
			list.add((int)(Math.random() * 500) + 1); // Add a random number range 1 to 500 to the list
		}
		
		System.out.println("List size: " + list.size());
		System.out.println("List of numbers:");
		System.out.println(list);
		
		System.out.println(result(list));
	}
	
}
