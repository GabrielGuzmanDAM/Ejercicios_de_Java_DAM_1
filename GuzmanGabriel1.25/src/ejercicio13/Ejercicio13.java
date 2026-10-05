/*
 * Descripción: Realiza un conversor de Mb a Kb
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double MB_A_KB = 1024;
		
		System.out.println("-------------");
		System.out.println("CONVERSOR DE MB A KB");
		System.out.println("-------------");
		
		System.out.print("Dame los MB: ");
		int mb = pedirInt(pedido);
		
		double kb = mb * MB_A_KB;
		
		System.out.println("-------------");
		System.out.printf("%d MB son %.2f KB%n", mb, kb);
		
	}
	
	//pedirInt: pide un int al usuario, en este caso negamos los negativos (int)
	public static int pedirInt(Scanner pedido) {
		
		int numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextInt();
				error = false;
				
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero entero");
				pedido.nextLine();
				error = true;
			}
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
