package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AsignacionDeRecursoAProyectoSteps {
	
	private Proyecto proyecto;
	private Proyecto proyecto2;
	private RecursoHumano recurso;

    @Dado("^el recurso \"(.*?)\" disponible y un proyecto en progreso$")
    public void el_recurso_disponible_y_un_proyecto_en_progreso(String nombre) throws Throwable {
        recurso = new RecursoHumano(nombre);
        proyecto = new Proyecto();
        proyecto.cambiarEstado(new EnProgreso());
        proyecto.asignar(recurso);
    }

    @Cuando("^lo asigno al proyecto$")
    public void lo_asigno_al_proyecto() throws Throwable {
    	proyecto.asignar(recurso);
    }


    @Entonces("^el recurso queda ligado al proyecto$")
    public void el_recurso_queda_ligado_al_proyecto() throws Throwable {
    	assert(proyecto.validarAsignacion(recurso));
    }

    @Dado("^el recurso \"(.*?)\" disponible y ligado a un proyecto en progreso$")
    public void el_recurso_disponible_y_ligado_a_un_proyecto_en_progreso(String nombre) throws Throwable {
        recurso = new RecursoHumano(nombre);
        proyecto = new Proyecto();
        proyecto.cambiarEstado(new EnProgreso());
        proyecto.asignar(recurso);
	}

    @Cuando("^lo asigno a un nuevo proyecto en progreso$")
    public void lo_asigno_a_un_nuevo_proyecto_en_progreso() throws Throwable {
        proyecto2 = new Proyecto();
        proyecto2.cambiarEstado(new EnProgreso());
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
       assert(!recurso.estaDisponible());
       proyecto = new Proyecto();
       proyecto.cambiarEstado(new EnProgreso());
    }

    @Dado("^el recurso \"(.*?)\" disponible y un proyecto no iniciado$")
    public void el_recurso_disponible_y_un_proyecto_no_iniciado(String nombre) throws Throwable {
        recurso = new RecursoHumano(nombre);
        // el estado de un proyecto nuevo es "NoIniciado" por defecto.
        proyecto = new Proyecto();
    }

    @Entonces("^el recurso no queda ligado al proyecto$")
    public void el_recurso_no_queda_ligado_al_proyecto() throws Throwable {
        assert (!proyecto.validarAsignacion(recurso));
    }
}