import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {

		/**
		 * Escreva a sua solu��o aqui Code your solution here Escriba su
		 * soluci�n aqu�
		 */
		Scanner sc = new Scanner(System.in);

		int a, b;
		double total=0;
		a = sc.nextInt();
		b = sc.nextInt();
		
		switch(a) {
		case 1:
			total = b*4.00;
			break;
		case 2: 
			total = b*4.50;
			break;
		case 3: 
			total = b*5.00;
			break;
		case 4: 
			total = b*2.00;
			break;
		case 5: 
			total = b*1.50;
			break;
		
		
		}
		String re = String.format("Total: R$ %.2f%n", total);
		System.out.print(re);

	}

}