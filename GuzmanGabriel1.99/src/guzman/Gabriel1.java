/*
 * Descripción: Calcula la nómina del usuario
 * Autor: Gabriel Guzmán
 * Fecha: 26/10/2026
 */

package guzman;

import java.util.Scanner;

public class Gabriel1 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		//------------------------------------
		// Variables y contantes
		
		final double PORCENTAJE = 100;
		final int COSTE_TRASPORTE = 100;
		final double ANTIGUEDAD_AUMENTO = 2;
		final double IRPF_10 = 10;
		final double IRPF_15 = 15;
		final double IRPF_20 = 20;
		
		
		String nombre;
		int salarioBase;
		boolean trasporte;
		int antiguedad;
		double complementoAntiguedad = 0;
		
		boolean sueldoBalido = true;
		
		double salarioBruto;
		double retencion = 0;
		double salarioNeto;
		
		//------------------------------------
		// peticion de datos
		
		System.out.println("-------------");
		System.out.print("Dame tu nombre: ");
		nombre = pedido.nextLine();
		
		do {
			
			sueldoBalido = true;
			
			System.out.println("-------------");
			System.out.print("Dame tu salario base: ");
			salarioBase = pedido.nextInt();
			
			if (salarioBase <= 0) {
				
				System.out.println("-------------");
				System.out.println("El salario base no puede ser menor de 0");
				System.out.println("-------------");
				
				sueldoBalido = false;
				
			}
			
			
		} while (!sueldoBalido);
		
		
		System.out.println("-------------");
		System.out.print("Tienes el complemento de trasporte?: ");
		trasporte = pedido.nextBoolean();
		
		System.out.println("-------------");
		System.out.print("Dime tu antiguedad en la empresa: ");
		antiguedad = pedido.nextInt();
		
		//------------------------------------
		// calculo del salario bruto
		
		salarioBruto = salarioBase;
		
		if (trasporte) {
			
			salarioBruto += COSTE_TRASPORTE;
			
		}
		
		for (int i = 3; i <= antiguedad; i++) {
			
			salarioBruto += (salarioBase* (ANTIGUEDAD_AUMENTO/PORCENTAJE));
			
			complementoAntiguedad += salarioBase* (ANTIGUEDAD_AUMENTO/PORCENTAJE);
			
			i++;
			i++;
			
		}
		
		//------------------------------------
		//

		if (salarioBase < 1000) {
			
			retencion = salarioBruto * (IRPF_10/PORCENTAJE);
			
		} else if (salarioBase < 2000 || salarioBase == 1000) {
			
			retencion = salarioBruto *(IRPF_15/PORCENTAJE);
			
		} else {
			
			retencion = salarioBruto *(IRPF_20/PORCENTAJE);

		}
		
		//------------------------------------
		
		salarioNeto = salarioBruto - retencion;
		
		//------------------------------------
		
		System.out.println("-------------");
		System.out.println("RESULTADOS DE NÓMINA");
		System.out.println("-------------");
		System.out.println("Nombre:" + nombre);
		System.out.println("Sueldo base: " + salarioBase);
		
		if (trasporte) {
			
			System.out.println("Complemento trasporte: " + COSTE_TRASPORTE );
			
		}

		System.out.println("complemente antiguedad: " + complementoAntiguedad);
		System.out.println("Sueldo bruto: " + salarioBruto);
		
		if (salarioBase < 1000) {
			
			System.out.println("Porcentaje IRPF: " + IRPF_10);
			
		} else if (salarioBase < 2000) {
			
			System.out.println("Porcentaje IRPF: " + IRPF_15);
			
		} else {
			
			System.out.println("Porcentaje IRPF: " + IRPF_20);

		}
		

		System.out.println("Total retenciones: " + retencion);
		System.out.println("Sueldo neto: " + salarioNeto);
		System.out.println("-------------");
			
	}

}
