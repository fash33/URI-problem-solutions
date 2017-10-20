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

		double a, b;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		
		if(a == 0.0 && b == 0.0 ) 
			System.out.printf("Origem%n");
		else if(a == 0.0)
			System.out.printf("Eixo Y%n");
		else if(b == 0.0)
			System.out.printf("Eixo X%n");
		
		else if (a > 0 && b > 0)
			System.out.printf("Q1%n");
		else if (a < 0 && b > 0)
			System.out.printf("Q2%n");
		else if (a < 0 && b < 0)
			System.out.printf("Q3%n");
		else 
			System.out.printf("Q4%n");	
		}

}