/*
 * Descripción: Transforma una cantidad de euros a pesetas y viceversa, mostrando el resultado por pantalla
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2026
 */

package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		final double PES = 166.386;
		
		System.out.println("-------------");
		System.out.print("Dame una cantidad en euros: ");
		double eurosUsuario = pedirDouble(pedido);
		
		double pesetas = eurosUsuario * PES;
		
		System.out.println("----------------------------------------------");
		System.out.printf("%.2f euros son %.2f pesetas.%n", eurosUsuario, pesetas);
		System.out.println("----------------------------------------------");
		
		System.out.println("-------------");
		System.out.print("Dame una cantidad en pesetas: ");
		double pesetasUsuario = pedirDouble(pedido);
		
		double euros = pesetasUsuario / PES;
		
		System.out.println("----------------------------------------------");
		System.out.printf("%.2f pesetas son %.2f euros.%n", pesetasUsuario, euros);
		System.out.println("----------------------------------------------");

	}
	
	//pedirDouble: pide un double al usuario, en este caso negamos los negativos (double)
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
			
			if (numero <= 0 && !error) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
