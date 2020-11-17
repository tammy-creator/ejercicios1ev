package unidad2;
import java.io.*;
public class Division {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numerador= 1234;
		float denominador= 532;
		float resultado= numerador / denominador;
		PrintWriter pw = new PrintWriter(System.out);
		pw.format("El resultado es %15.2f", resultado);
		pw.flush();
	}
}
