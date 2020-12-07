package unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[]= new int[500];
		int capacidad;
		int contador=0;
		int repetido=0;
		int aux=101;
		Random rd = new Random();
		capacidad= rd.nextInt(20)+10;
		
		for(int i=0; i<capacidad; i++) {
			vector[i]= rd.nextInt(20)-10;
		}
		
		if(capacidad<=50) {
			for(int i=0; i<capacidad; i++) {
				System.out.print(vector[i]+",");
			}
			
		}
		System.out.println();
		
		 for (int i = 0; i < capacidad; i++) {
			 for(int j=i; j<capacidad; j++) {
				 if(vector[i]==vector[j]) {
					 repetido=vector[i];
					 contador++;
				 }
				 
			 }
			 System.out.println("el valor "+repetido+"se repite "+contador+" veces");
		}
		    
		
	}
}
