package fiuba;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by nicopaez on 5/16/17.
 */
public class DebitoSteps {

    private FachadaBanco fachadaBanco;
    private boolean resultadoExitoso;
    private final String CBU = "38479234879453495872423";

    @Dado("^que mi caja de ahorro tiene un saldo de \"(.*?)\" pesos$")
    public void que_mi_caja_de_ahorro_tiene_un_saldo_de_pesos(int saldoInicial) throws Throwable {
        fachadaBanco = new FachadaBanco();
        fachadaBanco.crearCuenta(CBU, saldoInicial);
    }

    @Cuando("^cuando debito \"(.*?)\" pesos$")
    public void cuando_debito_pesos(int montoADebitar) throws Throwable {
        resultadoExitoso = fachadaBanco.debitar(CBU, montoADebitar);
    }

    @Entonces("^el saldo final es de \"(.*?)\" pesos$")
    public void el_saldo_final_es_de_pesos(int saldoFinal) throws Throwable {
        assertTrue(resultadoExitoso);
        assertEquals(saldoFinal, fachadaBanco.consultarSaldo(CBU));
    }

    @Entonces("^la operacion es rechazada y el saldo final es \"(.*?)\" pesos$")
    public void la_operacion_es_rechazada_y_el_saldo_final_es_pesos(int saldoFinal) throws Throwable {
        assertFalse(resultadoExitoso);
        assertEquals(saldoFinal, fachadaBanco.consultarSaldo(CBU));
    }

}
