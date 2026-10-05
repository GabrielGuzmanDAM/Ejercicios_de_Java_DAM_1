/*
 * Descripción: Calcula el área, perímetro, lado y ángulo de un triángulo según los datos que da el usuario
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final byte AREA = 1;
		final byte PERIMETRO = 2;
		final byte LADO = 3;
		final byte ANGULO = 4;
		final byte SALIR = 0;
		
		byte opcion = 0;
		
		do {
			
			System.out.println("-------------");
			System.out.println("CALCULADORA DE TRIÁNGULOS");
			System.out.println("-------------");
			System.out.println("0. Salir");
			System.out.println("1. Área");
			System.out.println("2. Perímetro");
			System.out.println("3. Lado");
			System.out.println("4. Ángulo");
			System.out.println("-------------");
			
			System.out.print("Elige una opción: ");
			opcion = pedirByte(pedido);
			
			switch (opcion) {
				case AREA:
					// Código para calcular el área
					System.out.println("-------------");
					System.out.print("Dame la base: ");
					double base = pedirDouble(pedido);
				
					System.out.print("Dame la altura: ");
					double altura = pedirDouble(pedido);
				
					double area = calcularArea(base, altura);
				
					System.out.printf("El área del triángulo es: %.2f%n", area);
					break;
				case PERIMETRO:
					// Código para calcular el perímetro
					System.out.println("-------------");
					System.out.print("Dame el lado 1: ");
					double lado1 = pedirDouble(pedido);
				
					System.out.print("Dame el lado 2: ");
					double lado2 = pedirDouble(pedido);
				
					System.out.print("Dame el lado 3: ");
					double lado3 = pedirDouble(pedido);
				
					double perimetro = calcularPerimetro(lado1, lado2, lado3);
				
					System.out.println("-------------");
					System.out.printf("El perímetro del triángulo es: %.2f%n", perimetro);
					break;
				case LADO:
					// Código para calcular el lado
					System.out.println("-------------");
					System.out.print("Dame el lado 1: ");
					double ladoA = pedirDouble(pedido);
					
					System.out.print("Dame el lado 2: ");
					double ladoB = pedirDouble(pedido);
					
					System.out.print("Dame el ángulo entre los lados (en grados): ");
					double angulo = pedirDouble(pedido);
					
					System.out.println("-------------");
					double ladoC = calcularLado(ladoA, ladoB, angulo);
					System.out.printf("El lado del triángulo es: %.2f%n", ladoC);
					break;
				case ANGULO:
					// Código para calcular el ángulo
					System.out.println("-------------");
					System.out.print("Dame el lado 1: ");
					double ladoX = pedirDouble(pedido);
					System.out.print("Dame el lado 2: ");
					double ladoY = pedirDouble(pedido);
					System.out.print("Dame el lado 3: ");
					double ladoZ = pedirDouble(pedido);
					
					System.out.println("-------------");
					double anguloCalculado = calcularAngulo(ladoX, ladoY, ladoZ);
					System.out.printf("El ángulo del triángulo es: %.2f grados%n", anguloCalculado);
					break;
				case SALIR:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
			
		} while (opcion != SALIR);
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
			
			if (numero < 0 && !error || numero > 4) {
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
	
	//calcularArea: calcula el área de un triángulo (double)
	public static double calcularArea(double base, double altura) {
		
		// Fórmula del área de un triángulo: (base * altura) / 2
		return (base * altura) / 2;
	}
	
	//calcularPerimetro: calcula el perímetro de un triángulo (double)
	public static double calcularPerimetro(double lado1, double lado2, double lado3) {
		
		// Fórmula del perímetro de un triángulo: lado1 + lado2 + lado3
		return lado1 + lado2 + lado3;
	}
	
	//calcularLado: calcula el lado de un triángulo (double)
	public static double calcularLado(double lado1, double lado2, double angulo) {
		
		// Fórmula del lado de un triángulo usando la ley de cosenos: c^2 = a^2 + b^2 - 2ab * cos(C)
		return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2) - (2 * lado1 * lado2 * Math.cos(Math.toRadians(angulo))));
	}
	
	//calcularAngulo: calcula el ángulo de un triángulo (double)
	public static double calcularAngulo(double lado1, double lado2, double lado3) {
		
		// Fórmula del ángulo de un triángulo usando la ley de cosenos: cos(C) = (a^2 + b^2 - c^2) / (2ab)
		return Math.toDegrees(Math.acos((Math.pow(lado1, 2) + Math.pow(lado2, 2) - Math.pow(lado3, 2)) / (2 * lado1 * lado2)));
	}

}
