/*
 * Descripción:
 * Autor: Gabriel Guzmán
 * Fecha: 07/10/2026
 */

package bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Buclefor {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("--------------------");
		System.out.println("La cobercion en horas, minutos y segundos");
		System.out.println("--------------------");
		System.out.print("Dame un numero: ");
		int numero = pedirInt(pedido);
		
		for(int i=1 ; i<=numero; i++) {
			
			System.out.println("Cantidad de numeros: " + i);
			
			numero = pedirInt(pedido);
			
		}

	}
	
	//pedirInt: pide un int al usuario, en este caso negamos los negativos (int)
	public static int  pedirInt(Scanner pedido) {
		
		int  numero = 0;
		
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
