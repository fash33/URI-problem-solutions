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
		float A,B,C;
		double avg;
		A = sc.nextFloat()*2;
		B = sc.nextFloat()*3;
		C = sc.nextFloat()*5;
		avg = (A+B+C)/(2+3+5);
		String re = String.format("MEDIA = %.1f%n", avg);
		System.out.print(re);
    }
 
}