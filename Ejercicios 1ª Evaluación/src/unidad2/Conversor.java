package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 
            InputStreamReader in= new InputStreamReader(System.in);
 
            BufferedReader input = new BufferedReader(in);
 
            float euros;
            float dolar=(float) 0.90;
            
            String str;
 
            System.out.print("Introduce los Euros a convertir a dolares:");
 
            str = input.readLine();
                            
            euros = Float.parseFloat(str);
               
            float resultado= euros*dolar; 
            System.out.println(euros+" euros son "+String.format("%.2f",(resultado))+" dolares");
		
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

}
