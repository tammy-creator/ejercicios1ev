package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		
		System.out.println("Introduce un n�mero: ");
		
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
		if(numero%2==0) {
			System.out.println("el n�mero "+numero+" es un n�mero par");
		}else {
			System.out.println("el n�mero "+numero+" es un n�mero impar");
		}
	}

}
