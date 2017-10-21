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

		float a, b = 0.0f, per = 0.0f;
		a = sc.nextFloat();
		

		if (a <= 2000) {
			System.out.printf("Isento%n");
			System.exit(0);
		}

		for (float i = a; i>2000;) {

			if (i > 4500) {
				b = i - 4500;
				i = i - b;
				per += b * (28 / 100.0f);
			}

			else if (i > 3000 && i <= 4500) {
				b = i - 3000;
				i = i - b;
				per += b * (18 / 100.0f);
			}

			if (i > 2000 && i <= 3000) {
				b = i - 2000;
				i = i - b;
				per += b * (8 / 100.0f);
			}
			
		}

		System.out.printf("R$ %.2f%n",per);

	}

}