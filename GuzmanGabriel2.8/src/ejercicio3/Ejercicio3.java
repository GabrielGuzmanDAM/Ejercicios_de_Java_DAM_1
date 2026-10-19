/*
 * Descripción: Mustra todos los numeros del que pidas a 0
 * Autor: Gabriel Guzmán
 * Fecha: 19/10/2026
 */

package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
			
		int numero;
		int pasos;
			
		System.out.println("-------------");	
		System.out.print("Dame un numero (negativo o pocitivo): ");
		numero = pedirInt(pedido);
			
		pasos = numero;
			
		if (numero > 0) {
				
			do {
					
				System.out.print(pasos + ", ");
					
				pasos --;
					
			} while ( pasos >= 0);
				
		} else if (numero < 0) {
				
			do {
				System.out.print(pasos + ", ");
					
				pasos ++;
					
			} while ( pasos <= 0);
		} else {
			
			System.out.print(pasos);
		}
			
	}
		
	//pedirInt: pide un int al usuario (int)
	public static int pedirInt(Scanner pedido) {
			
		int numero = 0;
			
		boolean error = false;
		do {
				
			try {
					
				numero = pedido.nextInt();
				error = false;
					
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero entero");					pedido.nextLine();
				error = true;
			}
			
		} while (error);			
		return numero;
	}
}

