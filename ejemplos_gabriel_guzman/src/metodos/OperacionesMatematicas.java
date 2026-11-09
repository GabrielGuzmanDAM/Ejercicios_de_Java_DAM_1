/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 09/11/2026
 */

package metodos;

import java.util.Scanner;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int resultadoSuma = suma(3,5);
		
		int resultadoSuma2 = suma(3,5,8);
		
		System.out.print("La suma es: " + resultadoSuma);
		System.out.print("La suma es: " + resultadoSuma2);

	}
	
	//suma: suma dos numeros. (int)
	public static int suma (int numero1 , int numero2) {
		
		int suma = numero1 + numero2;
		
		return suma;
		
	}
	
	//suma: suma tres numeros. (int)
	public static int suma (int numero1 , int numero2 , int numero3) {
		
		int suma1 = suma(numero1,numero2);
		
		int suma2 = suma(suma1,numero3);
		
		return suma2;
		
	}

}
