import java.io.IOException;
 import java.util.Scanner;
/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args)  {

		/**
		 * Escreva a sua solução aqui Code your solution here Escriba su
		 * solución aquí
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