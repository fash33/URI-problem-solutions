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

		int  a, b, c, max=0, mid=0, min=0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		if(a>b) {
			
			if(a>c) {
				max = a;
				if(b>c) {
					mid = b;
					min =c;
				}
				else {
					mid = c;
					min =b ;
				}
					
			}
			else {
				max = c;
				if(a>b) {
					mid =a ;
					min = b;
				}
				else {
					mid = b;
					min = a;
				}
			}
							
		}	
		else {
			if(b>c) {
				max = b;
				if(a>c) {
					mid = a;
					min = c;
				}
				else {
					mid = c;
					min = a;
				}
			}
			else {
				max = c;
				if(a>b){
					mid = a;
					min = b;
				}
				else {
					mid = b;
					min = a;
				}
					
			}
			
		}
		System.out.printf("%d%n%d%n%d%n%n%d%n%d%n%d%n", min,mid,max,a,b,c);
		
	}

	}