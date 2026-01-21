import java.util.Scanner;

public class Deposito extends Operacion{

    public Deposito(Cajero cajero){
        super(cajero);
    }

    @Override
    public void ejecutar(){
        System.out.println("cuanto deseas depositar");
        int monto = new Scanner(System.in).nextInt();
        cajero.deposito(monto);
        System.out.println("---------------------------------------------");
        System.out.println("Tu saldo actual es: "  + cajero.getSaldo());
        System.out.println("---------------------------------------------");

    }
}
