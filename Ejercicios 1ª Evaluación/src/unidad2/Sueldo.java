package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sueldo;
		float venta1;
		float venta2;
		float venta3;
		float total;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el sueldo base: ");
		sueldo = teclado.nextFloat();
		
		System.out.println("Introduce el valor de la comisión de tu primera venta: ");
		venta1 = teclado.nextFloat();
		
		System.out.println("Introduce el valor de la comisión de tu segunda venta: ");
		venta2 = teclado.nextFloat();
		
		System.out.println("Introduce el valor de la comisión de tu tercera venta: ");
		venta3 = teclado.nextFloat();
		
		total = (float) (sueldo+((venta1+venta2+venta3)*0.1));
		
		System.out.println("El importe total a cobrar es: "+total);
		teclado.close();
	}

}
