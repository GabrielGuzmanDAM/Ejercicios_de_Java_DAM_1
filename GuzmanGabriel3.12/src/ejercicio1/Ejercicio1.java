/*
 * Descripción: dividimos un texto en las palabras que lo componen
 * Autor: Gabriel Guzmán
 * Fecha: 19/11/2026
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);

		System.out.println("-------------");
		System.out.print("Dame un texto: ");
		String texto = pedido.nextLine();
		
		String[] palabras;	
			
		palabras = texto.split(" ");
		
		System.out.println("-------------");
		
		for (int i = 0; i < palabras.length; i++) {
		    System.out.println(palabras[i]);
		}

	}

}
