/*
 * Descripción: le pide un al usuario un radio calcular la superficie y el volumen
 * Autor: Gabriel Guzmán
 * Fecha: 07/10/2026
 */

package ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double radio = 0;
		double superficie = 0;
		double volumen = 0;
		
		System.out.println("-----------------------------------");
		System.out.println("CALCULAR LA SUPERFICIE Y EL VOLUMEN");
		System.out.println("-----------------------------------");
		System.out.print("Dame el radio: ");
		radio = pedirDouble(pedido);
		
		superficie = 4 * Math.PI * Math.pow(radio, 2);
		
		volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
		
		System.out.println("-----------------------------------");
		System.out.printf("La superficie es: %.2f \n", superficie);
		System.out.printf("La volumen es: %.2f", volumen);

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
