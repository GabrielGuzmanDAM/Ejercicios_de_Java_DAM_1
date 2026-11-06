/*
 * Descripción: crear dos arrqys uno con los numeros del 1 al 100 y el otro copiara el anterior de manera inversa.
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2026
 */

package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {

		int[] numeros = new int[100];
		int[] numerosInversos = new int[100];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}
		
		for (int i = 0; i < numerosInversos.length; i++) {
			numerosInversos[i] = numeros[numeros.length - 1 - i];
		}
		
		System.out.println("Numeros del 1 al 100:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		
		System.out.println("\n\nNumeros del 100 al 1:");
		for (int i = 0; i < numerosInversos.length; i++) {
			System.out.print(numerosInversos[i] + ", ");
		}
	}

}
