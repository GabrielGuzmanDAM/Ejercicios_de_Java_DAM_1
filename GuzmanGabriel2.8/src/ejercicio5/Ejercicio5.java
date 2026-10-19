/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 19/10/2026
 */

package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double mediaPositiva;
		double mediaNeegativa;
		int contadorPisitivo =0;
		int contadorNegativa =0;
		int contador0 =0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("-------------");
			System.out.print("Dame un numero: ");
			numero = pedirDouble(pedido);

		}
		
	}
	
	
	//pedirDouble: pide un double al usuario (double)
	public static double pedirDouble(Scanner pedido) {
		
		double numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextDouble();
				error = false;
				
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero");
				pedido.nextLine();
				error = true;
			}
			
			
		} while (error);
		
		return numero;
	}

}
