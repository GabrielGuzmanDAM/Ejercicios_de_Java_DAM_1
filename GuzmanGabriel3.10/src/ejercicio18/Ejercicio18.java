/*
 * Descripción: Crea un array aleatorio y ordenalo, muestralo por pantalla
 * Autor: Gabriel Guzmán
 * Fecha: 12/11/2026
 */

package ejercicio18;

import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
		final int TAMANO = 30;
		
		int[] patron = new int[TAMANO];
		
		int numero;
			
		for (int i = 0; i < patron.length; i++) {
			
			numero =(int) (Math.random()*10);
			
			patron[i] = numero;			
		}
		
		System.out.println("\n-------------");
		
		for (int i = 0; i < patron.length; i++) {
			System.out.print(patron[i] + ", ");
		}
		
		Arrays.sort(patron);
		
		System.out.println("\n-------------");
		System.out.print("Array ordenado: ");
		
		for (int i = 0; i < patron.length; i++) {
			System.out.print(patron[i] + ", ");
		}
		
	}

}
