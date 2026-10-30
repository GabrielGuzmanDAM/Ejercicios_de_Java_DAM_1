/*
 * Descripción: calcular la nota media de varios alumnos en varias meterias
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2026
 */

package metrices;

import java.util.Scanner;

public class Notas2 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int NUM_ALUMNO = 10;
		final int NUM_MATERIAS = 6;
		
		int notas[][] = new int [NUM_ALUMNO][NUM_MATERIAS];
		
		int random;
		
		for (int i = 0; i < NUM_ALUMNO; i++) {
			
			System.out.print("Alumno " + i + ": ");
			
			for (int j = 0; j < NUM_MATERIAS; j++) {
				
				random =(int) (Math.random()*10);
				
				notas[i][j] = random;
				
				System.out.print(notas[i][j] + " | ");
				
			}
			System.out.print("\n          -----------------------\n");
		}
		
		System.out.println("--------------");
		System.out.println("Media de cada alumno");
		System.out.println("--------------");
		
		int suma = 0;
		
		double media;
		
		for (int i = 0; i < NUM_ALUMNO; i++) {
			
			System.out.print("Alumno media: " + i + ": ");
			
			suma = 0;
			
			for (int j = 0; j < NUM_MATERIAS; j++) {
				
				suma += notas[i][j];
				
			}
			
			media = (double) suma / NUM_MATERIAS;
			
			
			System.out.printf("%.2f \n" , media);
		}
		
		System.out.println("--------------");
		System.out.println("Media de cada metaria");
		System.out.println("--------------");
		
		
		for (int i = 0; i < NUM_MATERIAS; i++) {
			
			System.out.print("Nota media materias: " + i + ": ");
			
			suma = 0;
			
			for (int j = 0; j < NUM_ALUMNO; j++) {
				
				suma += notas[j][i];
				
			}
			
			media = (double) suma / NUM_MATERIAS;
			
			
			System.out.printf("%.2f \n" , media);
		}
		
		System.out.println("--------------");
		System.out.println("La primera nota suspenso de cada estudiante");
		System.out.println("--------------");
		
		for (int i = 0; i < NUM_ALUMNO; i++) {
			
			System.out.print("Alumno media: " + i + ": ");
			
			int j = 0;
			
			boolean entontrado = false;
			
			do {
				
				if (notas[i][j] < 5) {
					
					System.out.printf("%d  en %d \n" , notas[i][j], j);
					
					entontrado = true;
					
				}
				
				j++;
				
			} while (!entontrado && j <notas[i].length);
			
			if (entontrado == false) {
				
				System.out.printf("No tiene materias suspensas\n");
				
			} 
	

		}

	}

}
