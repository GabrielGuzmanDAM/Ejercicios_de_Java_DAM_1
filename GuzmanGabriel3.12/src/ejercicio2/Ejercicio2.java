/*
 * Descripción: compara dos textos y dise si son iguales
 * Autor: Gabriel Guzmán
 * Fecha: 19/11/2026
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);

		System.out.println("-------------");
		System.out.print("Dame el primer texto: ");
		String texto1 = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame el segundo texto: ");
		String texto2 = pedido.nextLine();
		
		texto1 = texto1.toUpperCase();
		texto2 = texto2.toUpperCase();
		
		boolean iguales = texto1.equals(texto2);
		
		if (iguales) {
			
			System.out.println("-------------");
			System.out.println("Son iguales");
			
		} else {
			
			System.out.println("-------------");
			System.out.println("No son iguales");
			
		}
		
	}

}
