/*
 * Descripción: pide los datos al usuario para verificar si comple los requicitos para ser admitido
 * Autor: Gabriel Guzmán
 * Fecha: 14/10/2026
 */

package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame tu edad: ");
		int edad = pedirInt(pedido);
		
		if (edad >= 18) {
			
			pedido.nextLine();
			
			System.out.println("-------------");
			System.out.print("Dame tu nombre: ");
			String nombre = pedido.nextLine();
			
			System.out.println("-------------");
			System.out.print("Dame tun apellido: ");
			String apellido = pedido.nextLine();
			
			System.out.println("-------------");
			System.out.printf("Nombre: %s \n" , nombre);
			System.out.printf("Apellido: %s \n" , apellido);
			System.out.printf("Edad: %d \n \n" , edad);
			System.out.print("Usted ha sido admitido");
			
		} else {
			
			System.out.println("-------------");
			System.out.print("No tiene la edad requerida para realizar estos estudios.");
			
		}

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
