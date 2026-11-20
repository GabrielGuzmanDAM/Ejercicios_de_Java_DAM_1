/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("---------------------------");
        System.out.print("Escrive tu edad: ");
        int num = pedirInt(teclado);
        
        int resultado = dimeSigno(num); 
        
        if (resultado == 1) {
        	
        	System.out.println("---------------------------");
        	System.out.printf("Es positivo");
			
		} else if (resultado == -1) {
			
        	System.out.println("---------------------------");
        	System.out.printf("Es negativo");
        	
		} else {
			
        	System.out.println("---------------------------");
        	System.out.printf("Es cero");

		}
        
        teclado.close();

        
	}
	
	//dimeSigno: me dise si la persona es mayor de edad (boolean)
	public static int dimeSigno(int numero) {
			
		int resultado; 
		
		if (numero > 0) {
			
			resultado = 1;
			
		} else if (numero < 0) {
			
			resultado = -1;
			
		} else {
			
			resultado = 0;

		}
		
		return resultado;
			
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
			
		} while (error);
		
		return numero;
	}

}
