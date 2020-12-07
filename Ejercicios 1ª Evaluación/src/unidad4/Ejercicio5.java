package unidad4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nif;
		String numero;
		String letra;
		int resto;
		int numeroEntero;
		char letraValida;		
		char[] validacion = new char[] {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		char ch;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de DNI");
		nif=teclado.next();
		
		letra= nif.substring(8);
		numero=nif.substring(0, 8);
		ch=letra.toUpperCase().charAt(0);
		numeroEntero=Integer.parseInt(numero);
		resto=numeroEntero%23;
		letraValida= validacion[resto];
		
		if(letraValida==ch) {
			System.out.println("La letra introducida del DNI es correcta");
		}else {
			System.out.println("Incorrecto, la letra correcta del DNI es: "+validacion[resto]);
		}
		
				
	}

}
