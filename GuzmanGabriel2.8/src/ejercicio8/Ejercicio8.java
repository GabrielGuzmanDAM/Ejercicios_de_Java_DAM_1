/*
 * Descripción: En vase a datos dada por los usuarios de las rutas, mustra diferentes datos de estas y el usuario.
 * Autor: Gabriel Guzmán
 * Fecha: 22/10/2026
 */

package ejercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		String nombre;
		String apellido;
		int edad;
		int numeroRutaRealizadas;
		int distanciaUltimaRuta;
		
		int distancia;
		int numeroDeParticipantes;
		String ciudad;
		
		int sumaDistanciaRutas = 0;
		double distanciaMediaRutas = 0;
		int distanciaMasLarga = 0;
		String ciudadRutaMasLarga = "";
		
		System.out.println("-------------");
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tu apellido: ");
		apellido = pedido.nextLine();
		
		do {
			
			System.out.println("-------------");
			System.out.print("Dame tu edad (entre 17 y 45): ");
			edad = pedirInt(pedido);
			
			if (edad < 18 || edad > 44) {
				
				System.out.println("La edad tiene que ser mayor de 17 y menor a 45");
				
			}
			
		} while (edad < 18 || edad > 44);
		
		System.out.println("-------------");
		System.out.print("El numero de rutas a las que as participado: ");
		numeroRutaRealizadas = pedirInt(pedido);
		
		System.out.println("-------------");
		System.out.print("La distancia de la ultima ruta: ");
		distanciaUltimaRuta = pedirInt(pedido);
		
		System.out.println("-------------");
		System.out.println("Dame datos de las ultimas 5 rutas");
		System.out.println("-------------");
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("-------------");
			System.out.println("la ruta numero " + (i + 1));
			System.out.println("-------------");
			System.out.print("La distancia de la ruta: ");
			distancia = pedirInt(pedido);
			
			System.out.println("-------------");
			System.out.print("Participantes: ");
			numeroDeParticipantes = pedirInt(pedido);
			
			pedido.nextLine();
			
			System.out.println("-------------");
			System.out.print("Ciudad: ");
			ciudad = pedido.nextLine();
			
			sumaDistanciaRutas += distancia;
			
			if (distanciaMasLarga < distancia) {
				
				distanciaMasLarga = distancia;
				
				ciudadRutaMasLarga = ciudad;
				
			}
			
		}
		
		distanciaMediaRutas = sumaDistanciaRutas / 5;
		
		System.out.println("-------------");
		System.out.printf("Nombre: %s \n" , nombre);
		System.out.printf("Edad: %d \n" , edad);
		System.out.printf("Número de rutas realizadas: %d \n\n" , numeroRutaRealizadas);
		System.out.printf("Distancia media (5 últimas rutas): %.2f \n" , distanciaMediaRutas);
		System.out.printf("Distancia más larga de las últimas 5 rutas: %d \n" , distanciaMasLarga);
		System.out.printf("Ciudad de la ruta más larga: %s \n" , ciudadRutaMasLarga);
		System.out.println("-------------");

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
			
			if (numero < 0) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
