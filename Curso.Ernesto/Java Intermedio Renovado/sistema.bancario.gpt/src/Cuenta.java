public class Cuenta extends Cliente {

    private int saldo = 500;
    int cuenta1;
    int cuenta2;


    public Cuenta(String cliente1, String cliente2) {
        super(cliente1, cliente2);
    }


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }


}
