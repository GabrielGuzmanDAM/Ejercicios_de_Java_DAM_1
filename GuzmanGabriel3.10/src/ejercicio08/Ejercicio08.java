/*
 * Descripción: guarda 100 numeros aleatorios entre 0.0 y 1.0 en un array, pudele al usuario un numero y muestra los numeros yguales y superiores del array
 * Autor: Gabriel Guzmán
 * Fecha: 05/11/2026
 */

package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int TAMANO = 100;
		
		double numero = 0;
		
		double[] numeros = new double[TAMANO];
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = Math.round(Math.random() * 100.0) / 100.0;
			
		}
		
		System.out.println("-------------");
		System.out.print("Lista de numeros: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + ", ");
			
		}
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		numero = pedirDouble(pedido);
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] >= numero) {
				System.out.print(numeros[i] + ", ");
			}
			
		}

	}
	

	
	
	
	//pedirDouble: pide un int al usuario. (int)
	public static double pedirDouble(Scanner pedido) {
		
		double numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextDouble();
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
