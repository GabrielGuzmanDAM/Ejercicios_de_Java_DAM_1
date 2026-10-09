/*
 * Descripción: un programa que te da la convercion de una cantidad de euros a billetes y monedas
 * Autor: Gabriel Guzmán
 * Fecha: 07/10/2026
 */

/*
 * Realiza un programa en Java que dado un importe en euros, nos indique el mínimo
número de billetes y la cantidad en monedas sobrante que se pueden utilizar para obtener
dicha cantidad.
 */

package ejercicio20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		long  euros = 0;
		
		System.out.println("--------------------");
		System.out.println("euros");
		System.out.println("--------------------");
		System.out.print("Tiempo en segundos: ");
		euros = pedirInt(pedido);
		
		long resto = euros;
		
		long billete500 = resto / 500;
		resto %= 500;

		long billete200 = resto / 200;
		resto %= 200;

		long billete100 = resto / 100;
		resto %= 100;

		long billete50 = resto / 50;
		resto %= 50;

		long billete20 = resto / 20;
		resto %= 20;

		long billete10 = resto / 10;
		resto %= 10;

		long billete5 = resto / 5;
		resto %= 5;

		long moneda2 = resto / 2;
		resto %= 2;

		long moneda1 = resto;
			
		System.out.println("--------------------");
		System.out.println("Billetes de 500 €: " + billete500);
		System.out.println("Billetes de 200 €: " + billete200);
		System.out.println("Billetes de 100 €: " + billete100);
		System.out.println("Billetes de 50 €: " + billete50);
		System.out.println("Billetes de 20 €: " + billete20);
		System.out.println("Billetes de 10 €: " + billete10);
		System.out.println("Billetes de 5 €: " + billete5);
		System.out.println("Monedas de 2 €: " + moneda2);
		System.out.println("Monedas de 1 €: " + moneda1);

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
