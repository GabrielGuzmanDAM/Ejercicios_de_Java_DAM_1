/*
 * Descripción: Dise cuantos numeros negativos se an dado
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int contardorNegativos = 0;
		int contadorNulo = 0;
		
		boolean fin = false;
		
		do {
			
			contadorNulo = 0;
			
			contardorNegativos = 0;
			
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
				
				for (int i = 0; i < 100; i++) {
					
					System.out.println("-------------");
					System.out.print("Dame un numero: ");
					double numero = pedirDouble(pedido);
				
					
					if (numero == 0) {
						
						contadorNulo ++;
						
					} else if (numero < 0){
						
						contardorNegativos ++;

					}
					
					System.out.println("-------------");
					System.out.println("Cantidad de numeros dados: " + i);
					System.out.println("Numeros negativos: " + contardorNegativos);
					System.out.println("Numeros nulos: " + contadorNulo);

					
					
				}
				
			} else if (paso == 2){
				
				int numeroAleatorio;
				
				System.out.println("-------------");
				
				for (int i = 0; i < 100; i++) {
					
					numeroAleatorio = (int) ((Math.random()*200) - 100);	

					System.out.print( numeroAleatorio + ", ");
					
					if (numeroAleatorio == 0) {
						
						contadorNulo ++;
						
					} else if (numeroAleatorio < 0){
						
						contardorNegativos ++;

					}
					
					
				}
				
				System.out.println("\n-------------");
				System.out.println("Cantidad de numeros dados: 100");
				System.out.println("Numeros negativos: " + contardorNegativos);
				System.out.println("Numeros nulos: " + contadorNulo);
				
				contadorNulo = 0;
				
				contardorNegativos = 0;

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
