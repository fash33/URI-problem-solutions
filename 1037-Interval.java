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
		a = sc.nextDouble();
		
		if (a <0 || a>100)
			System.out.println("Fora de intervalo");
		else if(a<=25){
			System.out.println("Intervalo [0,25]");
		}
		else if(a>25 && a<=50) {
			System.out.println("Intervalo (25,50]");
		}
		else if(a>50 && a<=75) {
			System.out.println("Intervalo (50,75]");
		}
		else 
			System.out.println("Intervalo (75,100]");
		
	
	}

}