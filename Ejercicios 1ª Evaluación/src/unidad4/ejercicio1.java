package unidad4;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		int[] resultado = new int[]{0,0,0,0,0};
		char[] vocales = new char[] {'a','e','i','o','u'};
		
		char ch;
		String caracter;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Introduce una palabra");
		palabra=teclado.next();
		
		for(int i=0; i<palabra.length(); i++) {
			ch = palabra.charAt(i);
			for(int j=0; j<vocales.length;j++) {
				if(ch==vocales[j]) {
					resultado[j]++;
				}
			}
		}
		for(int i=0;i<resultado.length;i++) {
			System.out.println("La letra "+vocales[i]+" se repite "+ resultado[i]+" veces.");
		}
		
		
	}

}
