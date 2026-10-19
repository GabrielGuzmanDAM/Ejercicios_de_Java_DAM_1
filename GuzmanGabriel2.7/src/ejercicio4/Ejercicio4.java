/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 16/10/2026
 */

package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int elegir = 0;
		
		boolean fin = false;
		
		double nota;
		
		double sumaNotas = 0;
		
		int contador = 1;
		
		double mediaNotas;
		
		do {
			System.out.println("-------------");
			System.out.println("IMPORTES DEL ULTIMO MES");
			System.out.println("-------------");
			System.out.println("1. Agregar nota: ");
			System.out.println("0. fin.");
			System.out.println("-------------");
			System.out.print("Numero: ");
			elegir = pedirInt(pedido);
			
			if (elegir == 1){
				
				System.out.println("-------------");
				System.out.printf("Nota numero %d: " , contador);
				nota = pedirDouble(pedido);
				
				sumaNotas += nota;
				
				contador ++;
			
			} else if (elegir == 0) {
				
				fin = true;
				
			}
			
			
		}while (!fin);
		
		mediaNotas = sumaNotas / contador;
		
		System.out.println("-------------");
		System.out.printf("Nota media: %.2f \n" , mediaNotas);
		System.out.printf("Nota media (Redondeado hacia arriba):  %.2f \n" ,Math.ceil(mediaNotas));
		System.out.printf("Nota media (Redondeado hacia abajo):  %.2f \n" , Math.floor(mediaNotas));
		
		if (mediaNotas > 8) {
			
			System.out.println("Felicidades, puede acceder a estudios superiores");
			
		} else {
			
			System.out.println(" la nota media obtenida no es suficiente para acceder a los estudios que deseaba");
			
		}

	}
	
	//pedirDouble: pide un double al usuario, en este caso negamos los negativos (double)
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
			
			if (numero < 0 ) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
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
			
			if (numero < 0 || numero > 1) {
				System.out.println("Error: Debe de introducir un numero no es valido");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
