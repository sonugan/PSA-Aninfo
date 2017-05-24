package fiuba;

/**
 * Created by nicopaez on 5/16/17.
 */
public class CajaDeAhorro {
    private int saldo;
    private String cbu;

    public CajaDeAhorro(String cbu, int saldoInicial) {
        this.saldo = saldoInicial;
        this.cbu = cbu;
    }

    public void debitar(int montoADebitar) {
        if (montoADebitar > this.saldo) {
            throw new SaldoIsuficienteException();
        }
        this.saldo -= montoADebitar;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getCbu() {
        return this.cbu;
    }
}
