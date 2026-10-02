/*
 * Descripción: Lusta de variables
 * Autor: Gabriel Guzmán
 * Fecha: 23/09/2026
 */

package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Variables {
	
public static void main(String[] args) {
		
	Scanner pedido = new Scanner(System.in);
			
		byte numeroPequeno = 127;
		short numeroMediano = 32767;
		int numeroNormal = 1111111111;
		long numeroGande = 1111111111;
				
		float decimalPequeno = 1.1f;
		double decimalNormal = 1111111111.1111111;
				
		char unCaracter = 'u';
		String unTexto = "hola, mundo";

		boolean verdadFalso = true ;
		
		System.out.println("-------------");
		System.out.println("byte: " + numeroPequeno);
		System.out.println("short: " + numeroMediano);
		System.out.println("int: " + numeroNormal);
		System.out.println("double: " + numeroGande);
		System.out.println("-------------");
		System.out.println("float: " + decimalPequeno);
		System.out.println("double: " + decimalNormal);
		System.out.println("-------------");
		System.out.println("char: " + unCaracter);
		System.out.println("String: " + unTexto);
		System.out.println("-------------");
		System.out.println("boolean: " + verdadFalso);


	}

}
