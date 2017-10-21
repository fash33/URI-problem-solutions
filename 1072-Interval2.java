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
		
		int count = sc.nextInt(), nums = 0 ;
				
		for(int i = 0; i < count; i++) {
			int input = sc.nextInt();
			nums = input >= 10 && input <=20?nums+1:nums;
		}
				
		System.out.printf("%d in%n%d out%n",nums, count-nums);
	
	}
}