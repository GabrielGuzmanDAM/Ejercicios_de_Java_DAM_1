/*
 * Descripción: cuenta la cantidad de numeros 10 que aparescan
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int contardorNumero10 = 0;
		
		boolean fin = false;
		
		do {
			
			contardorNumero10 = 0;
			
			System.out.println("-------------");
			System.out.println("CUENTA LA CANTIDAD DE NUMERO 10");
			System.out.println("-------------");
			System.out.println("1) Manual");
			System.out.println("2) Automatico");
			System.out.println("0) FIN");
			System.out.println("-------------");
			System.out.print("Dame un numero: ");
			int paso = pedirInt(pedido);
			
			if (paso == 1) {
				
				do {
					
					System.out.println("-------------");
					System.out.print("Dame un numero: ");
					double numero = pedirInt(pedido);	
					
					if (numero == -1) {
						
						fin = true;
						
					} else if (numero == 10){
						
						contardorNumero10 ++;

					} 			

					
				} while (!fin);
				
				System.out.println("\n-------------");
				System.out.println("Numero de numeros 10: " + contardorNumero10);
				
				fin = false;
				
				
			} else if (paso == 2){
				
				int numeroAleatorio;
				
				System.out.println("-------------");
				
				do {
					

					numeroAleatorio = (int) ((Math.random()*13) - 2);	

					System.out.print( numeroAleatorio + ", ");
					
					if (numeroAleatorio == -1) {
						
						fin = true;
						
					} else if (numeroAleatorio == 10){
						
						contardorNumero10 ++;

					} 
					
				} while (!fin);
				
				System.out.println("\n-------------");
				System.out.println("Numero de numeros 10: " + contardorNumero10);
				
				fin = false;
				
				contardorNumero10 = 0;
				
			} else {
				
				System.out.println("-------------");
				System.out.println("Finalizar programa");
				
				fin = true;
				
			}
			
			
		} while (!fin);
		

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
