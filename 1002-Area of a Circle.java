import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {
 
      public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
        Scanner sc = new Scanner(System.in);
		double R , A;
		R = sc.nextDouble();
		A = 3.14159 *R*R;
		String re = String.format("A=%.4f%n", A);
		System.out.print(re);
    }
 
}