/*
 * Descripción: un Array que guarde una secuencia aritmetica de V y I dados por el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2026
 */

package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int TAMANO = 100;
		
		int numeroV;
		int numeroI;
		
		int incremento = 0;
		
		int[] secuenciaAritmetica = new int[TAMANO];
		
		System.out.println("-------------");
		System.out.print("Dame un numero entero: ");
		numeroV = pedirInt(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un numero entero: ");
		numeroI = pedirInt(pedido);
		
		for (int i = 0; i < secuenciaAritmetica.length; i++) {
			
			secuenciaAritmetica[i] = numeroV + incremento;
			
			incremento += numeroI;
			
		}
		
		System.out.println("-------------");
		
		for (int i = 0; i < secuenciaAritmetica.length; i++) {
			System.out.print(secuenciaAritmetica[i] + ", ");
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
			
		} while (error);
		
		return numero;
	}

}
