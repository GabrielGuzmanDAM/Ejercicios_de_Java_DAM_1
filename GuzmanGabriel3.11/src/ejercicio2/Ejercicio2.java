/*
 * Descripción: guarda las tablas del 1 al 10 en una matrix
 * Autor: Gabriel Guzmán
 * Fecha: 13/11/2026
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		final int TAMANO_I = 10;
		final int TAMANO_Y = 10;
		
		int numeros[][] = new int [TAMANO_I][TAMANO_Y];
		

		for (int i = 0; i < TAMANO_I; i++) {
			
			for (int j = 0; j < TAMANO_Y; j++) {
											
				numeros[i][j] = (i+1)*(j+1);
				
				System.out.print(" " + numeros[i][j] + "  | ");
				
			}
			
			System.out.print("\n");
			
		}
	}

}
