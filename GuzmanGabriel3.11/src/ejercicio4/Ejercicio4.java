/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2026
 */

package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int NUM_ALUMNO = 4;
		final int NUM_MATERIAS = 5;
		
		double notas[][] = new double [NUM_ALUMNO][NUM_MATERIAS];
		
		double nota;
		
		for (int i = 0; i < NUM_ALUMNO; i++) {
			
			
			for (int j = 0; j < NUM_MATERIAS; j++) {
				
				System.out.println("-------------");
				System.out.print("Nota " + (j + 1) + " del alumno " + (i + 1) + ": ");
				nota = pedirDouble(pedido);
				
				notas[i][j] = nota;
						
			}
		}
		
		for (int i = 0; i < NUM_ALUMNO; i++) {
			
			System.out.print("Alumno " + (i + 1) + ": ");

			
			for (int j = 0; j < NUM_MATERIAS; j++) {
				
				System.out.print(" " + notas[i][j] + "  | ");
				
			}
			
			System.out.print("\n");
			
		}
		
		System.out.println("--------------");
		System.out.println("Media de cada alumno, maximo y minimo");
		System.out.println("--------------");
		
		int suma = 0;
		
		double media;
		
		double maximo = 0;
		
		double minimo = 10;
		
		for (int i = 0; i < NUM_ALUMNO; i++) {
			
			suma = 0;
			
			maximo = 0;
			
			minimo = 10;
			
			for (int j = 0; j < NUM_MATERIAS; j++) {
				
				suma += notas[i][j];
				
				if (maximo < notas[i][j]) {
					
					maximo = notas[i][j];
					
				} 
				
				if (minimo > notas[i][j]) {
					
					minimo = notas[i][j];

				}
				
			}
			
			media = (double) suma / NUM_MATERIAS;
			
			System.out.printf("Alumno media %d: %.2f | Maximo: %.2f| Minimo: %.2f\n", i , media, maximo , minimo);
		}

	}
	

	
	//pedirDouble: pide un double al usuario. (double)
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
			
			if (numero < 0 || numero > 10) {
				System.out.println("Error: Debe de introducir un numero entre 0 - 10");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
