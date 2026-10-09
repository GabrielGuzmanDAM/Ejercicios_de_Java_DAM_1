/*
 * Descripción:
 * Autor: Gabriel Guzmán
 * Fecha: 08/10/2026
 */

/*
 * Una empresa de transporte por carretera ha adquirido vehículos nuevos que viajan más
rápido que los antiguos. Les gustaría conocer cómo afectará esto a la duración de los
viajes. Supóngase que la reducción media que se consigue del tiempo total de viaje es del
15%. 

Escribir un programa en Java que lea el horario de salida y llegada antiguo, calcule el
nuevo horario de llegada y muestre en pantalla el nuevo tiempo de viaje y la nueva hora
de llegada.

Nota: Las horas se dan en el formato hhmm, un entero. Por ejemplo las 11:30, sería el
entero 1130.

 */


package ejercicio18;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner pedido = new Scanner(System.in);
		
		final double REDUCION_VIAJE = 0.15;
		
		LocalTime horaDeSalida;
		
		LocalTime horaDeLlegada;
		
		Duration horaDeViaje;
		
		double hora;	
		
		double reducion;
		
		double horaNueva;
		
		int horaNuevaHora;
		
		double horaNuevaMinutos;
		
		LocalTime horaDeViajeLocalTime;
		
		LocalTime nuevaHoradeLlegada;
		
		System.out.println("--------------------");
		System.out.println("CALCULA LA HORA DE LLEGADA");
		System.out.println("--------------------");
		System.out.print("Dame la hora de salida: ");
		horaDeSalida = pedirLocalTime(pedido);
		
		System.out.print("Dame la hora de llegada: ");
		horaDeLlegada = pedirLocalTime(pedido);
		
		horaDeViaje = Duration.between(horaDeSalida, horaDeLlegada);
		
		System.out.println(horaDeViaje.toHours());
		System.out.println(horaDeViaje.toMinutesPart());
		
		horaDeViajeLocalTime = LocalTime.of((int) Math.abs(horaDeViaje.toHours()), Math.abs(horaDeViaje.toMinutesPart()));
		
		hora = horaDeViajeLocalTime.getHour() + ( horaDeViajeLocalTime.getMinute() / 0.60 );
		
		reducion = hora * REDUCION_VIAJE;
		
		horaNueva = hora - reducion;
		
		horaNuevaHora = (int) horaNueva;
		
		horaNuevaMinutos = (horaNueva - horaNuevaHora) *100;
		
		System.out.println(horaNuevaHora);
		System.out.println(horaNuevaMinutos);
		
		nuevaHoradeLlegada = LocalTime.of((int) horaNuevaHora, (int) horaNuevaMinutos);
		
		System.out.println("--------------------");
		System.out.print("La nueva hora de llegada es: " + nuevaHoradeLlegada);

	}
	
	//pedirDouble: pide un double al usuario, en este caso negamos los negativos (LocalTime)
	public static LocalTime pedirLocalTime(Scanner pedido) {
		
		LocalTime hora = LocalTime.now();
		
		boolean error = false;
		
		do {
			
			try {
				
				hora = LocalTime.parse(pedido.nextLine());
				error = false;
				
			} catch (DateTimeParseException  e) {
				System.out.println("Error: Debe de introducir un numero");
				error = true;
			}
			
		} while (error);
		
		return hora;
	}

}
