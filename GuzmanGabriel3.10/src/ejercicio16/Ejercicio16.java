/*
 * Descripción: crea una Array donde cada numero se repita la cantida de veses de ese numero, asta el 10
 * Autor: Gabriel Guzmán
 * Fecha: 09/11/2026
 */

package ejercicio16;

import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		final int TAMANO = 55;
		
		int[] patron = new int[TAMANO];
		
		int contador = 1;
		
		int numeros = 1;
		
		for (int i = 0; i < patron.length; i++) {
			
			Arrays.fill(patron, i ,TAMANO , numeros);
			
			if (numeros - contador == 0) {
				
				numeros ++ ;
				
				contador = 0;
				
			}
			
			contador++;
			
		}
		
		System.out.println("-------------");
		
		for (int i = 0; i < patron.length; i++) {
			System.out.print(patron[i] + ", ");
		}
		
	}

}
