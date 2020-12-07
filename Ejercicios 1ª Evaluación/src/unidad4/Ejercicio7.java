package unidad4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector= new int[1000000];
		int capacidad;
		int aux;
		int min;
		int max;
		
		boolean noRepetido=false;
		
		Random rd = new Random();
		capacidad= rd.nextInt(999990)+10;
		
		for(int i=0; i<capacidad;i++) {
			vector[i]=2000000;
		}
		
		long inicio = System.currentTimeMillis();     
        
		for(int i=0; i<capacidad; i++) {
			do {
				noRepetido=false;
				aux=rd.nextInt(1999999)-999999;
				for(int j=0; j<=i; j++) {
					if(aux!=vector[j]) {
						vector[i]=aux;
						noRepetido=true;
					}
				}
			}while(noRepetido==false);	
			
		}
		
		long fin = System.currentTimeMillis();
        
        double tiempo = (double) ((fin - inicio)/1000);
         
        
		
		System.out.println("El tamaño del vector es de:"+capacidad);
		
		System.out.println(tiempo +" segundos");
		
		
		inicio = System.currentTimeMillis();     
		min = max = vector[0];
		for(int i=0; i<capacidad; i++) {
			if(vector[i]>max) {
				max= vector[i];
			}
			if(vector[i]<min) {
				min=vector[i];
			}
		}
		
		System.out.println("La diferencia entre el valor mayor del vector:"+max+"y el menor valor:"+min+"es:"+(max-min));
		
		fin = System.currentTimeMillis();        
        tiempo = (double) ((fin - inicio)/1000);
        System.out.println(tiempo +" segundos");
		
	}

}
