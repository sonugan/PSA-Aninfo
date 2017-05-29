package fiuba;
import java.util.ArrayList;

public class Proyecto {
	private ArrayList<RecursoHumano> recursosAsignados;
	
	public Proyecto(){
		recursosAsignados = new ArrayList<RecursoHumano>();
	}
	
	public void asignar(RecursoHumano recurso){
		if(recurso.estaDisponible()){
			recursosAsignados.add(recurso);
		}
	}
	
	public boolean validarAsignacion(RecursoHumano recurso){
		for(int i = 0; i < recursosAsignados.size(); i++){
			if(recursosAsignados.get(i).nombre() == recurso.nombre() ){
				return true;
			}
		}
		return false;
	}
}
