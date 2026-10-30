/*
 * Descripción: calcular la nota media de varios alumnos en varias meterias
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2026
 */

package metrices;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int NUM_ALUMNO = 10;
		final int NUM_MATERIAS = 6;
		
		int notas[][] = new int [NUM_ALUMNO][NUM_MATERIAS];
		
		String[] alumnos = {"Pablo","Pedro","Juan","Felipe","Marselo",
				"Jusus","Mariza","Paula", "Gabriela" , "Mauricio"};
		
		String[] materias = {"Mat","Len","Ing","Fis","Qui","His"};
		
		
		int random;
		
		System.out.print("   \t\t");
		
		for (int i = 0; i < materias.length; i++) {
			
			System.out.print( materias[i] + " | ");
		}
		
		System.out.print("\n\t\t-----------------------------------\n");
		
		for (int i = 0; i < NUM_ALUMNO; i++) {
			
			System.out.print("   " + alumnos[i] + ":\t");
			
			for (int j = 0; j < NUM_MATERIAS; j++) {
				
				random =(int) (Math.random()*10);
								
				notas[i][j] = random;
				
				System.out.print(" " + notas[i][j] + "  | ");
				
			}
			System.out.print("\n\t\t-----------------------------------\n");
		}

	}

}
