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
		double[] ar = sort(a, b, c);
		a = ar[0];
		b = ar[1];
		c = ar[2];

		if (a >= b + c) {
			System.out.printf("NAO FORMA TRIANGULO%n");
			System.exit(0);
			;
		}
		if (a * a == ((b * b) + (c * c)))
			System.out.printf("TRIANGULO RETANGULO%n");

		if ((a * a) > ((b * b) + (c * c)))
			System.out.printf("TRIANGULO OBTUSANGULO%n");

		if ((a * a) < ((b * b) + (c * c)))
			System.out.printf("TRIANGULO ACUTANGULO%n");

		if (a == b && b == c)
			System.out.printf("TRIANGULO EQUILATERO%n");

		if (a == b && a != c || a == c && a != b || b == c && b != a)
			System.out.printf("TRIANGULO ISOSCELES%n");
	}

	public static double[] sort(double a, double b, double c) {
		double mid = 0.0, min = 0.0, max = 0.0, arr[] = new double[3];

		if (a > b) {

			if (a > c) {
				max = a;
				if (b > c) {
					mid = b;
					min = c;
				} else {
					mid = c;
					min = b;
				}

			} else {
				max = c;
				if (a > b) {
					mid = a;
					min = b;
				} else {
					mid = b;
					min = a;
				}
			}

		} else {
			if (b > c) {
				max = b;
				if (a > c) {
					mid = a;
					min = c;
				} else {
					mid = c;
					min = a;
				}
			} else {
				max = c;
				if (a > b) {
					mid = a;
					min = b;
				} else {
					mid = b;
					min = a;
				}

			}

		}
		arr[0] = max;
		arr[1] = mid;
		arr[2] = min;
		return arr;
	}
}