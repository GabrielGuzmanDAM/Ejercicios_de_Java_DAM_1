/*
 * Descripción: Calcula el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
 * Autor: Gabriel Guzmán
 * Fecha: 05/10/2026
 */

package ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double SALARIO_HORA = 12;
		final double IRPF = 0.15;
		
		System.out.println("-------------");
		System.out.println("CALCULO DE SALARIO SEMANAL");
		System.out.println("-------------");
		System.out.print("Dame las horas trabajadas: ");
		int horasTrabajadas = pedirInt(pedido);
		
		double salarioSemanal = horasTrabajadas * SALARIO_HORA;
		double salarioMensual = salarioSemanal * 4;
		double salarioNetoSemanal = salarioSemanal - (salarioSemanal * IRPF);
		double salarioNetoMensual = salarioMensual - (salarioMensual * IRPF);
		
		System.out.println("-------------");
		System.out.printf("El salario semanal es: %.2f%n", salarioSemanal);
		System.out.printf("El salario mensual es: %.2f%n", salarioMensual);
		System.out.println("-------------");
		System.out.printf("El salario neto semanal es: %.2f%n", salarioNetoSemanal);
		System.out.printf("El salario neto mensual es: %.2f%n", salarioNetoMensual);

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
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}

}
