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
    	String name;
    	double salary, bonus , percentage, total;
    	name = sc.nextLine();
    	salary = sc.nextDouble();
    	bonus = sc.nextDouble();
    	percentage = (bonus/100)*15;
    	total = salary + percentage;
    	
    	
    	String re = String.format("TOTAL = R$ %.2f%n",total);
    	System.out.print(re);
    	
 
    }
 
}