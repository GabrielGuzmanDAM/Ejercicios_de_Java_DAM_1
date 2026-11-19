/*
 * Descripción: cuantas la cantida de cada vocal en un texto
 * Autor: Gabriel Guzmán
 * Fecha: 19/11/2026
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un texto: ");
		String texto = pedido.nextLine();
		
		texto = texto.toLowerCase();
		
		char vocales;
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			vocales = texto.charAt(i);
			
			switch (vocales) {
			case 'a':
				
				contadorA ++;
				
				break;
			
			case 'e':
				
				contadorE ++;
							
				break;
							
			case 'i':
				
				contadorI ++;
				
				break;
				
			case 'o':
				
				contadorO ++;
				
				break;
				
			case 'u':
				
				contadorU ++;
				
				break;
			}

		}
		
		System.out.println("-------------");
		System.out.println("Numero de A: " + contadorA);
		System.out.println("Numero de E: " + contadorE);
		System.out.println("Numero de I: " + contadorI);
		System.out.println("Numero de O: " + contadorO);
		System.out.println("Numero de U: " + contadorU);
		
	}

}
