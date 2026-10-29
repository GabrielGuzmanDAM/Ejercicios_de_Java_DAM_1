/*
 * Descripción: Calculamos todos los multiplos que comparten 7 y 13 y que esten comprendidos entre N y M , dados por el usuario.
 * Autor: Gabriel Guzmán
 * Fecha: 29/10/2026
 */

package guzman;

import java.util.Scanner;

public class Gabriel2 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int  NUMERO_7 = 7;
		final int  NUMERO_13 = 13;
		
		int numeroN;
		int numeroM;
		
		int contador1 = 2;
		int contador2 = 2;

		System.out.println("-------------");
		System.out.print("Dame un numero (N): ");
		numeroN = pedido.nextInt();
		
		System.out.println("-------------");
		System.out.print("Dame un numero (M): ");
		numeroM = pedido.nextInt();
		
		int multiplo7 = 0;
		
		int multiplo13 = 0;
		
		if (numeroN <= numeroM) {
			
			for (int i = numeroN; i < numeroM && multiplo13 < numeroM; i++) {
				
				multiplo13 = NUMERO_13 * contador1;
				
				contador1 ++;
				
				for (int j = numeroN; j < numeroM && multiplo13 < numeroM; j++) {
					
					multiplo7 = NUMERO_7 * contador2;
					
					if (multiplo7 == multiplo13 && multiplo13 > numeroN && multiplo13 < numeroM ) {
						
						System.out.println("-------------");
						System.out.printf("El numero %d esta desde %d hasta %d y es multiplo de %d y %d \n" , multiplo13 , numeroN , numeroM , NUMERO_7 , NUMERO_13);
						
					}
			
					contador2 ++;
					
				}
				
				contador2 = 0;
				
			}
			
		} else {
			
			for (int i = numeroM; i < numeroN && multiplo13 < numeroN; i++) {
				
				multiplo13 = NUMERO_13 * contador1;
				
				contador1 ++;
				
				for (int j = numeroM; j < numeroN && multiplo13 < numeroN; j++) {
					
					multiplo7 = NUMERO_7 * contador2;
					
					if (multiplo7 == multiplo13 && multiplo13 > numeroM && multiplo13 < numeroN ) {
						
						System.out.println("-------------");
						System.out.printf("El numero %d esta desde %d hasta %d y es multiplo de %d y %d \n" , multiplo13 , numeroM , numeroN , NUMERO_7 , NUMERO_13);
						
					}
			
					contador2 ++;
					
				}
				
				contador2 = 0;
				
			}

		}
		
	}

}
