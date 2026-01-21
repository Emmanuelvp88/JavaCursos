import java.util.Scanner;

public class Retiro extends Operacion {

    public Retiro( Cajero cajero) {
        super(cajero);
    }

    @Override
    public void ejecutar(){
        System.out.println("cuanto deseas retirar");
        int monto = new Scanner(System.in).nextInt();
        cajero.retiro(monto);
        System.out.println("---------------------------------------------");
        System.out.println("Tu saldo actual es: " + cajero.getSaldo());
        System.out.println("---------------------------------------------");

    }

}
