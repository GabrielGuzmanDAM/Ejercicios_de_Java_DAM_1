/*
 * Descripción: te dise si el texto dado es un palindromo
 * Autor: Gabriel Guzmán
 * Fecha: 19/11/2026
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un texto: ");
		String texto = pedido.nextLine();
		
		texto = texto.toLowerCase();
		
		String textoRecortado;
		
		// Eliminamos todos los espacios
		textoRecortado = texto.replace(" ", "");
		
		String textoAlreves = "";
		
		char silaba;
		
		//invetimos el String
		for (int i = textoRecortado.length(); i > 0; i--) {
			
			silaba = textoRecortado.charAt(i-1);
			
			textoAlreves = textoAlreves.concat(Character.toString(silaba));
		
		}

		System.out.println("-------------");
		System.out.println(textoRecortado);
		System.out.println(textoAlreves);
		
		boolean palindromo = textoRecortado.equals(textoAlreves);
		
		if (palindromo) {
			
			System.out.println("-------------");
			System.out.println("Es un palindromo");
			
		} else {
			
			System.out.println("-------------");
			System.out.println("No es un palindromo");
			
		}
		
		

	}

}
