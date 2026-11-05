/*
 * Descripción: pide un numero entero N y M al usuario, N es el tamaño del array y M estara escrito en todas las pociciones.
 * Autor: Gabriel Guzmán
 * Fecha: 05/11/2026
 */

package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int numeroN = 0;
		int numeroM = 0;
		
		System.out.println("-------------");
		System.out.print("Dame el espacio del Array: ");
		numeroN = pedirInt(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		numeroM = pedirInt(pedido);
		
		
		int[] numeros = new int[numeroN];
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = numeroM;
			
		}
		
		System.out.println("-------------");
		System.out.print("Lista de numeros: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + ", ");
			
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
