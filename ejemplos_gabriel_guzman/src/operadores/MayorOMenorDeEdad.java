/*
 * Descripción: Pedir la edad al usuario y marcarle si es mayor de edad o no
 * Autor: Gabriel Guzmán
 * Fecha: 28/09/2026
 */

package operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MayorOMenorDeEdad {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un edad: ");
		byte edad = pedirByte(pedido);
		
		String mensajeResultado = (edad > 17) ? "Machor de edad" : "Menor de edad";
		
		System.out.println("-------------");
		System.out.println("ERES MACHOR DE EDAD?");
		System.out.println("-------------");
		System.out.println("Resultado: " + mensajeResultado);

	}
	
	//pedirEdad: pide un byte al usuario (byte)
	public static byte pedirByte(Scanner pedido) {
		
		byte edad = 18;
		
		boolean error = false;
		
		do {
			
			try {
		
				edad = pedido.nextByte();
				
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
