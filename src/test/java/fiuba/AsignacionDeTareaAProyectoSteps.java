package fiuba;

/**
 * Created by nicolas on 31/05/17.
 */

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.*;


public class AsignacionDeTareaAProyectoSteps {

    private Tarea tarea;
    private Proyecto proyecto;

    @Dado("^una tarea y un proyecto$")
    public void una_tarea_y_un_proyecto() throws Throwable {
        this.proyecto=new Proyecto();
    }

    @Cuando("^asigno la tarea \"(.*?)\" a un proyecto con estado NoIniciado$")
    public void asigno_la_tarea_a_un_proyecto_con_estado_NoIniciado(String nombreTarea) throws Throwable {
        // por defecto el proyecto se crea con estado NoIniciado.
        this.tarea=new Tarea(nombreTarea);
        this.proyecto.asignar(this.tarea);
    }

    @Entonces("^la tarea no queda ligada al proyecto Noiniciado$")
    public void la_tarea_no_queda_ligada_al_proyecto_Noiniciado() throws Throwable {
        assert !this.proyecto.tieneEstaTarea(this.tarea);
    }

    @Cuando("^asigno la tarea \"(.*?)\" a un proyecto con estado EnProgreso$")
    public void asigno_la_tarea_a_un_proyecto_con_estado_EnProgreso(String nombreTarea) throws Throwable {
        this.proyecto.cambiarEstado(new EnProgreso());
        this.tarea = new Tarea(nombreTarea);
        this.proyecto.asignar(this.tarea);
    }

    @Entonces("^la tarea queda ligado al proyecto EnProgreso$")
    public void la_tarea_queda_ligado_al_proyecto_EnProgreso() throws Throwable {
        assert this.proyecto.tieneEstaTarea(this.tarea);
    }

    @Cuando("^asigno la tarea \"(.*?)\" a un proyecto con estado Suspendido$")
    public void asigno_la_tarea_a_un_proyecto_con_estado_Suspendido(String nombreTarea) throws Throwable {
        this.proyecto.cambiarEstado(new Suspendido());
        this.tarea = new Tarea(nombreTarea);
        this.proyecto.asignar(this.tarea);       
    }

    @Entonces("^la tarea no queda ligada al proyecto Supendido$")
    public void la_tarea_no_queda_ligada_al_proyecto_Supendido() throws Throwable {
        assert !this.proyecto.tieneEstaTarea(this.tarea);
    }

    @Cuando("^asigno la \"(.*?)\" a un proyecto con estado Finalizado$")
    public void asigno_la_a_un_proyecto_con_estado_Finalizado(String nombreTarea) throws Throwable {
        this.proyecto.cambiarEstado(new Finalizado());
        this.tarea = new Tarea(nombreTarea);
        this.proyecto.asignar(this.tarea);        
    }

    @Entonces("^la tarea no queda ligada al proyecto Finalizado$")
    public void la_tarea_no_queda_ligada_al_proyecto_Finalizado() throws Throwable {
        assert !this.proyecto.tieneEstaTarea(this.tarea);
    }
}
