package capgemini.exerciciosSintaxe.exercicio13;

public class Exercicio13 {

	public static String result (double value) {
		
		return (value > 10) ? "Greater than 10" : "Less than 10";
	}
	
	public static void main (String args[]) {
		
		System.out.println(result(55));
	}
}
