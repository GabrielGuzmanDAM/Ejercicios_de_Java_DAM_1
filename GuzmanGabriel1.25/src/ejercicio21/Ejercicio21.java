/*
 * Descripción: le pide al usuario la nota yla media que quiere sacar, calcula la nota del siquiente examen para consequir esa media
 * Autor: Gabriel Guzmán
 * Fecha: 07/10/2026
 */

/*
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la
nota del primer examen cuenta el 40% y la del segundo examen un 60%.
 */

package ejercicio21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double PRCENTAJE_PRIMERA_NOTA = 0.4;
		final double PRCENTAJE_SEGUNDO_NOTA = 0.6;
		
		int nota;
		
		int notaFinal;
		
		double notaPrimerExamen;
		
		double notaSegundoExamen = 0;
		
		System.out.println("--------------------");
		System.out.println("calculo de nota");
		System.out.println("--------------------");
		System.out.print("Nota del primer examen: ");
		nota = pedirInt(pedido);
		
		notaPrimerExamen = nota * PRCENTAJE_PRIMERA_NOTA;
		
		System.out.println("--------------------");
		System.out.print("Cual es la nota final que quieres: ");
		notaFinal = pedirInt(pedido);
		
		for (double i = 0.1; (i * PRCENTAJE_SEGUNDO_NOTA) + notaPrimerExamen <= notaFinal; i += 0.1 ) {
			
			
			
			notaSegundoExamen = i;
			
		}
		
		if (notaSegundoExamen > 10) {
			
			System.out.println("--------------------");
			System.out.printf("incluso si la nota es 10 no llegarias a la media deseada");
			
		} else {
			
			System.out.println("--------------------");
			System.out.printf("La nota que nesesitas en el segundo examen es: %.1f ", notaSegundoExamen);
			
		}


	}
	
	//pedirInt: pide un int al usuario, en este caso negamos los negativos (int)
	public static int  pedirInt(Scanner pedido) {
		
		int  numero = 0;
		
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
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
