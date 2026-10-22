/*
 * Descripción: pide un numero y devualve el cuadrado
 * Autor: Gabriel Guzmán
 * Fecha: 22/10/2026
 */

package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		boolean fin = false;
		double resultado;
		
		do {
			System.out.println("-------------");
			System.out.print("Dame un numero (dame un negativo para terminar): ");
			numero = pedirDouble(pedido);
			
			if (numero >= 0) {
				
				resultado = Math.pow(numero, 2);
			
				System.out.println("-------------");
				System.out.printf("El cuadrado de el numero: %.2f \n" , resultado);
			}
			
		} while (!fin);
		
		
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
