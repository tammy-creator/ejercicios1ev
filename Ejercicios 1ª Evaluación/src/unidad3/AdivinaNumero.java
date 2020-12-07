package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numN;
		int num;
		int solucion;
		Random aleatorio = new Random();
		numN=aleatorio.nextInt(99000)+1000;
		num=aleatorio.nextInt(numN-1)+1;
		
		do {
			System.out.println("He pensado un número entre 1 y N, adivina cuál es: ");
			Scanner teclado = new Scanner(System.in);
			solucion = teclado.nextInt();
			
			if(solucion == num) {
				System.out.println("Has acertado");
			}
			else {
				if(solucion>num) {
					System.out.println("El número introducido es mayor que el que he pensado");
				}else {
					System.out.println("El número introducido es menor que el que he pensado");
				}
				System.out.println("Intentalo de nuevo!!");
			}
		}while(solucion != num);
	}

}
