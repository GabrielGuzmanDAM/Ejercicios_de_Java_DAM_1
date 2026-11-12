/*
 * Descripción: comprueva si dos Array son iguales
 * Autor: Gabriel Guzmán
 * Fecha: 12/11/2026
 */

package ejercicio17;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);

		final int TAMANO1 = 10;
		final int TAMANO2 = 10;

		
		int[] patron1 = new int[TAMANO1];
		int[] patron2 = new int[TAMANO2];
		
		int numeros;
		
		int contador = 1;
		
		for (int i = 0; i < patron1.length; i++) {
	
			System.out.println("-------------");
			System.out.print("Dame 20 numeros (" + contador +"): ");
			numeros = pedirInt(pedido);
			
			patron1[i] = numeros;
			
			contador ++;
			
		}
		
		for (int i = 0; i < patron2.length; i++) {
			
			System.out.println("-------------");
			System.out.print("Dame 20 numeros (" + contador +"): ");
			numeros = pedirInt(pedido);
			
			patron2[i] = numeros;
			
			contador++;
			
		}
		
		System.out.println("-------------");
		
		for (int i = 0; i < patron1.length; i++) {
			System.out.print(patron1[i] + ", ");
		}
		
		System.out.println("\n-------------");
		
		for (int i = 0; i < patron2.length; i++) {
			System.out.print(patron2[i] + ", ");
		}
		
		boolean resultado = Arrays.equals(patron1, patron2);
		
		if (resultado) {
			
			System.out.println("\n-------------");
			System.out.println("Los Array son iguales");

			
		} else {
			
			System.out.println("\n-------------");
			System.out.println("Los Array no son iguales");

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
