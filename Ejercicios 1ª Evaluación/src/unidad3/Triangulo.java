package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lado1;
		float lado2;
		float lado3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la longitud de un lado del triangulo");		
		lado1=teclado.nextFloat();
		System.out.println("Introduce la longitud de un lado del triangulo");		
		lado2=teclado.nextFloat();
		System.out.println("Introduce la longitud de un lado del triangulo");		
		lado3=teclado.nextFloat();
		
		if(lado1>0 && lado2>0 && lado3>0) {
			System.out.println("los lados introducidos pueden formar un triángulo");
			if(lado1==lado2 && lado1==lado3) {
				System.out.println("Es un triángulo equilatero");
			}
			else if (lado1==lado2 || lado2==lado3 || lado1==lado3){	
				System.out.println("Es un triángulo isósceles");
			}
			else {
				System.out.println("Es un triángulo escaleno");
			}
			
			
			
			
		}
		else {
			System.out.println("los lados introducidos no pueden formar un triángulo");
		}
	}

}
