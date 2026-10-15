/*
 * Descripción: verifica que el usuario compla los requisitos para onsequir el trabajo
 * Autor: Gabriel Guzmán
 * Fecha: 15/10/2026
 */


package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		//variables: nombre, apellido, edad, selarioDeseado
		
		String nombre;
		String apellido;
		
		int edad;
		int selarioDeceado;
		
		int anosTravajo;
		int proyectoTrabajados;
		
		System.out.println("-------------");
		System.out.print("Dame un nombre: ");
		nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame un apellido: ");
		apellido = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame la edad: ");
		edad = pedirInt(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame la salario deseado: ");
		selarioDeceado = pedirInt(pedido);
		
		if (selarioDeceado > 30000 || edad > 45) {
			
			System.out.println("-------------");
			System.out.println("Lo sentimos pero no cumple nuestro perfil");

			
		} else {
			
			System.out.println("-------------");
			System.out.print("Dame los años de experiencia: ");
			anosTravajo = pedirInt(pedido);
			
			System.out.println("-------------");
			System.out.print("Dame en cuantos proyectos as travajado: ");
			proyectoTrabajados = pedirInt(pedido);
			
			if (anosTravajo < 3 || proyectoTrabajados < 4) {
				
				System.out.println("-------------");
				System.out.println("Lo sentimos pero no cumple nuestro perfil");
				
			} else {
				
				System.out.println("-------------");
				System.out.println("Enhorabuena. Ha sido contratado");

			}

		}

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
