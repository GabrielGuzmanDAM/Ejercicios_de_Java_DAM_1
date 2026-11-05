/*
 * Descripción: Guarda y muestra una lista de 20 numeros enteros dadas por el usuario y as la media
 * Autor: Gabriel Guzmán
 * Fecha: 05/11/2026
 */

package ejercicio05;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int TAMANO = 20;
		
		double numero = 0;
		
		double[] numeros = new double[TAMANO];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("-------------");
			System.out.print("Dame un numero: ");
			numero = pedirDouble(pedido);
			
			numeros[i] = numero;
			
		}
		
		System.out.println("-------------");
		System.out.print("Lista de numeros: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + ", ");
			
		}
		
		double suma = Arrays.stream(numeros).sum();
		
		double media = suma / TAMANO;
		
		System.out.println("\n-------------");
		System.out.print("La media de todos los numeros es: " + media);

	}
	

	
	
	
	//pedirDouble: pide un int al usuario. (int)
	public static double pedirDouble(Scanner pedido) {
		
		double numero = 0;
		
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
