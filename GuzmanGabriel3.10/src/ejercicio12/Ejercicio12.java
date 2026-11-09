/*
 * Descripción: crear un menu donde la gente pueda ver y rellenar un Array de 10 numeros enteros.
 * Autor: Gabriel Guzmán
 * Fecha: 06/11/2026
 */

package ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		boolean fin = false;
		
		char opcion;
		
		int[] numeros = new int[10];
		
		int numeroV = 0;
		int numeroP = 0;
		
		do {
			
			System.out.println("-------------");
			System.out.println("a. Mostrar valores.");
			System.out.println("b. Cambiar valores.");
			System.out.println("c. Salir.");
		
			System.out.println("-------------");
			System.out.print("Elige una opcion: ");
			opcion = pedido.next().charAt(0);
				
				switch (opcion) {
					case 'a' , 'A':
						System.out.println("-------------");
						for (int i = 0; i < numeros.length; i++) {
							System.out.print(numeros[i] + ", ");
						}
						System.out.println("\n");
						break;
					case 'b' , 'B':
						System.out.println("-------------");
						System.out.print("Dame un numero entero: ");
						numeroV = pedirInt(pedido);

						 do {
							 
							 fin = true;
							 
							 System.out.println("-------------");
							System.out.print("Dame un numero pocicion (1-10): ");
							numeroP = pedirInt(pedido);
							
							if (numeroP < 1 || numeroP > 10) {
								
								fin = false;
								 System.out.println("-------------");
								System.out.println("No es valido");
								
								
							}
							
						} while (!fin);
						 
						fin = false;
						
						numeros[numeroP -1] = numeroV;
						 
						break;
					case 'c' , 'C':
						System.out.println("-------------");
						System.out.println("fin de la ejecucion");
						
						fin = true;
						break;
					default:
						System.out.println("-------------");
						System.out.println("Opcion no valida.");
						break;
				}
			
		} while (!fin);

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
