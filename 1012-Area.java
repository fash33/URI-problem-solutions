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
    	
    	double a,b,c, triangle, trap, circle, square, rectangle;
    		a = sc.nextDouble();
    		b = sc.nextDouble();
    		c = sc.nextDouble();
    		
    		triangle = (a*c)/2;
    		circle = 3.14159*c*c;
    		trap = ((a+b)/2)*c;
    		square = b*b;
    		rectangle = a*b;
    		
    	
    	String re = String.format("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n",triangle, circle, trap, square, rectangle);
    	System.out.print(re);
    	
 
    }

}
