/*
 * Descripción: Dise cuantos numeros negativos y pocitivos se an dado
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package ejercicio09;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		int suma = 0;
		
		int multiplicacion = 0;
		
		System.out.println("-------------");
		System.out.println("TABLAS DE SUMA");
		System.out.println("-------------");
		
		for (int i = 0; i <= 10; i++) {
			
			
			System.out.println("Tabla de suma de " + i);
			System.out.println("-------------");
			
			for (int j = 0; j <= 10; j++) {
				
				suma = i + j;
				
				System.out.printf("%d + %d = %d \n" , i , j , suma);
				
			}
			
			System.out.println("-------------");
			
		}
		
		System.out.println("-------------");
		System.out.println("TABLAS DE MULTIPLICACION");
		System.out.println("-------------");
		
		for (int i = 0; i <= 10; i++) {
			
			
			System.out.println("Tabla de multiplicación de " + i);
			System.out.println("-------------");
			
			for (int j = 0; j <= 10; j++) {
				
				multiplicacion = i * j;
				
				System.out.printf("%d * %d = %d \n" , i , j , multiplicacion);
				
			}
			
			System.out.println("-------------");
			
		}
		

		
	}

}
