/*
 * Descripción: Pide dos numeros al usuario y calcula el menor, el primero elevado al segundo, la raiz cuadrada del primero y un valor random del segundo, mostrando el resultado por pantalla
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame el primer numero: ");
		double num1 = pedirDouble(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame el segundo numero: ");
		double num2 = pedirDouble(pedido);
		
		double menor = Math.min(num1, num2);
		double elevado = Math.pow(num1, num2);
		double raiz = Math.sqrt(num1);
		double random = Math.random() * num2;
		
		System.out.println("-------------");
		System.out.printf("Los numeros introducidos son: %.2f y %.2f%n", num1, num2);
		
		System.out.println("-------------");
		System.out.printf("El numero menor es: %.2f%n", menor);
		
		System.out.println("-------------");
		System.out.printf("El primer numero elevado al segundo es: %.2f%n", elevado);
		
		System.out.println("-------------");
		System.out.printf("La raiz cuadrada del primer numero es: %.2f%n", raiz);
		
		System.out.println("-------------");
		System.out.printf("Un valor random del segundo numero es: %.2f%n", random);
	
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
