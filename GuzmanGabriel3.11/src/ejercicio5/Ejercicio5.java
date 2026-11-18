/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 18/11/2026
 */

package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final int SEXO_SALARIO = 2;
		
		int empleado;
		
		int sexo;
		int salario;
		
		System.out.println("-------------");
		System.out.print("El numero de empleados: ");
		empleado = pedirInt(pedido);
		
		boolean fin; 
		
		int empleados[][] = new int [empleado][SEXO_SALARIO];
		
		for (int i = 0; i < empleado; i++) {
			
			fin = false;
			
			for (int j = 0; j < SEXO_SALARIO; j++) {
				
				if ((j + 1) % 2 != 0) {
					
					do {
						
						System.out.println("-------------");
						System.out.print("El sexo del empleado " + (i + 1) + "(Hombre = 0 | Mujer = 1): ");
						sexo = pedirInt(pedido);
						
						if (sexo == 0 || sexo == 1) {
							
							fin = true;
							
							empleados[i][j] = sexo;
							
						} else {
							
							System.out.println("No es valido (0-1)");
							
						}
						
					} while (!fin);
					
				} else {
					
					System.out.println("-------------");
					System.out.print("El salario del empleado " + (i + 1) + ": ");
					salario = pedirInt(pedido);
					
					empleados[i][j] = salario;

				}
						
			}
			
		}
		
		int sumaHombre = 0;
		int sumaMujeres = 0;
		
		double mediaMujeres = 0;
		double mediaHombres = 0;
		
		double contadorMujeres = 0;
		double contadorHombres = 0;
		
		for (int i = 0; i < empleado; i++) {
			
			System.out.print("Empleado " + (i + 1) + ": ");

			
			for (int j = 0; j < SEXO_SALARIO; j++) {
				
				System.out.print(" " + empleados[i][j] + "  | ");
				
				if (empleados[i][j] == 0 && (j + 1) % 2 != 0) {
					
					sumaHombre += empleados[i][j + 1];
					
					contadorHombres ++;
					
				} else if (empleados[i][j] == 1 && (j + 1) % 2 != 0){
					
					sumaMujeres += empleados[i][j + 1];
					
					contadorMujeres ++;

				}
				
			}
			
			System.out.print("\n");
			
		}
		
		mediaMujeres = sumaMujeres / contadorMujeres;
		mediaHombres = sumaHombre / contadorHombres;
		
		System.out.println("-------------");
		System.out.printf("El salario medio de los hombres es: %.2f \n" + mediaHombres);
		System.out.printf("El salario medio de las mujeres es: %.2f \n" + mediaMujeres);

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
