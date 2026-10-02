/*
 * Descripción: Pide al usuario su nombre y lo saluda, mostrando el resultado por pantalla
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("¿Cómo te llamas?: ");
		String nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.printf("Hola %s%n", nombre);

	}

}
