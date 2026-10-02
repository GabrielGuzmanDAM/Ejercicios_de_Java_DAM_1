/*
 * Descripción: vista de un horario de clases en una matriz bidimensional
 * Autor: Gabriel Guzmán
 * Fecha: 01/10/2026
 */

package ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		String[][] horario = {
				{"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"},
				{"-------", "-------", "Optativa GS", "Inglés Profesional", "Desarrollo de interfaces"},
				{"Programacion", "-------", "Optativa GS", "Inglés Profesional", "Desarrollo de interfaces"},
				{"Programacion", "Sistemas de gestión empresarial", "-------", "-------", "Desarrollo de interfaces"},
				{"Desarrollo de interfaces", "Sistemas de gestión empresarial", "-------", "-------", "Optativa GS"},
				{"Desarrollo de interfaces", "Sistemas de gestión empresarial", "Programacion", "Programacion", "Programacion"},
				{"Desarrollo de interfaces", "Sistemas de gestión empresarial", "Programacion", "Programacion", "Programacion"}
		};
		
		System.out.println("Horario de clase:");
		System.out.println("------------------------------------------------------------");
		
		for (int i = 0; i < horario.length; i++) {
			for (int j = 0; j < horario[i].length; j++) {
				System.out.printf("| %-31s " , horario[i][j]);
			}
			System.out.println("|");

		}
		
		System.out.println("-------------------------------------------------------------");
		

	}

}
