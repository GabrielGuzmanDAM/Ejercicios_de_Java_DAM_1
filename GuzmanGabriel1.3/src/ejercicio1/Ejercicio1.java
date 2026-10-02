/*
 * Descripción: Reune los datos de usuario y calcula su salario bruto y neto, además de calcular el aumento por años trabajados
 * Autor: Gabriel Guzmán
 * Fecha: 30/09/2026
 */

package ejercicio1;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner pedido = new Scanner(System.in);
		
		final double IRPF = 0.15;
		final double AUMENTO_ANUAL = 0.02;
		
		System.out.println("-------------");
		System.out.print("Dame un nombre: ");
		String nombre = pedirString(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un apellido: ");
		String apellido = pedirString(pedido);
		
		System.out.println("-------------");
		System.out.print("Fecha de nacimiento: ");
		
		LocalDate fechaNacimiento = pedirLocalDate(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame un salario bruto: ");
		double salarioBruto = pedirDouble(pedido);
		
		System.out.println("-------------");
		System.out.print("Dame los años trabajando en la empresa: ");
		int anosTrabajando = pedirInt(pedido);
		
		double salarioNeto = salarioBruto - (salarioBruto * IRPF);
		
		double aumento = salarioBruto * AUMENTO_ANUAL * anosTrabajando;
		
		double salarioTotal = salarioNeto + aumento;
		
		System.out.println("-------------");
		System.out.println("DATOS");
		System.out.println("-------------");
		System.out.printf("Estimad@ %s %s, su salario bruto es %.2f, teniendo en cuenta un IRPF del 15%% su salario neto es %.2f.%n", nombre, apellido, salarioBruto, salarioNeto);
		System.out.printf("Debido a sus %d años trabajando en la empresa su salario se incrementará en un 2%% por cada año. El aumento es de %.2f y el salario total es %.2f.%n", anosTrabajando, aumento, salarioTotal);
	}
	
	//pedirString: pide un String al usuario (String)
	public static String pedirString(Scanner pedido) {
		
		return pedido.nextLine();
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
			
			if (numero < 0 && !error) {
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
			
			if (numero < 0 && !error) {
				System.out.println("Error: Debe de introducir un numero entero positivo");
				error = true;
			}
			
		} while (error);
		
		return numero;
	}
	
	//pedirLocalDate: pide un LocalDate al usuario, con el formato DD/MM/YYYY (LocalDate)
	public static LocalDate pedirLocalDate(Scanner pedido) {
		
		LocalDate fecha = null;
		
		boolean error = false;
		
		do {
			
			try {
				
				String fechaString = pedido.nextLine();
				String[] partes = fechaString.split("/");
				int dia = Integer.parseInt(partes[0]);
				int mes = Integer.parseInt(partes[1]);
				int anio = Integer.parseInt(partes[2]);
				fecha = LocalDate.of(anio, mes, dia);
				error = false;
				
			} catch (NumberFormatException e) {
				System.out.println("Error: Debe de introducir una fecha en el formato DD/MM/YYYY");
				error = true;
			}
			
			// la fecha no puede ser mas antigua de 1900 ni mas reciente que la fecha actual
			if (fecha != null && (fecha.isBefore(LocalDate.of(1900, 1, 1)) || fecha.isAfter(LocalDate.now()))) {
				System.out.println("Error: La fecha debe de ser posterior a 01/01/1900 y anterior a la fecha actual");
				error = true;
			}
			
		} while (error);
		
		return fecha;
	}

}
