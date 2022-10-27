package capgemini.exerciciosSintaxe.exercicio24;

public class Exercicio24 {

	public static String result(int number) {

		if (number > 0) {
			return String.format(String.valueOf(number) + " is positive");
		} else if (number < 0) {
			return String.format(String.valueOf(number) + " is negative");
		} else {
			return String.format(String.valueOf(number) + " = zero");
		}
	}

	public static void main(String args[]) {

		int random = (int) (Math.random() * 2) + 1;
		int number = (int) (Math.random() * 100) + 0;

		if (random == 2) {
			number = -number;
		}

		System.out.println(result(number));
	}
}
