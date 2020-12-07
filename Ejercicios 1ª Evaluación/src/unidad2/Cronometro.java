package unidad2;

import java.io.*;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader teclado;
		String nombre;
		long start;
		long end;
		double tiempo;
		teclado = new BufferedReader(new InputStreamReader(System.in));
		start = System.currentTimeMillis();
		
		System.out.println("Dime tu nombre: ");
		nombre = teclado.readLine();		
		
		end = System.currentTimeMillis();
		tiempo = (end-start)/1000;	
		
		System.out.println("Hola "+nombre+ ", has tardado "+String.format("%.3f",(tiempo))+" segundos en decirme tu nombre.");
	}

}
