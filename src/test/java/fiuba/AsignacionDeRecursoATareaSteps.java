package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

/**
 * Created by nicolas on 01/06/17.
 */
public class AsignacionDeRecursoATareaSteps {

    private Proyecto proyecto;
    private RecursoHumano recurso;
    private Tarea tarea;

    @Dado("^el recurso \"(.*?)\" disponible y una tarea \"(.*?)\" ambos asignados a un proyecto en progreso$")
    public void el_recurso_disponible_y_una_tarea_ambos_asignados_a_un_proyecto_en_progreso(String nombreRecurso, String nombreTarea) throws Throwable {
        this.proyecto = new Proyecto();
        this.proyecto.cambiarEstado(new EnProgreso());
        this.tarea = new Tarea(nombreTarea);
        assert this.proyecto.asignar(this.tarea);
        this.recurso = new RecursoHumano(nombreRecurso);
        this.proyecto.asignar(this.recurso);
    }

    @Cuando("^le asigno el recurso a la tarea$")
    public void le_asigno_el_recurso_a_la_tarea() throws Throwable {
        this.proyecto.asignarEsteRecursoAEstaTarea(this.recurso, this.tarea);
    }

    @Entonces("^el recurso efectivamente queda asignado a la tarea$")
    public void el_recurso_efectivamente_queda_asignado_a_la_tarea() throws Throwable {
        assert this.recurso.tieneEstaTarea(this.tarea);
    }

    @Dado("^el recurso \"(.*?)\" de licencia y una tarea \"(.*?)\" ambos asignados a un proyecto en progreso$")
    public void el_recurso_de_licencia_y_una_tarea_ambos_asignados_a_un_proyecto_en_progreso(String nombreRecurso, String nombreTarea) throws Throwable {
        this.proyecto = new Proyecto();
        this.proyecto.cambiarEstado(new EnProgreso());
        this.tarea = new Tarea(nombreTarea);
        this.proyecto.asignar(this.tarea);
        this.recurso = new RecursoHumano(nombreRecurso);
        this.recurso.tomaLicencia();
        // este asignar debe fallar.
        this.proyecto.asignar(this.recurso);
    }

    @Entonces("^la asignacion no se efectua$")
    public void la_asignacion_no_se_efectua() throws Throwable {
        assert !this.recurso.tieneEstaTarea(this.tarea);
    }

}
