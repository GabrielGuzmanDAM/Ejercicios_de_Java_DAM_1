/*
 * Descripción: Muestra una lista de todos los numeros pares hasta el numero que de el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2026
 */

package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un numero real (te dare todos los numeros pares): ");
		int numero = pedirInt(pedido);
		
		for (int i = 1; i < numero + 1; i++) {
			
			
			if (i % 2 == 0) {
				
				System.out.print(i + ", ");
				
			}
			

			
		}
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
			
			if (numero < 0) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
