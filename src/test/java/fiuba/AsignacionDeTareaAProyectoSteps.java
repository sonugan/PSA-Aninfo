package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.*;


public class AsignacionDeTareaAProyectoSteps {

    private Tarea tarea;
    private Proyecto proyecto;

    @Dado("^una tarea \"(.*?)\" y un proyecto con estado EnProgreso\\.$")
    public void una_tarea_y_un_proyecto_con_estado_EnProgreso(String nombreTarea) throws Throwable {
        this.proyecto = new Proyecto();
        this.proyecto.cambiarEstado(new EnProgreso());
        this.tarea = new Tarea(nombreTarea);
    }

    @Dado("^una tarea \"(.*?)\" y un proyecto con estado Suspendido$")
    public void una_tarea_y_un_proyecto_con_estado_Suspendido(String nombreTarea) throws Throwable {
        this.proyecto = new Proyecto();
        this.proyecto.cambiarEstado(new Suspendido());
        this.tarea = new Tarea(nombreTarea);
    }

    @Dado("^una tarea \"(.*?)\" y un proyecto con estado NoIniciado$")
    public void una_tarea_y_un_proyecto_con_estado_NoIniciado(String nombreTarea) throws Throwable {
        this.proyecto = new Proyecto();
        this.proyecto.cambiarEstado(new NoIniciado());
        this.tarea = new Tarea(nombreTarea);
    }

    @Dado("^una tarea \"(.*?)\" y un proyecto con estado Finalizado$")
    public void una_tarea_y_un_proyecto_con_estado_Finalizado(String nombreTarea) throws Throwable {
        this.proyecto = new Proyecto();
        this.proyecto.cambiarEstado(new Finalizado());
        this.tarea = new Tarea(nombreTarea);
    }

    @Cuando("^asigno la tarea \"(.*?)\" al proyecto$")
    public void asigno_la_tarea_al_proyecto(String nombreTarea) throws Throwable {
        this.proyecto.asignar(this.tarea);
    }

    @Cuando("^asigno la \"(.*?)\" al proyecto$")
    public void asigno_la_al_proyecto(String nombreTarea) throws Throwable {
        this.proyecto.asignar(this.tarea);
    }

    @Entonces("^la tarea queda ligado al proyecto$")
    public void la_tarea_queda_ligado_al_proyecto() throws Throwable {
        assert (this.proyecto.tieneEstaTarea(this.tarea));
    }

    @Entonces("^la tarea no queda ligada al proyecto$")
    public void la_tarea_no_queda_ligada_al_proyecto() throws Throwable {
        assert (!this.proyecto.tieneEstaTarea(this.tarea));
    }
}
