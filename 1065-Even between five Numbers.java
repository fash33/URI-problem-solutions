import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Escreva a sua solu��o aqui Code your solution here Escriba su
		 * soluci�n aqu�
		 */
		Scanner sc = new Scanner(System.in);
		int a = 0;
		for (int i = 1; i <= 5; i++) {
			double num = sc.nextInt();
			if (num % 2 == 0) {
				a++;
			}
		}
		System.out.printf("%d valores pares%n", a);
	}
}