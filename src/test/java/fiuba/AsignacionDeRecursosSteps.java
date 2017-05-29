package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AsignacionDeRecursosSteps  {
	
	private Proyecto proyecto;
	private Proyecto proyecto2;
	private RecursoHumano recurso;
	

	@Dado("^el recurso \"(.*?)\"$")
	public void un_recurso(String nombre) throws Throwable {
    	recurso = new RecursoHumano(nombre); 
    }

    @Cuando("^lo inspecciono$")
    public void lo_inspecciono() throws Throwable {
    	if (! recurso.estaDisponible()){
    		throw new Exception();
    	}
    }

    @Entonces("^se me informa si esta disponible$")
    public void se_me_informa_si_esta_disponible() throws Throwable {
    	System.out.println("Recurso disponible"); // ver como informar el estado del recurso
    	
    }
    
    @Dado("^el recurso \"(.*?)\" y un proyecto$")
    public void el_recurso_y_un_proyecto(String nombre) throws Throwable {
    	recurso = new RecursoHumano(nombre);
    	proyecto = new Proyecto();
    }

    @Cuando("^lo asigno al proyecto$")
    public void lo_asigno_al_proyecto() throws Throwable {
    	proyecto.asignar(recurso);
    }

    @Entonces("^el recurso queda ligado al proyecto$")
    public void el_recurso_queda_ligado_al_proyecto() throws Throwable {
    	assert(proyecto.validarAsignacion(recurso));
    }

    @Dado("^el recurso \"(.*?)\" ligado a un proyecto$")
    public void el_recurso_ligado_a_un_proyecto(String nombre) throws Throwable {
        recurso = new RecursoHumano(nombre);
        proyecto = new Proyecto();
        proyecto.asignar(recurso);
        proyecto2 = new Proyecto();
    }

    @Cuando("^lo asigno a un nuevo proyecto$")
    public void lo_asigno_a_un_nuevo_proyecto() throws Throwable {
    	proyecto2.asignar(recurso);
    }

    @Entonces("^el recurso queda ligado tambien al nuevo proyecto$")
    public void el_recurso_queda_ligado_tambien_al_nuevo_proyecto() throws Throwable{
    	assert(proyecto.validarAsignacion(recurso) && proyecto2.validarAsignacion(recurso));
    }
    
    @Dado("^el recurso \"(.*?)\" que esta de licencia$")
    public void el_recurso_que_esta_de_licencia(String nombre) throws Throwable {
       recurso = new RecursoHumano(nombre);
       recurso.tomaLicencia();
       proyecto = new Proyecto();
    }

    @Entonces("^el recurso no queda ligado al proyecto$")
    public void el_recurso_no_queda_ligado_al_proyecto() throws Throwable {
    	assert(! proyecto.validarAsignacion(recurso));
    }

}