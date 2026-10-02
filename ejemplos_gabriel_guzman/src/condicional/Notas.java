/*
 * Descripción: pide una nota al usuario y muestra la calificación correspondiente, si la nota no es válida, se vuelve a pedir
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package condicional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		boolean error = false;
		
		do {
			
			error = false;
		
			System.out.println("-------------");
			System.out.print("Dame una nota: ");
			int nota = pedirInt(pedido);
			
			if (nota > 10 || nota < 0) {
				System.out.println("Error: La nota debe de estar entre 0 y 10");
				 error = true;
				
			} else if (nota >= 9) {
				System.out.println("Sobresaliente");
			} else if (nota >= 7) {
				System.out.println("Notable");
			} else if (nota >= 6) {
				System.out.println("Bien");
			} else if (nota >= 5) {
				System.out.println("Suficiente");
			} else {
				System.out.println("Insuficiente");
			}
		
		} while (error);

	}
	
	//pedirInt: pide un int al usuario,(int)
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
			
		} while (error);
		
		return numero;
	}

}
