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

		double a;
		double sal = 0;
		a = sc.nextDouble() ;
		int per = 0;
		if ( a <= 400) {
			per = 15;
			sal = sal = a + ((a*(15/100.0))); 
		}
		else if(a > 400.00 && a <= 800.00 ){
			per = 12;
			sal = a + ((a*(12/100.0))); 
		}
		else if(a > 800.00 && a <= 1200.00 ){
			per = 10;
			sal = a + ((a*(10/100.0))); 
		}
		else if(a > 1200.00 && a <= 2000.00 ){
			per = 7;
			sal = a + ((a*(7/100.0))); 
		}
		else {
			per = 4;
			sal = a + ((a*(4/100.0)));
		}
		System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %d %%\n", sal,sal-a,per);
			
	}

}