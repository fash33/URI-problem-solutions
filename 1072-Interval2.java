import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Escreva a sua solu��o aqui Code your solution here Escriba su
		 * soluci�n aqu�
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