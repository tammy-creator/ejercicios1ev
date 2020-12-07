package unidad3;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numTiradas;
		int[] numerosDado = new int[]{0,0,0,0,0,0};
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero de veces que se tira el dado");
		numTiradas=teclado.nextInt();
		
		for(int i=0;i<numTiradas; i++) {
			Random aleatorio = new Random();
			num=aleatorio.nextInt(5)+1;
			numerosDado[num-1]++;
		}
		for(int i=1; i<=6; i++) {
			System.out.println("El número "+i+" ha salido "+numerosDado[i-1]+" veces.");
		}
		
	}

}
