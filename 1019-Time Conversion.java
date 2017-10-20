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

		int secs= sc.nextInt(), mins = 0, hours = 0 ;
		while (secs > 0) {
			if (secs >= 60) {
				mins++;
				secs -= 60;
			} else
				break;
		}
		while (mins > 0) {
			if (mins >= 60) {
				hours++;
				mins -= 60;
			}
			else 
				break;

		}

		String re = String.format("%d:%d:%d%n",hours, mins, secs);
		System.out.print(re);
	}

}
