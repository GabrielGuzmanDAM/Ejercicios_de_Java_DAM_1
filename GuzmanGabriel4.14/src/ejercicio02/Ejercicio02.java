package ejercicio02;

import java.util.InputMismatchException;
/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("---------------------------");
        System.out.print("Escrive tu edad: ");
        int num = pedirInt(teclado);
        
        if (esMayorEdad(num)) {
        	
        	System.out.println("---------------------------");
        	System.out.println("Eres mayor de edad");
			
		} else {
			
			System.out.println("---------------------------");
        	System.out.println("no eres mayor de edad");

		}
        
        teclado.close();

	}
	
	//esMayorEdad: me dise si la persona es mayor de edad (boolean)
	public static boolean esMayorEdad(int numero) {
			
		return numero >= 18;
			
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
			
			if (numero < 0) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
