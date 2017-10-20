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

		double money; 
		money = sc.nextDouble();
		int left = (int)money;
		int decimal = (int)Math.round(((money%1)*100));
		int   hundreds=0, fifties=0, twenties=0, tens=0, fives=0, twos=0, ones=0, half =0, quarter =0, ten = 0, five = 0, one = 0;
		while(left>0){
			if(left>=100){
				hundreds = left/100;
				left = left%100;
			}
			else if(left>=50){
				fifties = left/50;
				left = left%50;
			}
			else if(left>=20){
				twenties = left / 20;
				left = left%20;
			}
			else if(left>=10){
				tens = left/ 10;
				left = left%10;
			}
			else if(left>=5){
				fives = left/5;
				left = left%5;
			}
			else if(left>=2){
				twos = left /2;
				left = left%2;
			}
			else {
				ones = left/1;
				left = left%1;
			}
		}
		while(decimal>0){
			if(decimal>=50){
				half = decimal/50;
				decimal = decimal%50;
			}
			else if(decimal>=25){
				quarter = decimal/25;
				decimal = decimal%25;
			}
			else if(decimal>=10){
				ten = decimal / 10;
				decimal = decimal%10;
			}
			else if(decimal>=5){
				five = decimal/ 5;
				decimal = decimal%5;
			}
			else {
				one = decimal/1;
				decimal = decimal%1;
				
			}
			
		}
		String re =String.format ("NOTAS:%n%d nota(s) de R$ 100.00%n%d nota(s) de R$ 50.00%n%d nota(s) de R$ 20.00%n%d nota(s) de R$ 10.00%n%d nota(s) de R$ 5.00%n%d nota(s) de R$ 2.00%nMOEDAS:%n%d moeda(s) de R$ 1.00%n%d moeda(s) de R$ 0.50%n%d moeda(s) de R$ 0.25%n%d moeda(s) de R$ 0.10%n%d moeda(s) de R$ 0.05%n%d moeda(s) de R$ 0.01%n",hundreds,fifties,twenties,tens,fives,twos,ones,half,quarter,ten,five,one);
		System.out.print(re);
	}

}
