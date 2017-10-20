import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
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