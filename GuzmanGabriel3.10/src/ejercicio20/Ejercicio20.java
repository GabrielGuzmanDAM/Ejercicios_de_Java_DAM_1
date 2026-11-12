/*
 * Descripción: genera un array con numeros aleatorios de 0 a 99 y despues pudele al usuario un numero cuanta cuantos de ese numero esta en el array
 * Autor: Gabriel Guzmán
 * Fecha: 12/11/2026
 */

package ejercicio20;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		final int TAMANO = 1000;

		int[] patron = new int[TAMANO];
		
		int numero;
				
		for (int i = 0; i < patron.length; i++) {
	
			numero =(int) (Math.random()*100);
			
			patron[i] = numero;			
			
		}
		
		System.out.println("\n-------------");
		
		for (int i = 0; i < patron.length; i++) {
			System.out.print(patron[i] + ", ");
		}
		
		System.out.println("\n-------------");
		System.out.print("Escrive un numero (0 - 99): ");
		numero = pedirInt(pedido);
		
		int contador = 0;
		
		for (int i = 0; i < patron.length; i++) {
			
			if (numero == patron[i]) {
				
				contador++;
				
			}
		}
		
		if (contador == 0) {
			
			System.out.println("-------------");
			System.out.println("No esta ese numero en el array");

			
		} else {
			
			System.out.println("-------------");
			System.out.printf("La cantidad de %d en el array son: %d" , numero , contador);			
			
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
			
			if (numero < 0 || numero > 99) {
				System.out.println("Error: La puntuacion no esta en el margen estipolado");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
