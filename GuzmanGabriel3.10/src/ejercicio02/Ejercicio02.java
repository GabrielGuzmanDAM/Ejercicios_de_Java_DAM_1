/*
 * Descripción: Guarda y muestra una lista de numeros dadas por el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 30/10/2026
 */

package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int TAMANO = 10;
		
		double numero = 0;
		
		double[] numeros = new double[TAMANO];
		
		for (int i = 0; i < 10; i++) {
			
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
		
		double suma =  Arrays.stream(numeros).sum();
		
		System.out.println("\n-------------");
		System.out.print("La suma de todos los numeros es: " + suma);

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
