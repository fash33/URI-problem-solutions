import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Escreva a sua solução aqui Code your solution here Escriba su
		 * solución aquí
		 */
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt(), start = 0;
		
		start = input%2!=0?input:input+1;
		
		for(int i =start; i < start + 12 ;i+=2)
			System.out.printf("%d%n",i);
	
	}
}