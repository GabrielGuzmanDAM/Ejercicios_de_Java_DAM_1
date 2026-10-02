/*
 * Descripción: Inicializar variables y mostrarlos por pantalla
 * Autor: Gabriel Guzmán
 * Fecha: 28/09/2026
 */

package ejercicio4;

public class Ejercicio4 {
	
	public enum Tamannos {PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE};
	
	public static void main(String[] args) {
		
		Tamannos pequenno = Tamannos.PEQUEÑA;
		Tamannos media = Tamannos.MEDIANA;
		Tamannos grande = Tamannos.GRANDE;
		Tamannos extragrande = Tamannos.EXTRAGRANDE;
		
		System.out.println("--------------------");
		System.out.println("El tamaño: " + pequenno);
		System.out.println("El tamaño: " + media);
		System.out.println("El tamaño: " + grande);
		System.out.println("El tamaño: " + extragrande);

	}
	

}
