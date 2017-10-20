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
		double A,B,avg;
		A = sc.nextDouble()*3.5;
		B = sc.nextDouble()*7.5;
		avg = (A+B)/(3.5+7.5);
		String re = String.format("MEDIA = %.5f%n", avg);
		System.out.print(re);
    }
 
}

