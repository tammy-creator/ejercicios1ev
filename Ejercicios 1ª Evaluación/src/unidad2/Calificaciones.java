package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		float examen;
		float tarea1;
		float tarea2;
		float tarea3;
		String str;
		BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce la nota del examen de Matem�ticas: ");
		str = teclado.readLine();
		examen = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 1 de Matem�ticas: ");
		str = teclado.readLine();
		tarea1 = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 2 de Matem�ticas: ");
		str = teclado.readLine();
		tarea2 = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 3 de Matem�ticas: ");
		str = teclado.readLine();
		tarea3 = Float.parseFloat(str);
		
		float mediamatematicas=(float) ((examen*0.9)+((tarea1+tarea2+tarea3)/3)*0.1);
		System.out.println("La nota media de matem�ticas es: "+String.format("%.2f",(mediamatematicas)));
		
		System.out.println("Introduce la nota del examen de F�sica: ");
		str = teclado.readLine();
		examen = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 1 de F�sica: ");
		str = teclado.readLine();
		tarea1 = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 2 de F�sica: ");
		str = teclado.readLine();
		tarea2 = Float.parseFloat(str);
				
		float mediafisica=(float) ((examen*0.8)+((tarea1+tarea2)/2)*0.2);
		System.out.println("La nota media de f�sica es: "+String.format("%.2f",(mediafisica)));
		
		System.out.println("Introduce la nota del examen de Qu�mica: ");
		str = teclado.readLine();
		examen = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 1 de Qu�mica: ");
		str = teclado.readLine();
		tarea1 = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 2 de Qu�mica: ");
		str = teclado.readLine();
		tarea2 = Float.parseFloat(str);
		System.out.println("Introduce la nota de la tarea 3 de Qu�mica: ");
		str = teclado.readLine();
		tarea3 = Float.parseFloat(str);
		
		float mediaquimica=(float) ((examen*0.85)+((tarea1+tarea2+tarea3)/3)*0.15);
		System.out.println("La nota media de qu�mica es: "+String.format("%.2f",(mediaquimica)));
		
		float mediatotal=(mediamatematicas+mediaquimica+mediafisica)/3;
		System.out.println("La nota media total es: "+ mediatotal );
	}

}
