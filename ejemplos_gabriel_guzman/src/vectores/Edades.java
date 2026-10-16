/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2026
 */

package vectores;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int[] edad;
		
		edad = new int[1000];
		
		int suma = 0;
		
		double media;
		
		for (int i=0; i < edad.length; i++) {
			edad[i] = (int) (Math.random()*99)+1;
			
			suma += edad[i];
			
		}
		
		media = suma / edad.length;
		System.out.println("-------------");
		for (int i = 0; i < edad.length; i++) {
			System.out.printf("En la pocicion %d la edad es %d \n", i, edad[i]);
		}
		System.out.println("-------------");
		System.out.printf("La media de las edades es: %.2f \n", media);
		
		int numeroEdadesEncimaMedia = 0;
		System.out.println("-------------");
		for (int i = 0; i < edad.length; i++) {
			
			if (media > edad[i]) {
				
				
				System.out.printf("En la pocicion %d la edad es %d es menor que la media\n", i, edad[i]);		
			} else {
				numeroEdadesEncimaMedia ++;
			}

		}
		
		System.out.println("-------------");
		System.out.printf("La cantidad de edades por encima de la media eran: %d \n",numeroEdadesEncimaMedia);		
		
		int edadPedida;
		
		int pasos = 0;
		
		boolean fin = false;
		
		int contador = 0;
		
		System.out.println("-------------");
		System.out.printf("Dame la edad que quieres buscar: ");
		edadPedida = pedirInt(pedido);
		
		do {
			
			if (edadPedida == edad[pasos]) {
				if (contador == 3) {
					
					System.out.println("-------------");
					System.out.printf("En la pocición %d esta la edad que se busca %d \n", pasos, edad[pasos]);	
					
					 fin = true;
					
				}
				
				contador ++;
				

				
			} else if (pasos == edad.length - 1){
				
				System.out.println("-------------");
				System.out.printf("No esta la edad que se busca");	
				
				 fin = true;
			} 
			
			pasos ++;
			
			
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
			
			if (numero < 0) {
				System.out.println("Error: Debe de introducir un numero no es valido");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
