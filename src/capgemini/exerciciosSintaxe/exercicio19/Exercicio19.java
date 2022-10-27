package capgemini.exerciciosSintaxe.exercicio19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio19 {

	public static String result(String name, int gender) {
		
		char charGender = (gender == 1) ? 'M' : 'W';
		String genderCheck = (gender == 1) ? "is male" : "is woman";
		
		return String.format("Name: %s, gender: %s / %s", name, charGender, genderCheck);
	}

	public static void main(String args[]) {

		String[] arr = {"Abc", "Bcd", "Cde", "Def", "Efg",
						"Fgh", "Ghi", "Hij", "Ijk", "Jkl",
						"Klm", "Lmn", "Mno", "Nop", "Opq"};
		
		List<String> names = new ArrayList<String>(Arrays.asList(arr));
		List<Integer> gender = new ArrayList<Integer>();
		
		for (int i = 0; i < names.size(); i++) {
			gender.add((int)(Math.random() * 2) + 1); // 1 = Male / 2 = Woman
		}
		
		Collections.shuffle(names); // shuffle the list
		System.out.println(names);
		System.out.println(gender);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(result(names.get(i), gender.get(i)));
		}
		
	}

}
