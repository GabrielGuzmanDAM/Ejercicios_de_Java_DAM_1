/*
 * Descripción: indica cual numero es mas grande de dos que da el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 14/10/2026
 */

/*
Realizar un programa en Java que solicite al usuario dos números, num1 y num2.
 Comprobar si num1 es mayor que num2, si es al revés o si son iguales.
 Mostrar por pantalla al usuario un mensaje informando del resultado.

 */

package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame el primer numero: ");
		double num1 = pedirDouble(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame el segundo numero: ");
		double num2 = pedirDouble(pedido);
		
		if (num1 > num2) {
			
			System.out.println("-------------");
			System.out.printf("El numero mas grande es el primero: %.2f" , num1 );
			
		} else if (num2 > num1){
			
			System.out.println("-------------");
			System.out.printf("El numero mas grande es el segundo: %.2f" , num1 );
			
		}else {
			
			System.out.println("-------------");
			System.out.printf("Los dos numeros tienen el mismo tamaño");
			
		}

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
			
		} while (error);
		
		return numero;
	}

}
