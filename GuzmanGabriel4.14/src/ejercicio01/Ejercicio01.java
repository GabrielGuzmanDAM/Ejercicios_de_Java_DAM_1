/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        // Pedimos los dos números
        System.out.print("Introduce el primer número: ");
        double num1 = pedirDouble(teclado);

        System.out.print("Introduce el segundo número: ");
        double num2 = pedirDouble(teclado);

        // Llamamos a la función
        double resultado = multiplica(num1, num2);

        // Mostramos el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        teclado.close();
	}
	
    // Función que multiplica dos números reales
    public static double multiplica(double a, double b) {
        return a * b;
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
