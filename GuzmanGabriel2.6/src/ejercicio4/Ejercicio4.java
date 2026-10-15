/*
 * Descripción: Calcilar la media de los importes del usuario y decirle si a complido el requicito para el descuento
 * Autor: Gabriel Guzmán
 * Fecha: 14/10/2026
 */

package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.print("Dame tu nombre: ");
		String nombre = pedido.nextLine();
		
		System.out.println("-------------");
		System.out.print("Dame tun apellido: ");
		String apellido = pedido.nextLine();
		
		int elegir = 0;
		
		boolean fin = false;
		
		double importe;
		
		double sumaImporte = 0;
		
		int contador = 1;
		
		double mediaImportes;
		
		do {
			System.out.println("-------------");
			System.out.println("IMPORTES DEL ULTIMO MES");
			System.out.println("-------------");
			System.out.println("1. Agregar inporte: ");
			System.out.println("0. fin.");
			System.out.println("-------------");
			System.out.print("Numero: ");
			elegir = pedirInt(pedido);
			
			if (elegir == 1){
				
				System.out.println("-------------");
				System.out.printf("Inporte numero %d : " , contador);
				importe = pedirDouble(pedido);
				
				sumaImporte += importe;
				
				contador ++;
			
			} else if (elegir == 0) {
				
				fin = true;
				
			}
			
			
		}while (!fin);
		
		mediaImportes = sumaImporte / contador;
		
		System.out.println("-------------");
		System.out.printf("Importe medio: %.2f \n" , mediaImportes);
		
		if (mediaImportes >= 300) {
			
			System.out.println("Felicidades, a recivido un cupon de 50 euros");
			
		} else {
			
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
			
		}

	}
	
	//pedirDouble: pide un double al usuario, en este caso negamos los negativos (double)
	public static double pedirDouble(Scanner pedido) {
		
		double numero = 0;
		
		boolean error = false;
		
		do {
			
			try {
				
				numero = pedido.nextDouble();
				error = false;
				
			} catch (InputMismatchException  e) {
				System.out.println("Error: Debe de introducir un numero");
				pedido.nextLine();
				error = true;
			}
			
			if (numero < 0 ) {
				System.out.println("Error: Debe de introducir un numero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
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
			
			if (numero < 0 || numero > 1) {
				System.out.println("Error: Debe de introducir un numero no es valido");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
