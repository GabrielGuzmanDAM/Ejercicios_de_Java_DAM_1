/*
 * Descripción: pide numeros y suma los hasta 0
 * Autor: Gabriel Guzmán
 * Fecha: 07/10/2026
 */

package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numero , suma = 0;
		
		System.out.println("--------------------");
		System.out.println("SUMA NUMEROS");
		System.out.println("--------------------");
		
		do {
		System.out.print("numero: ");
		numero = pedirDouble(pedido);
		
		if (numero % 2 == 0) {
			
			suma = numero + suma;
		}
		
		System.out.println("--------------------");
		System.out.println("la suma es: " + suma);
		
		}while(numero>= 0);

	}
	
	
	//pedirDouble: pide un double al usuario, (double)
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
