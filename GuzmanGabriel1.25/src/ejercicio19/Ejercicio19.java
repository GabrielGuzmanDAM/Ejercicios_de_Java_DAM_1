/*
 * Descripción: convertir segundos a años, meses, dias, horas, minutos, segundos
 * Autor: Gabriel Guzmán
 * Fecha: 08/10/2026
 */

package ejercicio19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		long  t = 0;
		
		System.out.println("--------------------");
		System.out.println("La cobercion en horas, minutos y segundos");
		System.out.println("--------------------");
		System.out.print("Tiempo en segundos: ");
		t = pedirInt(pedido);
		
		long anos = t / 31536000;
		long meses = (t % 31536000) / 2592000;
		long dias = (t % 2592000) / 86400;
		long horas = (t % 86400) / 3600;
		long minutos = (t % 3600) / 60;
		long segundosRestantes = t % 60;
		
		String tiempo;
		
		if (t >= 86400) {
			
			if (t >= 2592000) {
				
				if (t >= 31536000) {
					
					 tiempo = String.valueOf(anos) + ":" + String.valueOf(meses) + ":" + String.valueOf(dias) +  String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundosRestantes);
					
					
				} else {
					
					 tiempo = String.valueOf(meses) + ":" + String.valueOf(dias) + ":" + String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundosRestantes);
					
				}	
			} else {
				
				 tiempo = String.valueOf(dias) + ":" + String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundosRestantes);

				
			}
			
		} else {
			
			 tiempo = String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundosRestantes);

		}

		System.out.println("--------------------");
		System.out.printf("\"Tiempo (años:meses:dias:horas:minutos:segundos): %s \n", tiempo);

	}
	
	//pedirInt: pide un int al usuario, en este caso negamos los negativos (int)
	public static long  pedirInt(Scanner pedido) {
		
		long  numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextLong();
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
