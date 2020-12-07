package unidad4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector1= new int[50];
		int[] vector2= new int[50];
		int capacidad;
		int aux;
		boolean noRepetido;
		
		Random rd = new Random();
		capacidad = rd.nextInt(40)+10;
		
		for(int i=0; i<capacidad; i++) {
			vector1[i]=-101;
		}
		
		for(int i=0; i<capacidad; i++) {
			noRepetido = false;
			do {
				aux=rd.nextInt(200)-100;
				if(Arrays.asList(vector1).indexOf(aux)==-1) { 
					vector1[i]= aux;
					noRepetido=true;
				}
			}while(!noRepetido);	
			
		}
		
		for(int i=0; i<capacidad; i++) {
			vector2[i]=vector1[capacidad-i-1];
		}
		
		for(int i=0; i<capacidad; i++) {
			System.out.print(vector1[i]+",");
		}
		System.out.println("");
		
		for(int i=0; i<capacidad; i++) {			
			System.out.print(vector2[i]+",");
		}
	}
	
	

}
