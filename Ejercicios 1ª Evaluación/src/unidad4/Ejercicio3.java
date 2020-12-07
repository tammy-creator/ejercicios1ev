package unidad4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1;
		String cadena2;
		int indice;
		int contador=0;
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Introduce una cadena");
		cadena1=teclado.nextLine();
		System.out.println("Introduce una cadena");
		cadena2=teclado.nextLine();
		
		//el perro del dueño es el perro del otro
		//el
		
		do{
			indice = cadena1.indexOf(cadena2);
			if(indice<0) {
				break;
			}
			contador++;
			cadena1= cadena1.substring(indice+1);
		}while(indice>=0);
		
		System.out.println(contador);
	}

}
