/*
 * Descripción: pide un numero entero P y Q al usuario, crear un array con los numeros entre P y Q.
 * Autor: Gabriel Guzmán
 * Fecha: 05/11/2026
 */

package ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int numeroP = 0;
		int numeroQ = 0;
		
		System.out.println("-------------");
		System.out.print("Dameun numero: ");
		numeroP = pedirInt(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		numeroQ = pedirInt(pedido);
		
		int tamanio = Math.abs(numeroQ - numeroP);
		
		int[] numeros = new int[tamanio-1];
		
		if (numeroP < numeroQ) {
			for (int i = 1; i <= numeros.length; i++) {
				numeros[i-1] = numeroP + i;
			}
		} else {
			for (int i = 1; i <= numeros.length; i++) {
				numeros[i-1] = numeroQ + i;
			}

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
			
		} while (error);
		
		return numero;
	}

}
