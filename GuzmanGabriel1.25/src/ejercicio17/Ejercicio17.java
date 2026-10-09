/*
 * Descripción: Le preguntamos al usuario la base inponible
 * Autor: Gabriel Guzmán
 * Fecha: 07/10/2026
 */

/*
 * Escribe un programa que calcule el total de una factura a partir de la base imponible
(precio sin IVA). La base imponible estará almacenada en una variable.
 */

package ejercicio17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double IVA = 0.21;
		
		double baseInponible = 0;
		
		System.out.println("--------------------");
		System.out.println("CALCULAR UNA FACTURA");
		System.out.println("--------------------");
		System.out.print("Dame el radio: ");
		baseInponible = pedirDouble(pedido);
		
		double sumaIva = baseInponible * IVA;
		double total = baseInponible + sumaIva;
		
		System.out.println("--------------------");
		System.out.printf("\"Base imponible: %.2f €\n", baseInponible);
		System.out.printf("\"IVA: %.2f €\n", sumaIva );
		System.out.printf("\"Total: %.2f €\n", total );

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
