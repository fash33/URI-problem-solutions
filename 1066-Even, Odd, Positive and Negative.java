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
		
		int even =0, odd = 0, pos = 0, neg = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			int num = sc.nextInt();
			
			if (num % 2 == 0) 
				even++;
			
			else
				odd++;
			
			if(num==0) continue;
			
			else if(num > 0) 
				pos++;
			
			else
				neg++;
			
		}
		
		System.out.printf("%d valor(es) par(es)%n%d valor(es) impar(es)%n%d valor(es) positivo(s)%n%d valor(es) negativo(s)%n", even,odd,pos,neg);
	
	}
}