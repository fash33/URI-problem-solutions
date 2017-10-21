import java.util.Scanner;
/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	public static void main(String[] args)  {

		/**
		 * Escreva a sua solução aqui Code your solution here Escriba su
		 * solución aquí
		 */
		Scanner sc = new Scanner(System.in);
//		bufferedreader diye
//		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//		do {
//			System.out.println(sc.readLine());
//		}while (sc!= null);
		//scanner diy
		int day =0, hour=0, min=0 , sec=0 ; 
		String daye = sc.next();
		int day1 = sc.nextInt();
		
		int hour1 = sc.nextInt();
		String col1 = sc.next();
		int min1 = sc.nextInt();
		String col2 = sc.next();
		int sec1 = sc.nextInt();
		
		String dayo = sc.next();
		int day2 = sc.nextInt();
		
		int hour2 = sc.nextInt();
		String col3 = sc.next();
		int min2 = sc.nextInt();
		String col4 = sc.next();
		int sec2 = sc.nextInt();
		
		if(sec2 >= sec1) 
			sec = sec2 - sec1;
		else {
			sec = (60-sec1) + (sec2 - 0);
			min2--;
		}
		if(min2 >= min1) 
			min = min2 - min1;
		else {
			min = (60-min1) + (min2 - 0);
			hour2--;
		}
		if(hour2 >= hour1) 
			hour = hour2 - hour1;
		else {
			hour = (24-hour1) + (hour2 - 0);
			day2--;
		}
		
		day = day2 - day1;
		System.out.printf("%d dia(s)%n%d hora(s)%n%d minuto(s)%n%d segundo(s)%n",day,hour,min,sec);;
	}

	
}