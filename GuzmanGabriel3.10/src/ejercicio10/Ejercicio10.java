/*
 * Descripción: el tamaño lo da el usuario, guarda alturas de personas aleatorios en un array, pide la media, el mayor, el menor, cuantas personas miden por encima y por debajo de la media
 * Autor: Gabriel Guzmán
 * Fecha: 05/11/2026
 */

package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int tamano = 0;
		
		double sumaAlturas = 0;
		double mediaAlturas = 0;
		double alturaMayor = 0;
		double alturaMenor = 0;
		int contadorMayorMedia = 0;
		int contadorMenorMedia = 0;
		
		System.out.println("-------------");
		System.out.print("Dame el numero de personas: ");
		tamano = pedirInt(pedido);
		
		double[] alturas = new double[tamano];
		
		for (int i = 0; i < alturas.length; i++) {
			
			//generamos alturas aleatorias entre 1.50 y 2.00 metros
			alturas[i] = (Math.round(Math.random() * 50.0) / 100.0) + 1.50;			
			
			sumaAlturas += alturas[i];
		}
		
		mediaAlturas = sumaAlturas / tamano;
		
		for (int i = 0; i < alturas.length; i++) {
			
			if (alturas[i] > mediaAlturas) {
				contadorMayorMedia++;
			} else if (alturas[i] < mediaAlturas) {
				contadorMenorMedia++;
			}
			
			if (i == 0) {
				alturaMayor = alturas[i];
				alturaMenor = alturas[i];
			} else {
				if (alturas[i] > alturaMayor) {
					alturaMayor = alturas[i];
				}
				
				if (alturas[i] < alturaMenor) {
					alturaMenor = alturas[i];
				}
			}
			
		}
		
		System.out.println("-------------");
		System.out.print("Lista de numeros: ");
		
		for (int i = 0; i < alturas.length; i++) {
			
			System.out.printf("%.2f, " , alturas[i]);
			
		}
		
		System.out.println("\n-------------");
		System.out.printf("La media de alturas es: %.2f%n", mediaAlturas);
		System.out.println("-------------");
		System.out.printf("La altura mayor es: %.2f%n", alturaMayor);
		System.out.println("-------------");
		System.out.printf("La altura menor es: %.2f%n", alturaMenor);
		System.out.println("-------------");
		System.out.printf("El numero de personas que miden por encima de la media es: %d%n", contadorMayorMedia);
		System.out.println("-------------");
		System.out.printf("El numero de personas que miden por debajo de la media es: %d%n", contadorMenorMedia);
		
		

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
			
			if (numero < 0 ) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}


}
