package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limite=0;
		
		int num;
		int intentos=0;
		String resultado;
		
		System.out.println("Cual es el valor del limite superior ");
		Scanner teclado = new Scanner(System.in);
		limite = teclado.nextInt();
		
		num=limite/2;
		System.out.println("El número que has pensado es: "+num);
		resultado = teclado.next();
		do {
			if(resultado.equalsIgnoreCase("no")){
				intentos++;
				if(intentos == limite) {
					System.out.println("me has engañado");
					break;
				}
				System.out.println("Dime si mi numero es mayor o menor que el tuyo");
				resultado = teclado.next();
				if(resultado.equalsIgnoreCase("mayor")) {
					num= num/2;
					
					System.out.println("El número que has pensado es: "+num);
					resultado = teclado.next();
				}else {
					
					num = (limite-num)/2+num;
					
					
					System.out.println("El número que has pensado es: "+num);
					resultado = teclado.next();
				}
			}
		
		}while(resultado.equalsIgnoreCase("no"));	
		
		if(resultado.equalsIgnoreCase("si")) {
			System.out.println("Lo he adivinado");
		} 
	}

}
