/*
 * Descripción: Lusta de variables
 * Autor: Gabriel Guzmán
 * Fecha: 24/09/2026
 */

package operadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
	
		Scanner pedido = new Scanner(System.in);
		
		double numero = pedirNumero(pedido);
		double numero2 = pedirNumero(pedido);
		
		double numeroSuma = numero + numero2;
		double numeroResta = numero - numero2;
		double numeroDoble = numero * numero2;
		double numeroDivicios = numero / numero2;
		
		boolean mayorNum1aNum2 = numero > numero2;
		boolean menorNum1aNum2 = numero < numero2;
		boolean igualNum1aNum2 = numero == numero2;
		boolean menorIgualNum1aNum2 = menorNum1aNum2 || igualNum1aNum2;
		
		String resultado = verdaderoFalso(mayorNum1aNum2);
		
		
		System.out.println("-------------");
		System.out.println("El doble es: " + numeroDoble);
		System.out.println("La suma: " + numeroSuma);
		System.out.println("La resta: " + numeroResta);
		System.out.println("La divivion: " + numeroDivicios);
		System.out.println("-------------");
		System.out.println("El primer numero es mayor que el segundo: " + (resultado = verdaderoFalso(mayorNum1aNum2)));
		System.out.println("El primer numero es igual que el segundo: " + (resultado = verdaderoFalso(menorNum1aNum2)));
		System.out.println("El primer numero es menor que el segundo: " + (resultado = verdaderoFalso(igualNum1aNum2)));
		System.out.println("El primer numero es menor o igual que el segundo: " + (resultado = verdaderoFalso(menorIgualNum1aNum2)));

	}
	
	// sumar: pide un mumero al usuario (double)
	public static double pedirNumero(Scanner pedido) {
		
		
		double numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				System.out.println("-------------");
				System.out.print("Dame un numero: ");
				numero = pedido.nextDouble();
				
				error = false;
				
			    
			} catch (InputMismatchException e) {
				
				System.out.println("-----------------------");
				System.out.println("No me has dado un numero");
				System.out.println("-----------------------");
				
				error = true;
				
				pedido.nextLine();
				
			} 

		}while(error);
		
		 return numero;
	    
	}
	
	// verdaderoFalso: si es true te da un "Verdadero" si es false te da un "falso" (String)
	public static String verdaderoFalso(boolean resultado) {
		
		
		String vardaderoFalso = "";
		
		if(resultado){
			
			vardaderoFalso = "Verdadero";
			
		} else {
			
			vardaderoFalso = "Falso";
			
		}
		
		 return vardaderoFalso;
	    
	}

}
