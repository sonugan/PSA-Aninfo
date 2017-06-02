package fiuba;

import java.util.ArrayList;

public class RecursoHumano {
	
	private String nombre;
	private Boolean disponible;
	private ArrayList<Tarea> tareas;
	
	public RecursoHumano(String nombre){
		this.disponible = true;
		this.nombre = nombre;
		this.tareas = new ArrayList<Tarea>();
	} 
	
	public boolean estaDisponible(){
		return this.disponible;
	}
	
	public void tomaLicencia(){
		this.disponible = false;
	}
	
	public String nombre(){
		return this.nombre;
	}

	public void asignarTarea(Tarea tarea) {
		this.tareas.add(tarea);
	}

	public boolean tieneEstaTarea(Tarea tarea){
		return this.tareas.contains(tarea);
	}
}
