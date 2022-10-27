package capgemini.exerciciosSintaxe.exercicio23;

public class Exercicio23 {

	public static String result(int number) {
		
		if (number > 80) {
			return String.format(String.valueOf(number) + " is greater than 80") ;
		} else if (number < 25) {
			return String.format(String.valueOf(number) + " is less than 25");
		} else if (number == 40) {
			return String.format(String.valueOf(number) + " is equal to 40");
		} else {
			return String.valueOf(number);
		}
	}

	public static void main(String args[]) {

		System.out.println(result((int) (Math.random() * 200) + 1));
	}
}
