package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ano;
		System.out.println("introduce un a�o: ");
		Scanner teclado = new Scanner(System.in);
		ano=teclado.nextInt();
		
		if(ano%4==0 && (ano%400==0 || ano%100!=0)) {
			System.out.println("El a�o "+ano+" es bisiesto");
		}
		else {
			System.out.println("El a�o "+ano+" no es bisiesto");
		}
	}

}
