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

		int a, b, c, d, hour = 0, mins = 0;
		a = sc.nextInt();
		c = sc.nextInt();
		b = sc.nextInt();
		d = sc.nextInt();

		if (b > a) {
			if (c > d) {

				for (int i = 60; i > c; i--)
					mins++;

				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", b - a - 1, mins + (d - 0));
			} else
				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", b - a, d - c);
		}

		else {
			if (c > d) {

				for (int i = 24; i > a; i--)
					hour++;
				for (int j = 60; j > c; j--)
					mins++;

				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hour + (b - 0)-1, mins + (d - 0));
			} else {
				for (int i = 24; i > a; i--)
					hour++;

				System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hour + (b - 0), d - c);

			}
		}
	}

}