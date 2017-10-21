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

		String a, b, c;
		
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine();
		
		switch(a) {
		case "vertebrado":
			switch(b) {
				case"ave":
					switch(c) {
						case "carnivoro":
							System.out.println("aguia");
						break;
						case "onivoro":
							System.out.println("pomba");
						break;
					}
				break;
				case "mamifero":
					switch(c) {
					case "onivoro":
						System.out.println("homem");
					break;
					case "herbivoro":
						System.out.println("vaca");
					break;
				}
				break;
				
			}
			break;
		case "invertebrado":
			switch(b) {
				case "inseto":
					switch(c) {
					case "hematofago":
						System.out.println("pulga");
					break;
					case "herbivoro":
						System.out.println("lagarta");
					break;
				}
				break;
				case "anelideo":
					switch(c) {
					case "hematofago":
						System.out.println("sanguessuga");
					break;
					case "onivoro":
						System.out.println("minhoca");
					break;
				}
				break;
			}
			break;
		}
			
	}

}