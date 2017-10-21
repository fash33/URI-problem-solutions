import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args) throws IOException {

		/**
		 * Escreva a sua solução aqui Code your solution here Escriba su
		 * solución aquí
		 */
		Scanner sc = new Scanner(System.in);

		int a;
		a = sc.nextInt();
		switch(a) {
		case 61:
			System.out.printf("Brasilia%n");
			break;
		case 71:
			System.out.printf("Salvador%n");
			break;
		case 11:
			System.out.printf("Sao Paulo%n");
			break;
		case 21:
			System.out.printf("Rio de Janeiro%n");
			break;
		case 32:
			System.out.printf("Juiz de Fora%n");
			break;
		case 19:
			System.out.printf("Campinas%n");
			break;
		case 27:
			System.out.printf("Vitoria%n");
			break;
		case 31:
			System.out.printf("Belo Horizonte%n");
			break;
		default:
				System.out.printf("DDD nao cadastrado%n");
				break;
				
		}
			
	}

}