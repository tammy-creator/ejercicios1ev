package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hora;
		int minuto;
		int segundo;
		
		Scanner teclado = new Scanner(System.in);
				
		System.out.println("Introduce una hora: ");
		hora = teclado.nextInt();		
		System.out.println("Introduce un minuto: ");
		minuto = teclado.nextInt();
		System.out.println("Introduce un segundo: ");
		segundo = teclado.nextInt();
		
		if(segundo==59) {
			minuto++;
			segundo=-1;
			}
		if(minuto>59) {
			hora++;
			minuto=0;
		}
		if(hora>24) {
			hora=0;
		}
		System.out.println("La hora final es: "+hora+":"+minuto+":"+(segundo+1));
		
	}

}
