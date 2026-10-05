/*
 * Descripción: Calcula el área, diagonal y perímetro de un rectángulo según los datos que da el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double AREA = 1;
		final double DIAGONAL = 2;
		final double PERIMETRO = 3;
		
		byte opcion = 0;
		
		do{
		
			System.out.println("-------------");
			System.out.println("CALCULADORA DE RECTÁNGULOS");
			System.out.println("-------------");
			System.out.println("0. Salir");
			System.out.println("1. Área");
			System.out.println("2. Diagonal");
			System.out.println("3. Perímetro");
			System.out.println("-------------");
		
			System.out.print("Elige una opción: ");
			opcion = pedirByte(pedido);
		
			if (opcion == AREA) {
				System.out.println("-------------");
				System.out.print("Dame la base: ");
				double base = pedirDouble(pedido);
			
				System.out.print("Dame la altura: ");
				double altura = pedirDouble(pedido);
			
				double area = calcularArea(base, altura);
			
				System.out.printf("El área del rectángulo es: %.2f%n", area);
			
			} else if (opcion == DIAGONAL) {
				System.out.println("-------------");
				System.out.print("Dame la base: ");
				double base = pedirDouble(pedido);
			
				System.out.print("Dame la altura: ");
				double altura = pedirDouble(pedido);
			
				double diagonal = calcularDiagonal(base, altura);
			
				System.out.printf("La diagonal del rectángulo es: %.2f%n", diagonal);
			
			} else if (opcion == PERIMETRO) {
				System.out.println("-------------");
				System.out.print("Dame la base: ");
				double base = pedirDouble(pedido);
			
				System.out.print("Dame la altura: ");
				double altura = pedirDouble(pedido);
			
				double perimetro = calcularPerimetro(base, altura);
			
				System.out.printf("El perímetro del rectángulo es: %.2f%n", perimetro);
			} else {
				System.out.println("Saliendo del programa...");
			}
		
		}while (opcion != 0);
		

	}
	
	//pedirInt: pide un byte al usuario, en este caso negamos los negativos (int)
	public static byte pedirByte(Scanner pedido) {
		
		byte numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextByte();
				error = false;
				
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero entero");
				pedido.nextLine();
				error = true;
			}
			
			if (numero < 0 && !error || numero > 3) {
				System.out.println("Error: Debe de introducir un numero entero positivo entre 0 y 3");
				error = true;
			}
			
		} while (error);
		
		return numero;
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
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}
	
	//calcularArea: calcula el área de un rectángulo (double)
	public static double calcularArea(double base, double altura) {
		return base * altura;
	}
	
	//calcularDiagonal: calcula la diagonal de un rectángulo (double)
	public static double calcularDiagonal(double base, double altura) {
		
		// Teorema de Pitágoras: diagonal = sqrt(base^2 + altura^2)
		return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
	}
	
	//calcularPerimetro: calcula el perímetro de un rectángulo (double)
	public static double calcularPerimetro(double base, double altura) {
		return 2 * (base + altura);
	}

}
