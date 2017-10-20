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

		int days = sc.nextInt(), months = 0, years = 0, left = days;
		while (days > 0) {
			if (days >= 365) {
				years++;
				days -= 365;
			} else
				break;
		}
		while (days > 0) {
			if (days >= 30) {
				months++;
				days -= 30;
			} else
				break;

		}

		String re = String.format("%d ano(s)%n%d mes(es)%n%d dia(s)%n", years, months, days);
		System.out.print(re);
	}

}