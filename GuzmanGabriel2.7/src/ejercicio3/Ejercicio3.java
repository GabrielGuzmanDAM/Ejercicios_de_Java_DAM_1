/*
 * Descripción: Dar el resultado de la nota segun lo que da el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 16/10/2026
 */

package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int nota;
		
		System.out.println("-------------");
		System.out.print("Dame la nota del examen: ");
		
		 nota = pedirInt(pedido);
		
		switch (nota) {
		case 0,2,3,4:
			
			System.out.println("-------------");
			System.out.println("La nota es: Insificioente");

			
			break;
		
		case 5,6:
			
			System.out.println("-------------");
			System.out.println("La nota es: Aprovado");
			
			break;
		
		case 7,8:
			
			System.out.println("-------------");
			System.out.println("La nota es: Bien");
			
			break;
		
		case 9:
			
			System.out.println("-------------");
			System.out.println("La nota es: Exelente");
			
			break;

		default:
			
			System.out.println("-------------");
			System.out.println("La nota es: Perfecto");
			
			break;
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
			
			if (numero < 0  && numero > 10) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
