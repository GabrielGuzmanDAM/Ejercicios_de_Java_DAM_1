/*
 * Descripción: Verificamos si el usuario comple los requicitos para incrivirse en los estudios.
 * Autor: Gabriel Guzmán
 * Fecha: 14/10/2026
 */

package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame tu nombre: ");
		String nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tu edad: ");
		int edad = pedirInt(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame la nota academica: ");
		double notas = pedirDouble(pedido);
		
		if (edad > 18 && notas > 7){
			
			System.out.println("-------------");
			System.out.printf("%s, usted ha sido admitido en el curso, cumple las condiciones requeridas" , nombre);
			
		} else {
			
			System.out.println("-------------");
			System.out.printf("%s, lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos" , nombre);
			
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
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
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
