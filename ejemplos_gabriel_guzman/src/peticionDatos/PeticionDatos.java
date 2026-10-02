/*
 * Descripción: Lusta de variables
 * Autor: Gabriel Guzmán
 * Fecha: 24/09/2026
 */

package peticionDatos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PeticionDatos {
	
	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
			
			String nombre = pedirNombre(pedido);
			byte edad = pedirEdad(pedido);
			float altura = pedirAltura(pedido);
			
			System.out.println("-------------");
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
			System.out.println("Altura: " + altura);



		}
	
	//pedirNombre: pide un nombre al usuario (String)
	public static String pedirNombre(Scanner pedido) {
		
		String nombre = "";
			
		System.out.println("-------------");
		System.out.print("Dame un nombre: ");
		nombre = pedido.nextLine();
				

		
		 return nombre;
	    
	}
	
	//pedirEdad: pide una edad al usuario (String)
	public static byte pedirEdad(Scanner pedido) {
		
		byte edad = 18;
		
		boolean error = false;
		
		do {
			
			try {
				
				System.out.println("-------------");
				System.out.print("Dame una edad: ");
				edad = pedido.nextByte();
				
				error = false;
				
			    
			} catch (InputMismatchException e) {
				
				System.out.println("-----------------------");
				System.out.println("No me has dado una edad");
				System.out.println("-----------------------");
				
				error = true;
				
				pedido.nextLine();
				
			} 

		}while(error);
		
		 return edad;
	    
	}
	
	//pedirAltura: pide la altura al usuario (String)
	public static float pedirAltura(Scanner pedido) {
		
		float altura = 1.6f;
		
		boolean error = false;
		
		do {
			
			try {
				
				System.out.println("-------------");
				System.out.print("Dame una altura: ");
				altura = pedido.nextByte();
				
				error = false;
				
			    
			} catch (InputMismatchException e) {
				
				System.out.println("-----------------------");
				System.out.println("No me has dado una altura");
				System.out.println("-----------------------");
				
				error = true;
				
				pedido.nextLine();
				
			} 

		}while(error);
		
		 return altura;
	    
	}


}
