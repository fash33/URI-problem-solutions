import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {
	static double total = 0.0;

	public static void main(String[] args) throws IOException {

		/**
		 * Escreva a sua solu��o aqui Code your solution here Escriba su
		 * soluci�n aqu�
		 */
		Scanner sc = new Scanner(System.in);

		int time, avg;
		double dist, total;
		time = sc.nextInt();
		avg = sc.nextInt();
		dist = time * avg;
		total = dist / 12;
		String re = String.format("%.3f%n", total);
		System.out.print(re);

	}

}