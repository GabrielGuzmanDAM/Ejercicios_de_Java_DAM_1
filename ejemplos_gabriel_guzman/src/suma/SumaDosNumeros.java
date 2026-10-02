/*
 * Descripción: Sumar dos numeros
 * Autor: Gabriel Guzmán
 * Fecha: 18/09/2026
 */

package suma;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SumaDosNumeros {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
			
		double numero1 = 0;
		double numero2 = 0;
		double suma = 0;
		
		
		numero1 = pedirNumero(pedido);
		
		numero2 = pedirNumero(pedido);
		
		suma = sumar(numero1 , numero2);
		
		System.out.println("-------------");
		System.out.println("La suma de los dos numeros es: " + suma);

	}
	
	// sumar: pide un mumero al usuario (double)
	public static double pedirNumero(Scanner pedido) {
		
		
		double numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				System.out.println("-------------");
				System.out.print("Dame un numero: ");
				numero = pedido.nextDouble();
				
				error = false;
				
			    
			} catch (InputMismatchException e) {
				
				System.out.println("-----------------------");
				System.out.println("No me has dado un numero");
				System.out.println("-----------------------");
				
				error = true;
				
				pedido.nextLine();
				
			} 

		}while(error);
		
		 return numero;
	    
	}
	
	// sumar: permite sumar dos numeros (double)
	public static double sumar(double a, double b) {
	    return a + b;
	}


}
