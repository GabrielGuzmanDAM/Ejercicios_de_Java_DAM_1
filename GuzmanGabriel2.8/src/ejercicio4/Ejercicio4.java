/*
 * Descripción: Mustra todos los numeros del que pidas a 0
 * Autor: Gabriel Guzmán
 * Fecha: 19/10/2026
 */

package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numero = 1;
		double suma = 0;
		
		double media;
		
		int contador = 0;
		
		System.out.println("-------------");
		System.out.println("SUMA LOS NUMEROS PARES DE NUMEROS");
		System.out.println("-------------");
		
		while (numero > 0) {
			System.out.print("Dame un numero (0 para salir): ");
			numero = pedirDouble(pedido);
			
			if ( numero >= 0) {
				
				contador ++;
				
				suma += numero;
			}
		}
		
		media = suma/contador;
		
		System.out.println("-------------");
		System.out.printf("La suma de todos los %d pares introducidos es: %.2f%n", contador ,suma);
		System.out.printf("La media es: %.2f%n", media);

	}
	
	//pedirDouble: pide un double al usuario (double)
	public static double pedirDouble(Scanner pedido) {
		
		double numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextDouble();
				error = false;
				
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero");
				pedido.nextLine();
				error = true;
			}
			
			if (numero < 0) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
