import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

	public static void main(String[] args)  {

		/**
		 * Escreva a sua solu��o aqui Code your solution here Escriba su
		 * soluci�n aqu�
		 */
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		double sum=0.0;
		for(int i = 1 ; i <= 6 ; i ++) {
			double num = sc.nextDouble();
			if(num >= 0) {
				sum += num;
				pos++;
			}
		}
		System.out.printf("%d valores positivos%n%.1f%n",pos,sum/pos);
		}

	
}