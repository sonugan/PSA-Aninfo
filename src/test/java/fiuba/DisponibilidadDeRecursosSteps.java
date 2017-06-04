package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class DisponibilidadDeRecursosSteps {

    private RecursoHumano recurso;

    @Dado("^el recurso \"(.*?)\" esta disponible$")
    public void el_recurso_esta_disponible(String nombre) throws Throwable {
        recurso = new RecursoHumano(nombre);
    }

    @Cuando("^lo inspecciono$")
    public void lo_inspecciono() throws Throwable {
    }

    @Entonces("^se me informa que esta disponible$")
    public void se_me_informa_que_esta_disponible() throws Throwable {
        //System.out.println("Recurso disponible"); // ver como informar el estado del recurso
        assert recurso.estaDisponible();
    }

    @Dado("^el recurso \"(.*?)\" esta licencia$")
    public void el_recurso_esta_licencia(String nombre) throws Throwable {
        recurso = new RecursoHumano(nombre);
        recurso.tomaLicencia();
    }

    @Entonces("^se me informa que no esta disponible$")
    public void se_me_informa_que_no_esta_disponible() throws Throwable {
        assert (! recurso.estaDisponible());
    }

}
