package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operador;
		int num1;
		int num2;
		int resultado;
		String repetir;
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("Introduce la operaci�n que desea realizar");
			operador = teclado.next();
			
			System.out.println("Introduce un n�mero");
			num1=teclado.nextInt();
			System.out.println("Introduce un n�mero");
			num2=teclado.nextInt();
			
			if(operador.equalsIgnoreCase("sumar")) {
				resultado=num1+num2;
				System.out.println(num1+" + "+num2+" = "+resultado);
			}
			else if(operador.equalsIgnoreCase("restar")) {
				resultado=num1-num2;
				System.out.println(num1+" - "+num2+" = "+resultado);
			}
			else if(operador.equalsIgnoreCase("multiplicar")) {
				resultado=num1*num2;
				System.out.println(num1+" x "+num2+" = "+resultado);
			}
			else if(operador.equalsIgnoreCase("dividir")) {
				resultado=num1/num2;
				System.out.println(num1+" / "+num2+" = "+resultado);
			}else {
				System.out.println("No introdujo correctamente el operador");
			}
			do{
				System.out.println("�Desea realizar otra operaci�n?");
				repetir = teclado.next();
			}
			while(!repetir.equalsIgnoreCase("si") && !repetir.equalsIgnoreCase("no"));
			
		}
		while(repetir.equalsIgnoreCase("si"));
		
	}

}
