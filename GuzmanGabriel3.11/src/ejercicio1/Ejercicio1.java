/*
 * Descripción: 25 numeros puestos en una matriz 5x5
 * Autor: Gabriel Guzmán
 * Fecha: 13/11/2026
 */

package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		final int TAMANO_I = 5;
		final int TAMANO_Y = 5;
		
		int contador = 0;
		
		int numeros[][] = new int [TAMANO_I][TAMANO_Y];
		

		for (int i = 0; i < TAMANO_I; i++) {
			
			for (int j = 0; j < TAMANO_Y; j++) {
				
				contador ++;
								
				numeros[i][j] = contador;
				
				System.out.print(" " + numeros[i][j] + "  | ");
				
			}
			
			System.out.print("\n");
			
		}
	}

}
