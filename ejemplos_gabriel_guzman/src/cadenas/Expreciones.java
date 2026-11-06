/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2026
 */

package cadenas;

import java.util.Scanner;

public class Expreciones {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		boolean balidar = false;
		
		String numeroTelefono;
		
		String patron = "[0-9]{9}";
		
		do {
			
			System.out.println("-------------");
			System.out.print("Dame un numero entero: ");
			numeroTelefono = pedido.next();
			
			if (numeroTelefono.matches(patron)) {
				
				balidar = true;
				
				System.out.println("-------------");
				System.out.println("Es valido");
				
			} else {
				System.out.println("-------------");
				System.out.println("no es valido");

			}
			
		} while (!balidar);

	}

}
