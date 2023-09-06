import java.time.LocalDate;
import java.util.ArrayList;

import ar.edu.unlu.tareas2v.Tarea;

public class Main {
	public static LocalDate fechaHoy = LocalDate.parse("2023-08-30");
	 // public static LocalDate hoy = new LocalDate.now();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * public static LocalDate hoy = new LocalDate.now();
		 * 
		 * LocalDate.now() no funciona por eso invente la fecha 2023-08-30
		 *                 como si fuera HOY 
		 */
		ArrayList<Tarea> misTareas = new ArrayList<>();

		Tarea a = new Tarea("Ir al supermercado mañana", 2, "Incompleta", "2023-09-20");
		misTareas.add(a);

		Tarea b = new Tarea("Consultar repuesto del auto", 2, "Completa", "2023-08-29");
		misTareas.add(b);

		Tarea c = new Tarea("Ir al cine a ver la nueva pelicula de Marvel", 2, "Incompleta", "2023-08-29");
		misTareas.add(c);
		
		Tarea d = new Tarea("Suicidio", 2, "Incompleta", "2023-08-30");
		misTareas.add(d);
		
/*
 * Siempre la fechaLimite es mayor que el recordatorio (por algo es un recordatorio)
 * segun el enunciado deberia subir la prioridad, asi que todos suben...
 */

		
		a.agregarRecordatorio("2023-09-18");
		b.agregarRecordatorio("2023-08-20");
		c.agregarRecordatorio("2023-08-20");
		d.agregarRecordatorio("2023-08-30");
		
		int j = 0;
		while (j < misTareas.size()) {
			misTareas.get(j).mostrar(fechaHoy);
			j++;
		}

	}
	

}
