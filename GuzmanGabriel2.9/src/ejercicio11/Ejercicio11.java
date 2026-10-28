/*
 * Descripción: Suma los pares y inpares entre 100 y 200
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int sumaPares = 0;
		int sumaInpares = 0;
	
		for (int i = 101; i < 200; i++) {
			
			if (i %2 == 0) {
				
				sumaPares += i;
				
			} else {
				
				sumaInpares += i;

			}
			
			System.out.println("-------------");
			System.out.println("Suma numeros pares: " + sumaPares);
			System.out.println("Suma numeros inpares: " + sumaInpares);
			
		}

	}
	
	

}
