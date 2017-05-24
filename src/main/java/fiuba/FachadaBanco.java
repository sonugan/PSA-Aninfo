package fiuba;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicopaez on 5/16/17.
 */
public class FachadaBanco {

    /* En un proyecto real, en lugar de tener una lista de cuentas, tendria una clase repositorio
    que funcionaria como intermediario con la base de datos */
    List<CajaDeAhorro> cuentas;

    public FachadaBanco() {
        this.cuentas = new ArrayList<CajaDeAhorro>();
    }

    public void crearCuenta(String cbu, int saldoInicial) {
        cuentas.add(new CajaDeAhorro(cbu, saldoInicial));
    }


    public boolean debitar(String cbu, int montoADebitar) {
        CajaDeAhorro cuentaBuscada = null;
        for (CajaDeAhorro cajaDeAhorro: this.cuentas) {
            if (cajaDeAhorro.getCbu() == cbu) {
                cuentaBuscada = cajaDeAhorro;
            }
        }
        try {
            cuentaBuscada.debitar(montoADebitar);
            return true;
        } catch (SaldoIsuficienteException ex) {
            return false;
        }
    }

    public int consultarSaldo(String cbu) {
        CajaDeAhorro cuentaBuscada = null;
        for (CajaDeAhorro cajaDeAhorro: this.cuentas) {
            if (cajaDeAhorro.getCbu() == cbu) {
                cuentaBuscada = cajaDeAhorro;
            }
        }
        return cuentaBuscada.getSaldo();
    }
}
