/*
 * Descripción: dibuja una escena o un objeto utilizando caracteres especiales en la consola.
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package ejercicio08;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Escena de un campo con un árbol y un sol
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				if (i == 0 && j == 10) {
					System.out.print("☀"); // Sol
				} else if (i >= 5 && j == 5) {
					System.out.print("|"); // Tronco del árbol
				} else if (i >= 3 && i < 5 && j >= 4 && j <= 6) {
					System.out.print("*"); // Hojas del árbol
				} else if (i == 9) {
					System.out.print("-"); // Suelo
				} else {
					System.out.print(" "); // Espacio vacío
				}
			}
			System.out.println();
		}
		
		System.out.println("__________________________________"); // Línea en blanco para separar las escenas
		
		// Escena de una taza de café
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0 && j >= 2 && j <= 7) {
					System.out.print("_"); // Borde superior de la taza
				} else if (i == 1 && j == 1) {
					System.out.print("/"); // Lado izquierdo de la taza
				} else if (i == 1 && j == 8) {
					System.out.print("\\"); // Lado derecho de la taza
				} else if (i == 2 && j >= 1 && j <= 8) {
					System.out.print("|"); // Cuerpo de la taza
				} else if (i == 3 && j >= 1 && j <= 8) {
					System.out.print("|"); // Cuerpo de la taza
				} else if (i == 4 && j >= 2 && j <= 7) {
					System.out.print("-"); // Base de la taza
				} else {
					System.out.print(" "); // Espacio vacío
				}
			}
			System.out.println();
		}
		
		System.out.println("__________________________________"); // Línea en blanco para separar las escenas
		
		// Escena de un coche
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 20; j++) {
				if (i == 0 && j >= 5 && j <= 14) {
					System.out.print("_"); // Techo del coche
				} else if (i == 1 && j == 4) {
					System.out.print("/"); // Lado izquierdo del coche
				} else if (i == 1 && j == 15) {
					System.out.print("\\"); // Lado derecho del coche
				} else if (i == 2 && j >= 3 && j <= 16) {
					System.out.print("|"); // Cuerpo del coche
				} else if (i == 3 && j >= 2 && j <= 17) {
					System.out.print("|"); // Cuerpo del coche
				} else if (i == 4 && j >= 1 && j <= 18) {
					System.out.print("-"); // Base del coche
				} else {
					System.out.print(" "); // Espacio vacío
				}
			}
			System.out.println();
		}

	}

}
