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

		int a;
		a = sc.nextInt();
		

		switch(a) {
			case 1:
				System.out.printf("January%n");
				break;
			case 2:
				System.out.printf("February%n");
				break;
			case 3:
				System.out.printf("March%n");
				break;
			case 4:
				System.out.printf("April%n");
				break;
			case 5:
				System.out.printf("May%n");
				break;
			case 6:
				System.out.printf("June%n");
				break;
			case 7:
				System.out.printf("July%n");
				break;
			case 8:
				System.out.printf("August%n");
				break;
			case 9:
				System.out.printf("September%n");
				break;
			case 10:
				System.out.printf("October%n");
				break;
			case 11:
				System.out.printf("November%n");
				break;
			case 12:
				System.out.printf("December%n");
				break;
		}
	}

}
