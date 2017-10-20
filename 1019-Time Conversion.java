import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {

		/**
		 * Escreva a sua solução aqui Code your solution here Escriba su
		 * solución aquí
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
