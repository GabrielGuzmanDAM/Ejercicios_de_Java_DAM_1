/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 20/11/2026
 */

package ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("---------------------------");
		System.out.print("Introduce el ancho del rectangulo: ");
        double ancho = pedirDouble(teclado);
        
        System.out.println("---------------------------");
		System.out.print("Introduce el altura del rectangulo: ");
        double altura = pedirDouble(teclado);
		
        double area = areaRectangulo(ancho, altura);
        
        double perimetro = perimetroRectangulo(ancho, altura);
        
        
		System.out.println("---------------------------");
    	System.out.printf("El area es: %.2f \n" ,area);
    	System.out.printf("El perimetro es es: %.2f \n" ,perimetro);
	}
	
	//perimetroRectangulo: (boolean)
	public static double perimetroRectangulo(double ancho, double altura) {
			
		return  2 * (ancho * altura);
			
	}
	
	//areaRectangulo: (boolean)
	public static double areaRectangulo(double ancho, double altura) {
			
		return  ancho * altura;
			
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
