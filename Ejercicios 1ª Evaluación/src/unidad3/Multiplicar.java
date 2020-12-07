package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sol;
		int resultado;
		int fallo = 0;
		String repetir;
		
		do {
			System.out.println("¿Que tabla se desea repasar?");
			Scanner teclado = new Scanner(System.in);
			num=teclado.nextInt();
			
			if(num<=9) {
				for(int i=1;i<=10;i++) {
					System.out.println(num+" x "+i+"= ");
					sol=teclado.nextInt();
					resultado=num*i;
					if(sol!=resultado) {
						fallo++;
						System.out.println("Error, "+num+" x "+i+"= "+resultado);
					}				
				}
				if(fallo<2) {
					System.out.println("Has aprobado");
				}
				else {
					System.out.println("Has suspendido");
				}
				
			}
			else {
				System.out.println("Introduce un número del 1 al 9");
			}
			do{
				System.out.println("¿Desea repasar otra tabla?");
				repetir = teclado.next();
			}
			while(!repetir.equalsIgnoreCase("si") && !repetir.equalsIgnoreCase("no"));
		
		}
		while(repetir.equalsIgnoreCase("si"));
		
		
	}

}
