import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solu��o execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {
	static double total=0.0;

	public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solu��o aqui
         * Code your solution here
         * Escriba su soluci�n aqu�
         */
    	Scanner sc = new Scanner(System.in);
    	
    	double radius,area;
    		radius = sc.nextDouble();
	    	area = (4/3.0)*3.14159*radius*radius*radius;
    	
    	
    	String re = String.format("VOLUME = %.3f%n",area);
    	System.out.print(re);
    	
 
    }

}