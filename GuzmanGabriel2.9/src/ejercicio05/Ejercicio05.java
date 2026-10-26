/*
 * Descripción: Muestra el factorial de el numero dado
 * Autor: Gabriel Guzmán
 * Fecha: 23/10/2026
 */

package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un numero: ");
		int numero = pedirInt(pedido);
		
		int factorial = 1;
		
		System.out.println("-------------");
		System.out.printf("0! = 1 \n");
		
		for (int i = 1; i <numero + 1; i++) {
			
			factorial *= i;
			
			System.out.println("-------------");
			System.out.printf("%d! = %d \n" , i , factorial);
			
		}

	}
	
	//pedirInt: pide un int al usuario (int)
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
			
		} while (error);
		
		return numero;
	}

}
