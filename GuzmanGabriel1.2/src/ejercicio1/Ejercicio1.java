/*
 * Descripción: Pude los datos del usuario y los muestra por pantallar
 * Autor: Gabriel Guzmán
 * Fecha: 28/09/2026
 */

package ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame un nombre: ");
		String nombre = pedirString(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un apellido: ");
		String apellido = pedirString(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un edad: ");
		byte edad = pedirByte(pedido);
		
		pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame un direccion: ");
		String direccion = pedirString(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un altura: ");
		float altura = pedirFloat(pedido);
		
		System.out.println("-------------");
		System.out.println("DATOS");
		System.out.println("-------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println("Direción: " + direccion);
		System.out.println("Altura: " + altura);



	}

//pedirString: pide un String al usuario (String)
public static String pedirString(Scanner pedido) {
	
	String nombre = "";	

	nombre = pedido.nextLine();		
	
	 return nombre;
    
}

//pedirEdad: pide un byte al usuario (byte)
public static byte pedirByte(Scanner pedido) {
	
	byte edad = 18;
	
	boolean error = false;
	
	do {
		
		try {
	
			edad = pedido.nextByte();
			
			error = false;
			
		    
		} catch (InputMismatchException e) {
			
			System.out.println("-------------------------------------------------");
			System.out.println("No me has dado un dato balido, vuelve a escribir:");
			System.out.println("-------------------------------------------------");
			
			error = true;
			
			pedido.nextLine();
			
		} 

	}while(error);
	
	 return edad;
    
}

//pedirAltura: pide un froat al usuario (float)
public static float pedirFloat(Scanner pedido) {
	
	float altura = 1.6f;
	
	boolean error = false;
	
	do {
		
		try {
			
			altura = pedido.nextByte();
			
			error = false;
			
		    
		} catch (InputMismatchException e) {
			
			System.out.println("-------------------------------------------------");
			System.out.println("No me has dado un dato balido, vuelve a escribir:");
			System.out.println("-------------------------------------------------");
			
			error = true;
			
			pedido.nextLine();
			
		} 

	}while(error);
	
	 return altura;
    
}

}
