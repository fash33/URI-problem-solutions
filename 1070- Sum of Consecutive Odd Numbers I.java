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
		
		int firstNum = sc.nextInt(), secondNum = sc.nextInt(), sum = 0 ;
		
		if(firstNum < secondNum) {
		for(int i = firstNum+1 ; i < secondNum ;i++){
			sum = (i%2!=0)?(sum+=i):sum;
		}
		}
		else {
			for(int i = secondNum+1 ; i < firstNum ;i++){
				sum = (i%2!=0)?(sum+=i):sum;
			}
		}
		
		System.out.printf("%d%n",sum);
	}
}