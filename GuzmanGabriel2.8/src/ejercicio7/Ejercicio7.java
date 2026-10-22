/*
 * Descripción: El usuario tiene que encntrar el numeroaleatorio de 0 a 50
 * Autor: Gabriel Guzmán
 * Fecha: 22/10/2026
 */

package ejercicio7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		boolean fin = false;
		
		int numero;
		System.out.println("-------------");
		System.out.println("ADIVINA EL NUMERO");
		
		int numeroAleatorio = (int) (Math.random()*50);
		
		do {
			
			System.out.println("-------------");
			System.out.print("Dame un numero entero de 0 a 50: ");
			numero = pedirInt(pedido);
			
			if (numero < numeroAleatorio) {
				
				System.out.println("-------------");
				System.out.println("El numero es mas alto");
				
			} else if (numero > numeroAleatorio) {
				
				System.out.println("-------------");
				System.out.println("El numero es mas bajo");
				
			} else {
				
				System.out.println("-------------");
				System.out.printf("Felicidades!, el numero era: %d" , numeroAleatorio);
				
				fin = true;
			}
			
		} while (!fin);

	}
	
	//pedirInt: pide un double al usuario (int)
	public static int pedirInt(Scanner pedido) {
		
		int numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextInt();
				error = false;
				
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero");
				pedido.nextLine();
				error = true;
			}
			
			if (numero < 0 || numero > 50) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
			
		} while (error);
		
		return numero;
	}

}
