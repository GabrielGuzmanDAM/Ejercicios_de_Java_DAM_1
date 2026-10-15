/*
 * Descripción: alcular el resultado de la nota del usuario
 * Autor: Gabriel Guzmán
 * Fecha: 15/10/2026
 */
package ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame tu nombre: ");
		String nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tun apellido: ");
		String apellido = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame el nombre del ciclo formativo: ");
		String cicloFormativo = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tu nota del ciclo formativo: ");
		int notaAcademica = pedirInt(pedido);
		
		String notaResultado;
		
		switch (notaAcademica) {
	    case  0 , 1, 2, 3, 4:
	    	notaResultado = "Insuficiente";
	        break;
	    case 5:
	    	notaResultado = "Aprobado";
	        break;
	        
	    case 6, 7:
	    	notaResultado = "Bien";
	        break;
	        
	    case 8, 9:
	    	notaResultado = "Notable";
	        break;
	        
	    default:
	    	notaResultado = "Sobresaliente";
	}
		
		
		
		System.out.println("-------------");
		System.out.printf("Nombre: %s \n" , nombre);
		System.out.printf("Apellidos: %s \n" , apellido);	
		System.out.printf("Ciclo Formativo: %s \n" , cicloFormativo);	
		System.out.printf("Nota académica: %d (%s) \n" , notaAcademica , notaResultado);	
		
		if (notaResultado == "Sobresaliente") {
			
			System.out.println("Matrícula de Honor");

			
		}

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
			
			if (numero < 0 || numero > 10) {
				System.out.println("La nota académica indicada es incorrecta, buelvela a poner:");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
