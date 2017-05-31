package fiuba;
import java.util.ArrayList;

public class Proyecto {
	private ArrayList<RecursoHumano> recursosAsignados;
	private ArrayList<Tarea> tareasAsignadas;
	private Estado estado;

	public Proyecto(){
		recursosAsignados = new ArrayList<RecursoHumano>();
		tareasAsignadas = new ArrayList<Tarea>();
		estado = new NoIniciado();
	}

	public void cambiarEstado(Estado unEstado){
		this.estado=unEstado;
	}

	public void asignar(RecursoHumano recurso){
		if(recurso.estaDisponible()){
			recursosAsignados.add(recurso);
		}
	}

	public boolean asignar(Tarea tarea) {

		if(this.estado.enProgreso()){
			tareasAsignadas.add(tarea);
			return true;
		}
		return false;
	}
	
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
}
