package unidad2;

import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rojo;
		float verde;
		float azul;
		float y;
		float i;
		float q;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el color rojo: ");
		rojo = teclado.nextFloat();
		System.out.println("Introduce el color verde: ");
		verde = teclado.nextFloat();
		System.out.println("Introduce el color azul: ");
		azul = teclado.nextFloat();
		y = (float) (0.299*rojo+0.587*verde+0.114*azul);
		i = (float) (0.596*rojo-0.275*verde-0.321*azul);
		q = (float) (0.212*rojo-0.528*verde+0.311*azul);
		System.out.println("El valor de Y: "+y+ " el valor de I: "+i+ " el valor de Q: "+q);
		teclado.close();
		
	}

}
