package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int filas;
		int num=1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero de filas que va a tener tu triángulo");
		filas=teclado.nextInt();
		
		for(int i=1;i<=filas;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("\t"+num);
				num++;
			}
			System.out.println();
		}
	}

}
