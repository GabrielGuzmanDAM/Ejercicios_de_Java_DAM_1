/*
 * Descripción: Pide al usuario su nombre, dirección y teléfono y muestra una ficha con los datos introducidos
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

/*
 * Escribir un programa en Java que pregunte tu nombre, dirección y teléfono y escriba en
pantalla una ficha.
 */

package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		boolean error = false;
		
		System.out.println("-------------");
		System.out.print("Dame tu nombre: ");
		String nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tu dirección: ");
		String direccion = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tu teléfono: ");
		String telefono = pedirTelefono(pedido);
		
		
		System.out.println("-------------");
		System.out.printf("Ficha del usuario:%nNombre: %s%nDirección: %s%nTeléfono: %s%n", nombre, direccion, telefono);

	}
	
	//pedirTelefono: pide un telefono al usuario, comprieva si el telefono tiene la longitud adecuada (String)
	public static String pedirTelefono(Scanner pedido) {
		
		String telefono = "";
		
		boolean error = false;
		
		do {
			
			try {
				
				telefono = pedido.nextLine();
				error = false;
				
			} catch (Exception e) {
				
				System.out.println("Error, introduce un teléfono válido");
				pedido.nextLine();
				error = true;
				
			}
			
			if (telefono.length() < 9 || telefono.length() > 9) {
				System.out.println("Error, el teléfono debe tener 9 dígitos");
				error = true;
			}
			
		} while (error);
		
		return telefono;
		
	}

}
