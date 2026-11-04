/*
 * Descripción: Guarda y muestra una lista de numeros dadas y da el minimo y el maximo
 * Autor: Gabriel Guzmán
 * Fecha: 4/11/2026
 */

package ejercicio03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int TAMANO = 10;
		
		double numero = 0;
		
		double[] numeros = new double[TAMANO];
		
		double maximo;
		
		double minimo;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("-------------");
			System.out.print("Dame un numero: ");
			numero = pedirDouble(pedido);
			
			numeros[i] = numero;
			
		}
		
		System.out.println("-------------");
		System.out.print("Lista de numeros: ");
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + ", ");
			
		}
		//numero mas alto y mas bajo de la lista
		maximo = Arrays.stream(numeros).max().getAsDouble();
		
		minimo = Arrays.stream(numeros).min().getAsDouble();
		
		System.out.println("\n-------------");
		System.out.print("El numero mas alto es: " + maximo);
		System.out.println("\n-------------");
		System.out.print("El numero mas bajo es: " + minimo);
		

	}
	

	
	
	
	//pedirDouble: pide un int al usuario. (int)
	public static double pedirDouble(Scanner pedido) {
		
		double numero = 0;
		
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
