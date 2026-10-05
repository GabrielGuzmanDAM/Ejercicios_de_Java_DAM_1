/*
 * Descripción: Convierte grados Fahrenheit a grados Celsius
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package ejercicio15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double CONVERSION = 1.8;
		
		System.out.println("-------------");
		System.out.println("CONVERSOR DE GRADOS FAHRENHEIT A GRADOS CELSIUS");
		System.out.println("-------------");
		
		System.out.print("Dame los grados Fahrenheit: ");
		double fahrenheit = pedirDouble(pedido);
		
		double celsius = (fahrenheit - 32) / CONVERSION;
		
		System.out.println("-------------");
		System.out.printf("La temperatura en grados Celsius es: %.2f%n", celsius);
		
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
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
