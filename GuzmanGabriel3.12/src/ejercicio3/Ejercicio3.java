/*
 * Descripción: crea un codigo con el nombre y los apellidos del usuario
 * Autor: Gabriel Guzmán
 * Fecha: 19/11/2026
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame tu nombre: ");
		String nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tu primer apellido: ");
		String apellido1 = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tu segundo apellido: ");
		String apellido2 = pedido.nextLine();
		
		String parte1 = nombre.substring(0, 3);
		String parte2 = apellido1.substring(0, 3);
		String parte3 = apellido2.substring(0, 3);
		
		String codigo = parte1.concat(parte2);
		
		codigo = codigo.concat(parte3);
		
		codigo = codigo.toUpperCase();
		
		System.out.println("-------------");
		System.out.println("Codigo: " + codigo);

	}

}
