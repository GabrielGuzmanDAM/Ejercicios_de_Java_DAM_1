/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.print("Introduce el primer número: ");
        double num1 = pedirDouble(teclado);
        
        System.out.println("---------------------------");
		System.out.print("Introduce el segundo número: ");
        double num2 = pedirDouble(teclado);
        
        
        if (minimo(num1 , num2)) {
        	
        	System.out.println("---------------------------");
        	System.out.printf("%.2f es mayor a %.2f" ,num1  ,num2);
			
		} else {
			
			System.out.println("---------------------------");
        	System.out.printf("%.2f es mayor a %.2f" ,num2  ,num1);

		}
        
        teclado.close();

	}
	
	//minimo: Dise cual numero es mayor de dos numeros (boolean)
	public static boolean minimo(double numero1 , double numero2) {
			
		return numero1 > numero2;
			
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
