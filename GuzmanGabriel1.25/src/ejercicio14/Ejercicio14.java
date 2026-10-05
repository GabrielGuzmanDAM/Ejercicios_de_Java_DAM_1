/*
 * Descripción: Realiza un conversor de Kb a Mb
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double KB_A_MB = 0.0009765625;
		
		System.out.println("-------------");
		System.out.println("CONVERSOR DE KB A MB");
		System.out.println("-------------");
		
		System.out.print("Dame los KB: ");
		int kb = pedirInt(pedido);
		
		double mb = kb * KB_A_MB;
		
		System.out.println("-------------");
		System.out.printf("%d KB son %.2f MB%n", kb, mb);

	}
	
	//pedirInt: pide un int al usuario, en este caso negamos los negativos (int)
	public static int pedirInt(Scanner pedido) {
		
		int numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextInt();
				error = false;
				
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero entero");
				pedido.nextLine();
				error = true;
			}
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
