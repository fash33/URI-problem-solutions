import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {
	static double total=0.0;

	public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    	Scanner sc = new Scanner(System.in);
    	
    	double x1,y1,x2,y2,dist, distance;
    		x1 = sc.nextDouble();
    		y1 = sc.nextDouble();
    		x2 = sc.nextDouble();
    		y2 = sc.nextDouble();
    		dist = Math.pow(x2 - x1,2)+Math.pow(y2 - y1,2);
    		distance = Math.sqrt(dist);     	
    	String re = String.format("%.4f%n",distance);
    	System.out.print(re);
    	
 
    }

}