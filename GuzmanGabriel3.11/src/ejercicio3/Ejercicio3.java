/*
 * Descripción: guarda las tablas del 1 al 10 en una matrix
 * Autor: Gabriel Guzmán
 * Fecha: 13/11/2026
 */

package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int tamanoI;
		int tamanoY;
		
		int contadorNumerosPositivos = 0;
		int contadorNumerosNegativos = 0;
		int contador0 = 0;
		
		int numero;
		
		do {
			
			System.out.println("\n-------------");
			System.out.print("Escrive un numero: ");
			tamanoI = pedirInt(pedido);
			
			System.out.println("\n-------------");
			System.out.print("Escrive un numero: ");
			tamanoY = pedirInt(pedido);
			
			if (tamanoI < 0 || tamanoY < 0) {
				
				System.out.println("\n-------------");
				System.out.println("ERROR: uno de los dos numeros es negativo");
				
			}
			
		} while (tamanoI < 0 || tamanoY < 0);

		
		int numeros[][] = new int [tamanoI][tamanoY];
		

		for (int i = 0; i < tamanoI; i++) {
			
			for (int j = 0; j < tamanoY; j++) {
											
				System.out.println("\n-------------");
				System.out.print("Escrive un numero: ");
				numero = pedirInt(pedido);
				
				numeros[i][j] = numero;
				
			}
			
		}
		
		System.out.println("\n-------------");
		
		
		for (int i = 0; i < tamanoI; i++) {
			
			for (int j = 0; j < tamanoY; j++) {
				
				System.out.print(" " + numeros[i][j] + "  | ");
				
				if ( numeros[i][j] < 0) {
					
					contadorNumerosNegativos ++;
					
				} else if (numeros[i][j] > 0) {
					
					contadorNumerosPositivos ++;
					
				} else {
					
					contador0 ++;

				}
				
			}
			
			System.out.print("\n");
			
		}
		
		System.out.println("\n-------------");
		System.out.println("Cantidad de numeros pocitivos: " + contadorNumerosPositivos);
		System.out.println("-------------");
		System.out.println("Cantidad de numeros negativos: " + contadorNumerosNegativos);
		System.out.println("-------------");
		System.out.println("Cantidad de 0: " + contador0);
		
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
			
		} while (error);
		
		return numero;
	}

}
