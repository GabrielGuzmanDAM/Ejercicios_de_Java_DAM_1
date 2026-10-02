/*
 * Descripción: Pude los datos del equipo de fútbol y los muestra por pantallar
 * Autor: Gabriel Guzmán
 * Fecha: 28/09/2026
 */

package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame el nombre del equipo: ");
		String nombre = pedirString(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame el año de fundación: ");
		short anno = pedirShort(pedido);
		
		pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame el nombre del estadio: ");
		String estadio = pedirString(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame el nombre del capitán: ");
		String capitan = pedirString(pedido);
		
		
		System.out.println("**********************************************************************************************");
		System.out.println("******* Nombre del Equipo:" +  nombre + " ***********************************************");
		System.out.println("******* Fundado en:" +  anno + " ****************************************************************");
		System.out.println("******* Estadio:" +  estadio + " ******************************************************************");
		System.out.println("******* Capitán:" +  capitan + " *************************************************************");
		
		
		

	}
	
	//pedirString: pide un String al usuario (String)
	public static String pedirString(Scanner pedido) {
		
		String nombre = "";	

		nombre = pedido.nextLine();		
		
		 return nombre;
	    
	}
	
	//pedirEdad: pide un short al usuario (short)
	public static short pedirShort(Scanner pedido) {
		
		short  edad = 18;
		
		boolean error = false;
		
		do {
			
			try {
		
				edad = pedido.nextShort();
				
				error = false;
				
			    
			} catch (InputMismatchException e) {
				
				System.out.println("-------------------------------------------------");
				System.out.println("No me has dado un dato balido, vuelve a escribir:");
				System.out.println("-------------------------------------------------");
				
				error = true;
				
				pedido.nextLine();
				
			} 

		}while(error);
		
		 return edad;
	    
	}

}
