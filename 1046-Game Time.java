import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {

		/**
		 * Escreva a sua solu��o aqui Code your solution here Escriba su
		 * soluci�n aqu�
		 */
		Scanner sc = new Scanner(System.in);

		int a, b, c, dur = 0;
		a = sc.nextInt();
		b = sc.nextInt();

		if (b > a)
			System.out.printf("O JOGO DUROU %d HORA(S)%n", b - a);
		else {
			for (int i = 24; i > a; i--) {
				dur++;
			}

			System.out.printf("O JOGO DUROU %d HORA(S)%n", dur + (b - 0));
		}
	}

}