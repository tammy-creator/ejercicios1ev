package unidad4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		String palabraInvertida = "";
		String caracter;
		
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Introduce una palabra");
		palabra=teclado.next();
		
		for(int i=palabra.length(); i>0; i--) {
			caracter = palabra.substring(i-1, i);
			palabraInvertida = palabraInvertida.concat(caracter);
			
		}
		System.out.println("La palabra invertida es: "+palabraInvertida);


}

}
