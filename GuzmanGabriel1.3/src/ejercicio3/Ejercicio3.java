/*
 * Descripción: Intercambia dos numeros introducidos por el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		double num1 = pedirDouble(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame otro numero: ");
		double num2 = pedirDouble(pedido);
		
		System.out.println("-------------");
		System.out.printf("Los numeros introducidos son: %.2f y %.2f%n", num1, num2);
		
		double num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("-------------");
		System.out.printf("Los numeros fueron intercambiados son: %.2f y %.2f%n", num1, num2);

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
