/*
 * Descripción: 
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package ejercicio13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		int numeroUsuario;
		
		int numeroMaquina;
		
		int numeroAnteriorMaquinaMayor = 100;
		
		int numeroAnteriorMaquinaMenor = 1;
		
		boolean fin = false;
		
		int contadorDetencion = 0;
		
		String respuesta;
		
		System.out.println("-------------");
		System.out.print("Dame un numero (1 - 100): ");
		numeroUsuario = pedirInt(pedido);
		
		numeroMaquina = (int)((Math.random()*99)+1);
		
		do {
			
			do {
				System.out.println("-------------");
				System.out.println("Numero de la maquina: " + numeroMaquina);
				System.out.println("-------------");
				System.out.print("(mayor , menor , igual): ");
				respuesta = pedido.next();
				
				if (respuesta.equals("mayor")) {
					
					fin = true;
					
				} else if (respuesta.equals("menor")) {
					
					fin = true;
					
				} else if (respuesta.equals("igual")){
					
					fin = true;

				} else {
					
					fin = false;
					
					System.out.println("-------------");
					System.out.println("No as dado una respuesta valida");
				}
				
			} while (!fin);
			
			fin = false;
			
			 if (numeroAnteriorMaquinaMenor == numeroAnteriorMaquinaMayor || contadorDetencion >= 10) {
					
				System.out.println("-------------");
				System.out.println("No as sequido las reglas de el juego se a llegado a una situalcion incoregible, se termina el juego");
				
				fin = true;
					
			} else if (numeroMaquina == numeroUsuario && respuesta.equals("igual")) {
				
				System.out.println("-------------");
				System.out.println("La maquina a ganado!, tu numero es:" + numeroMaquina);
				
				fin = true;
				
			} else if (numeroMaquina == numeroUsuario) {
				
				System.out.println("-------------");
				System.out.println("Tramposo!, tu numero es:" + numeroMaquina);
				
				fin = true;
				
			} else if (numeroMaquina != numeroUsuario && respuesta.equals("igual")) {
				
				System.out.println("-------------");
				System.out.println("Mentiroso!, no es el mismo numero");
				
			}else if (numeroMaquina != numeroUsuario && respuesta.equals("mayor")) {
				
				numeroAnteriorMaquinaMayor = numeroMaquina;
				
				numeroMaquina = (int)((Math.random()*(numeroAnteriorMaquinaMayor - numeroAnteriorMaquinaMenor)) + numeroAnteriorMaquinaMenor);
				
				
			} else if (numeroMaquina != numeroUsuario && respuesta.equals("menor")){	
				
				numeroAnteriorMaquinaMenor = numeroMaquina;
				
				numeroMaquina = (int)((Math.random()*(numeroAnteriorMaquinaMayor - numeroAnteriorMaquinaMenor)) + numeroAnteriorMaquinaMenor);

				contadorDetencion ++;
			}
			
		} while (!fin);

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
			
			if (numero < 0 || numero > 100) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
