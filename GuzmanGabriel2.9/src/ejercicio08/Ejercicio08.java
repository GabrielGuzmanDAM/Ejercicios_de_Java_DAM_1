/*
 * Descripción: Dise cuantos numeros negativos y pocitivos se an dado
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int contardorNegativos = 0;
		
		int contadorPocitivos = 0;
		
		boolean fin = false;
		
		int contador = 0;
		
		do {
			
			contardorNegativos = 0;
			
			contadorPocitivos = 0;
			
			System.out.println("-------------");
			System.out.println("CONTADOR DE NUMEROS NEGATIVOS Y NULOS");
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
					double numero = pedirDouble(pedido);
					
					contador ++;
				
					
					if (numero == 0) {
						
						fin = true;
						
					} else if (numero < 0){
						
						contardorNegativos ++;

					} else {
						
						contadorPocitivos ++;
						
					}
					
					System.out.println("\n-------------");
					System.out.println("Cantidad de numeros dados: " + contador);
					System.out.println("Numeros de pocitivos: " + contadorPocitivos);
					System.out.println("Numeros de negativos: " + contardorNegativos);
					
				} while (!fin);
				
				contador = 0;
				
				fin = false;
				
				
			} else if (paso == 2){
				
				int numeroAleatorio;
				
				System.out.println("-------------");
				
				do {
					
					contador++;
					
					numeroAleatorio = (int) ((Math.random()*200) - 100);	

					System.out.print( numeroAleatorio + ", ");
					
					if (numeroAleatorio == 0) {
						
						fin = true;
						
					} else if (numeroAleatorio < 0){
						
						contardorNegativos ++;

					} else {
						
						contadorPocitivos ++;
						
					}		
				
					
				} while (!fin);
				
				System.out.println("\n-------------");
				System.out.println("Cantidad de numeros dados: " + contador);
				System.out.println("Numeros de pocitivos: " + contadorPocitivos);
				System.out.println("Numeros de negativos: " + contardorNegativos);
				
				fin = false;
				
				contador = 0;
				
				contardorNegativos = 0;
				
				contadorPocitivos = 0;

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
			
			if (numero < 0 || numero >2) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
