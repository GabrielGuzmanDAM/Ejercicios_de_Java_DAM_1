/*
 * Descripción: Introdise los puntajes en un juego de ajetres lo ordena de machor a menor y lo muestra.
 * Autor: Gabriel Guzmán
 * Fecha: 12/11/2026
 */

package ejercicio19;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		final int TAMANO = 8;

		int[] patron = new int[TAMANO];
		
		int numero;
				
		for (int i = 0; i < patron.length; i++) {
	
			System.out.println("-------------");
			System.out.print("Puntos del jugador " + (i+1) +" (1000 - 2800): ");
			numero = pedirInt(pedido);
			
			patron[i] = numero;
			
		}
		
		System.out.println("\n-------------");
		
		for (int i = 0; i < patron.length; i++) {
			System.out.print(patron[i] + ", ");
		}
		
		Arrays.sort(patron);
		
		System.out.println("\n-------------");
		System.out.print("Array ordenado: ");
		
		for (int i = patron.length; i > 0; i--) {
			System.out.print(patron[i-1] + ", ");
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
			
			if (numero < 1000 || numero > 2800) {
				System.out.println("Error: La puntuacion no esta en el margen estipolado");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
