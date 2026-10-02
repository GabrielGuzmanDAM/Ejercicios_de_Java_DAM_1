/*
 * Descripción: dibuja un triángulo hueco de asteriscos en la consola
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package ejercicio06;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Dibuja un triángulo hueco de asteriscos en la consola
		for (int i = 1; i <= 5; i++) {
			
			// Dibuja los espacios en blanco antes de los asteriscos
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			
			// Dibuja los asteriscos y los espacios en blanco dentro del triángulo
			for (int k = 1; k <= (2 * i - 1); k++) {
				if (k == 1 || k == (2 * i - 1) || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
