/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.print("Introduce el numero de millas: ");
        double millas = pedirDouble(teclado);
        
        double kilometros = millas_a_kilometros(millas);
        
        System.out.println("---------------------------");
    	System.out.printf("%.2f millas es %.2f kilometros" ,millas ,kilometros);
	}
	
	//millas_a_kilometros: hace la convercion de millas a kilometros (boolean)
	public static double millas_a_kilometros(double millas) {
			
		return  millas * 1.60934;
			
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
			
			if (numero < 0) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
