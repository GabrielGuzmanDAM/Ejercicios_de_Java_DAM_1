/*
 * Descripción: Dibuja un triángulo de asteriscos en la consola
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package ejercicio07;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
