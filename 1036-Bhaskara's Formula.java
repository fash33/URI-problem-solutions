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

		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double d = (b * b) - (4 * a * c);
		if (a <= 0 || b <= 0 || c <= 0 || d <= 0)
			System.out.println("Impossivel calcular");
		else {
			double r1 = (-b + Math.sqrt(d)) / (2 * a);
			double r2 = (-b - Math.sqrt(d)) / (2 * a);

			String re = String.format("R1 = %.5f%nR2 = %.5f%n", r1, r2);
			System.out.print(re);
		}
	}

}