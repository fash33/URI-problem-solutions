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
		
		int n = sc.nextInt() ;
				
		for(int i = 1; i <= n; i++) {
			int input = sc.nextInt();
			if(input == 0) {
				System.out.printf("NULL%n");
				continue;
			}
			System.out.printf(input%2==0?"EVEN ":"ODD ");
			System.out.printf(input>0?"POSITIVE%n":"NEGATIVE%n");
		
		}	
	}
}