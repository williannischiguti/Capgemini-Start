package capgemini.exerciciosSintaxe.exercicio15;

public class Exercicio15 {

	public static String result(int number) {
		
		return (number >= 100 && number <= 200) ? String.format(number + " is between 100 and 200")
											: String.format(number + " is not between 100 and 200");
	}

	public static void main(String args[]) {

		System.out.println(result(150));
	}

}
