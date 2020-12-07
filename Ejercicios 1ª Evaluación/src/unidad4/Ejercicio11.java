package unidad4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vector= new String[10];
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<vector.length; i++) {
			System.out.println("Introduce un nombre: ");
			vector[i]=teclado.next();
		}
				
		System.out.println("El nombre mas largo introducido: "+cadena(vector));
	}
	
	public static String cadena(String[] vector) {
		int max=0;
		int indiceMax=0;
		
		for(int i=0; i<vector.length; i++) {
			if(max<vector[i].length()) {
				max=vector[i].length();
				indiceMax=i;
			}			
		}
		return vector[indiceMax];
	}
}
