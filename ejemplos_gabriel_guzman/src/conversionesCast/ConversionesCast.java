/*
 * Descripción: Lusta de variables
 * Autor: Gabriel Guzmán
 * Fecha: 24/09/2026
 */

package conversionesCast;

import java.util.Scanner;

public class ConversionesCast {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		int numero1 = 13;
		int numero2 = 72;
		
		double decimal1 = 13.69;
		double decimal2 = 69.13;
		
		
		// 1.
		
		System.out.println("-------------");
		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);
		System.out.println("Decimal 1: " + decimal1);
		System.out.println("Decimal 2: " + decimal2);
		
		// 2.
		
		int suma = numero1 + numero2 ;
		
		System.out.println("-------------");
		System.out.println("Suma: " + suma);
		
		
		// 3.
		
		int reta = numero1 - numero2 ;
		
		System.out.println("-------------");
		System.out.println("Resta: " + reta);
		
		// 4.
		
		int multiplicador = numero1 * numero2 ;
		
		System.out.println("-------------");
		System.out.println("Multiplicacion: " + multiplicador);		
		
		// 5.
		
		double divicion = (double) numero2 / numero1 ;
		
		System.out.println("-------------");
		System.out.println("Divicion: " + divicion);	
		
		// 6.
		
		double resto = (double) numero2 % numero1 ;
		
		System.out.println("-------------");
		System.out.println("Resto: " + resto);	
		
		// 7.
		
		double sumaDecimal = decimal1 + decimal2;
		
		System.out.println("-------------");
		System.out.println("Suma: " + sumaDecimal);
		
		// 8.
		
		int decimalRoto1 = (int) decimal1;
		
		int decimalRoto2 = (int) decimal2;
		
		System.out.println("-------------");
		System.out.println("Decimal roto 1: " + decimalRoto1);
		System.out.println("Decimal roto 2: " + decimalRoto2);
		
		// 9.
		
		double multiplicadorDecimal = decimal1 * decimal2 ;
		
		System.out.println("-------------");
		System.out.println("Multiplicacion: " + multiplicadorDecimal);		
		
		// 10.
		
		double DivicionDecimal = decimal1 / decimal2 ;
		
		System.out.println("-------------");
		System.out.println("Divicion: " + DivicionDecimal);	
		
		
		// 12.
		
		
		System.out.println("-------------");
		System.out.println("Numero 1: " + numero1 * 2);
		System.out.println("Numero 2: " + numero2 * 2);
		System.out.println("Decimal 1: " + decimal1 * 2);
		System.out.println("Decimal 2: " + decimal2 * 2);
		
		// 13.
		
		double sumaTotal = numero1 + numero2 +  decimal1 + decimal2;
		
		System.out.println("-------------");
		System.out.println("Suma todo: " + sumaTotal);
		
		// 14.
		
		double multiplicadorTodo = numero1 * numero2 * decimal1 * decimal2;
		
		System.out.println("-------------");
		System.out.println("Multiplicacion de todo: " + multiplicadorTodo);
		
	}

}
