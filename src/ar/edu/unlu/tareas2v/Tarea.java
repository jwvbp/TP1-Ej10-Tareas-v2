package ar.edu.unlu.tareas2v;

import java.time.LocalDate;

public class Tarea {

	private String descripcion;
	private int prioridad; // 1: Alta 2:Baja
	private String estado;
	private LocalDate fechaLimite;
	private LocalDate fechaRecordatorio;

	public Tarea(String descripcion, int prioridad, String estado, String fechaLimite) {
		super();
		this.descripcion = descripcion;
		this.prioridad = prioridad;
		this.estado = estado;
		this.fechaLimite = LocalDate.parse(fechaLimite);
	}

	public void mostrar(LocalDate hoy) {
		int valor = fechaLimite.compareTo(hoy);
		int valor2 = fechaRecordatorio.compareTo(hoy);
		int valor3 = fechaLimite.compareTo(fechaRecordatorio);
		if ((valor < 0) && estado == "Incompleta") {
			System.out.print("<Vencida> ");
		}
		if ((valor2 > 0) || (valor2 == 0)) {
			System.out.print("<por vencer> ");
		}
		if ((valor3 > 0) || (valor3 == 0)) {
			setPrioridad(1);
		}
		
		
		System.out.println(descripcion + " (prioridad: " + prioridad +")");
	}

	public void agregarRecordatorio(String fechaRecordatorio) {
		this.setFechaRecordatorio(LocalDate.parse(fechaRecordatorio));
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDate getFechaLimite() {
		return fechaLimite;
	}

	private void setFechaRecordatorio(LocalDate fechaRecordatorio) {
		this.fechaRecordatorio = fechaRecordatorio;
	}

	public LocalDate getFechaRecordatorio() {
		return fechaRecordatorio;
	}
}
