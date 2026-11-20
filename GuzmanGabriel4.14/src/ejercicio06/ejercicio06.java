/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double sumaPreciotTotal = 0;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("---------------------------");
			System.out.print("Introduce el precio del prodicto " + (i +1) + ": ");
	        double precio = pedirDouble(teclado);
	        
			double precioTotal = precioConIVA(precio);
			
	        sumaPreciotTotal += precioTotal;
			
			System.out.println("---------------------------");
	    	System.out.printf("El precio con IVA edel producto" +(i+1)+": %.2f \n" ,precioTotal);
			
		}
		
		System.out.println("---------------------------");
    	System.out.printf("El precio con IVA de todos los prodictos es: %.2f \n" ,sumaPreciotTotal);
		
	}
	
	//millas_a_kilometros: hace la convercion de millas a kilometros (boolean)
	public static double precioConIVA(double precios) {
			
		return  precios + (precios * 0.21);
			
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
