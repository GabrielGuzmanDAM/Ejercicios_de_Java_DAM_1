/*
 * Descripción: calcula el elevado de un numero dado con otro numero dado por el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numeroA;
		double numeroB;
		double resultado;
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		numeroA = pedirDouble(pedido);
		
		resultado = numeroA;
		
		System.out.println("-------------");
		System.out.print("Dame el numero al que elevaremos al primero: ");
		numeroB = pedirDouble(pedido);
		
		for (int i = 0; i <numeroB; i++) {
			
			resultado *= numeroA;
			
		}
		
		System.out.println("-------------");
		System.out.printf("%.2f ^ %.2f = %.4f " , numeroA , numeroB , resultado);
		
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
