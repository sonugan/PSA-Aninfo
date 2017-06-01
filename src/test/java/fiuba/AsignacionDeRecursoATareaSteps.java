package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

/**
 * Created by nicolas on 01/06/17.
 */
public class AsignacionDeRecursoATarea {
    @Dado("^(\\d+) y (\\d+)$")
    public void y(int arg1, int arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Cuando("^los sumo$")
    public void los_sumo() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //      throw new PendingException();
    }

    @Entonces("^el resultado es (\\d+)$")
    public void el_resultado_es(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //    throw new PendingException();
    }
}
