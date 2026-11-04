/*
 * Descripción: pide un texto al usuario y devuelve el texto saltando una letra cada ves, si pones FIN o fin deja de pedir texto
 * Autor: Gabriel Guzmán
 * Fecha: 04/11/2026
 */

package cadenas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperCadenas {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);

		String texto = "";
		
		do {
			
			System.out.println("-------------");
			System.out.print("Dame un texto: ");
			texto = pedido.nextLine();
			
			if (!texto.equalsIgnoreCase("fin")) {
				String textoSaltado = saltarLetras(texto);
				System.out.println("Texto saltando letras: " + textoSaltado);
			}
			
		} while (!texto.equalsIgnoreCase("fin"));
		
		System.out.println("Programa finalizado.");
		
		
		//pide un texto al usuario, pide la pocicion inicial y final, devuelve el tecto en esas franja de pociciones
		
		do {
			
			System.out.println("-------------");
			System.out.print("Dame un texto: ");
			texto = pedido.nextLine();
			
			if (!texto.equalsIgnoreCase("fin")) {
				System.out.print("Dame la pocicion inicial: ");
				int inicio = pedirInt(pedido);
				
				System.out.print("Dame la pocicion final: ");
				int fin = pedirInt(pedido);
				
				String subTexto = texto.substring(inicio, fin);
				System.out.println("Subtexto: " + subTexto);
			}
			
		} while (!texto.equalsIgnoreCase("fin"));
		
		//pide el nombre, el apellidos y su DNI y devuelve un texto con la primera letra del nombre tres de los dos apellidos y los tres primeros numeros del DNI
		
		do {
			
			System.out.println("-------------");
			System.out.print("Dame un nombre: ");
			String nombre = pedido.nextLine();
			
			if (!nombre.equalsIgnoreCase("fin")) {
				System.out.print("Dame un apellido: ");
				String apellidos = pedido.nextLine();
				
				String segundoApellido = apellidos.substring(apellidos.indexOf(" ") + 1);
				
				System.out.print("Dame tu DNI: ");
				String dni = pedido.nextLine();
				
				//las letas en minuscula
				String resultado = Character.toLowerCase(nombre.charAt(0)) + "" + apellidos.substring(0, 3).toLowerCase() + "" + segundoApellido.substring(0,3).toLowerCase() + "" + dni.substring(0, 3);
				
				System.out.println("Resultado: " + resultado);
			}
			
		} while (!texto.equalsIgnoreCase("fin"));
	}
	
	//saltarLetras: devuelve un texto saltando una letra cada ves (String)
	public static String saltarLetras(String texto) {
		
		StringBuilder resultado = new StringBuilder();
		
		for (int i = 0; i < texto.length(); i += 2) {
			resultado.append(texto.charAt(i));
		}
		
		return resultado.toString();
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
