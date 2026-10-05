/*
 * Descripción: Calcula el total de una factura a partir de la base imponible, aplicando IVA e IRPF
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double IVA = 0.21;
		final double IRPF = 0.15;
		final double TOTAL = 1;
		
		System.out.println("-------------");
		System.out.println("CALCULADORA DE FACTURAS");
		System.out.println("-------------");
		System.out.print("Dame la base imponible: ");
		double baseImponible = pedirDouble(pedido);
		
		double agregadoIva = baseImponible * IVA;
		double agregadoIrpf = baseImponible * IRPF;
		
		double total = baseImponible + agregadoIva - agregadoIrpf;
		
		System.out.println("-------------");
		System.out.printf("Base imponible: %.2f%n", baseImponible);
		System.out.printf("IVA (21%%): %.2f%n", agregadoIva);
		System.out.printf("IRPF (15%%): %.2f%n", agregadoIrpf);
		System.out.println("-------------");
		System.out.printf("Total: %.2f%n", total);
		System.out.println("-------------");
		
		

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
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
