/*
 * Descripción: pide 10 numeros y calcula la media de numeros negativos y positivos y elca cantidad de 0
 * Autor: Gabriel Guzmán
 * Fecha: 19/10/2026
 */

package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numero;
		double sumaPositiva = 0;
		double sumaNegativo = 0;
		double mediaPositiva = 0;
		double mediaNegativa = 0;
		int contador = 1;
		int contadorPositivo = 0;
		int contadorNegativa = 0;
		int contador0 = 0;
		
		for (int i = 0; i < 10; i++) {
			

			System.out.printf("Dame un numero (%d): " , contador);
			numero = pedirDouble(pedido);
			
			if (numero > 0) {
				
				contadorPositivo ++;
				
				sumaPositiva += numero;
				
				
			}else if (numero < 0) {
				
				contadorNegativa++;
				
				sumaNegativo += numero;
				
			}else {
				
				contador0 ++;
				
			}
			
			contador ++;

		}
		
		mediaPositiva = sumaPositiva / contadorPositivo;
		
		mediaNegativa = sumaNegativo / contadorNegativa;
		
		
		System.out.println("-------------");
		System.out.printf("Media de numeros positivos: %.2f \n" , mediaPositiva);
		System.out.println("-------------");
		System.out.printf("Media de numeros negativas: %.2f \n" , mediaNegativa);
		System.out.println("-------------");
		System.out.printf("La cantidad de 0: %d \n" , contador0);
	}
	
	
	//pedirDouble: pide un double al usuario (double)
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
