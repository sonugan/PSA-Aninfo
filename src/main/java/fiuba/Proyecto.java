package fiuba;
import java.util.ArrayList;

public class Proyecto {
	private ArrayList<RecursoHumano> recursosAsignados;
	private ArrayList<Tarea> tareasAsignadas;
	private EstadoDeProyecto estadoDeProyecto;

	public Proyecto(){
		recursosAsignados = new ArrayList<RecursoHumano>();
		tareasAsignadas = new ArrayList<Tarea>();
		estadoDeProyecto = new NoIniciado();
	}

	public void cambiarEstado(EstadoDeProyecto unEstadoDeProyecto){
		this.estadoDeProyecto = unEstadoDeProyecto;
	}

	public void asignar(RecursoHumano recurso){
		if(recurso.estaDisponible() && estadoDeProyecto.enProgreso()){
			recursosAsignados.add(recurso);
		}
	}

	public boolean asignar(Tarea tarea) {

		if(this.estadoDeProyecto.enProgreso()){
			tareasAsignadas.add(tarea);
			return true;
		}
		return false;
	}

	// podria llamarse tieneEstaTarea()
	public boolean validarAsignacion(RecursoHumano recurso){
		for(int i = 0; i < recursosAsignados.size(); i++){
			if(recursosAsignados.get(i).nombre() == recurso.nombre() ){
				return true;
			}
		}
		return false;
	}

	public boolean tieneEstaTarea(Tarea tarea) {
		return tareasAsignadas.contains(tarea);
	}

    public void asignarRecursoATarea(RecursoHumano recurso, Tarea tarea) {

    }

    public boolean asignarEsteRecursoAEstaTarea(RecursoHumano recurso, Tarea tarea) {
		if(!this.tieneEstaTarea(tarea)){
			return false;
		}
		if(!this.validarAsignacion(recurso)){
			return false;
		}
		if(!recurso.estaDisponible()){
			return false;
		}
		recurso.asignarTarea(tarea);
		return true;
	}
}
