package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]= new int[200];
		int capacidad;
		int suma=0;
		Scanner teclado = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Indica que temaño quieres que tenga el vector: ");
		capacidad = teclado.nextInt();
		
		for(int i=0; i<capacidad; i++) {
			vector[i]=rd.nextInt(200)-100;			
		}
		
		for(int i=0; i<capacidad; i++) {
			System.out.print(vector[i]+",");	
		}
		
		for(int i=0; i<capacidad; i++) {
			if(i==13) {
				for(i=13; i<27;i++) {
					vector[i]=0;
				}
			}else {
				suma +=vector[i];
			}
				
		}
		
		
		System.out.println("la suma de los valores almacenados en el vector es: "+suma);
		
	}

}
