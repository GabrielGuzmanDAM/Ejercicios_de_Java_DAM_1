/*
 * Descripción: Le pide numeros al usuario hasta que este introduzca un numero negativo, y luego muestra la suma de todos los numeros pares introducidos
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BocleWhile {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numero = 1;
		double suma = 0;
		
		System.out.println("-------------");
		System.out.println("SUMA LOS NUMEROS PARES DE NUMEROS");
		System.out.println("-------------");
		
		while (numero >= 0) {
			System.out.print("Dame un numero (0 para salir): ");
			numero = pedirDouble(pedido);
			
			if (numero % 2 == 0 && numero >= 0) {
				suma += numero;
			}
		}
		
		System.out.println("-------------");
		System.out.printf("La suma de todos los numeros pares introducidos es: %.2f%n", suma);

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
