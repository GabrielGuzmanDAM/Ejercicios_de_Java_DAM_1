/*
 * Descripción: Calculadora simple
 * Autor: Gabriel Guzmán
 * Fecha: 19/10/2026
 */

package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		double numero1 = 0;
		double numero2 = 0;
		boolean fin = false;
		
		int movimiento;
		
		do {
			System.out.println("-------------");
			System.out.println("Indique la operación que quiere realizar (Inserte un número):");
			System.out.println("(1) Suma");
			System.out.println("(2) Resta");
			System.out.println("(3) Multiplicación");
			System.out.println("(4) División");
			System.out.println("(0) Finalizar");
			System.out.println("-------------");
			System.out.print("Resultado:");
			movimiento = pedirInt(pedido);
			
			System.out.println("-------------");
			System.out.print("Dame el primer numero: ");
			numero1 = pedirDouble(pedido);
			
			System.out.println("-------------");
			System.out.print("Dame el segundo numero: ");
			numero2 = pedirDouble(pedido);
			
			switch (movimiento) {
			case 1:
				
				double suma = numero1 + numero2;
				
				System.out.println("-------------");
				System.out.printf("La suma es: %.2f \n" , suma);
				
				break;
				
			case 2:
				
				double resta = numero1 - numero2;
				
				System.out.println("-------------");
				System.out.printf("La suma es: %.2f \n" , resta);
				
				break;
				
			case 3:
				
				double multiplicacion = numero1 * numero2;
				
				System.out.println("-------------");
				System.out.printf("La suma es: %.2f \n" , multiplicacion);
				
				break;
				
			case 4:
				
				double divison = numero1 / numero2;
				
				System.out.println("-------------");
				System.out.printf("La suma es: %.2f \n" , divison);
				
				break;

			default:
				
				System.out.println("-------------");
				System.out.printf("fin");
				
				fin = true;
				
				break;
			}
			
			
		} while (!fin);
		
		
	}
	
	//pedirDouble: pide un double al usuario, (double)
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
			
			if (numero < 0 || numero > 4) {
				System.out.println("Error: Debe de introducir un numero balido");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
