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

		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b % a == 0 || a % b == 0)
			System.out.printf("Sao Multiplos%n" );

		else
			System.out.printf("Nao sao Multiplos%n" );

	}
}