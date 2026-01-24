public class Cajero {

    private int saldo;


    public Cajero(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void deposito(int monto) {
        saldo += monto;
    }

    public void retiro(int monto) {
        saldo -= monto;
    }

    public int getSaldo() {
        return saldo;
    }

}
