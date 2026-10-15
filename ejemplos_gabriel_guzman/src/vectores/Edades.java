/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2026
 */

package vectores;

import java.util.Iterator;
import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int[] edad;
		
		edad = new int[30];
		
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
		System.out.printf("La cantidad de edades por encima de la media eran: %d ",numeroEdadesEncimaMedia);		

		
	}

}
