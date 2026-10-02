/*
 * Descripción: Pide un numero al usuario y lo redondea hacia arriba, hacia abajo y al entero más cercano, mostrando el resultado por pantalla
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2026
 */

package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		Double numero = pedirDouble(pedido);
		
		double redondeaArriba = Math.ceil(numero);
		double redondeaAbajo = Math.floor(numero);
		double redondea = Math.round(numero);
		
		System.out.println("-------------");
		System.out.printf("El numero introducido es: %.10f%n", numero);
		
		System.out.println("-------------");
		System.out.println("Math.ceil: devuelve el entero más pequeño que sea mayor o igual al número dado. "
				+ "En este caso, redondea hacia arriba.");
		System.out.println("-------------");
		System.out.printf("El resultado de Math.ceil es: %.0f%n", redondeaArriba);
		
		System.out.println("-------------");
		System.out.println("Math.floor: devuelve el entero más grande que sea menor o igual al número dado. "
				+ "En este caso, redondea hacia abajo.");
		System.out.println("-------------");
		System.out.printf("El resultado de Math.floor es: %.0f%n", redondeaAbajo);
		
		System.out.println("-------------");
		System.out.println("Math.round: devuelve el entero más cercano al número dado. "
				+ "Si el número es exactamente a la mitad, redondea hacia el entero par más cercano.");
		System.out.println("-------------");
		System.out.printf("El resultado de Math.round es: %.0f%n", redondea);
		
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
