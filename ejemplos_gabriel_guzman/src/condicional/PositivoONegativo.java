/*
 * Descripción: Le decimos al usuario que introduzca un número y le decimos si es positivo o negativo, si introduce un 0 le decimos que es neutro
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package condicional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositivoONegativo {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		double numero = pedirDouble(pedido);
		
		if (numero > 0) {
			System.out.println("-------------");
			System.out.println("El numero es positivo");
		} else if (numero < 0) {
			System.out.println("-------------");
			System.out.println("El numero es negativo");
		} else {
			System.out.println("-------------");
			System.out.println("El numero es neutro");
		}
		
		if (numero % 2 == 0) {
			System.out.println("-------------");
			System.out.println("El numero es par");
		} else {
			System.out.println("-------------");
			System.out.println("El numero es impar");
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
