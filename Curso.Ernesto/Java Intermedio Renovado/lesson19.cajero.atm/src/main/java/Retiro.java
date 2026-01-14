import java.util.Scanner;

public class Retiro extends Peticiones{


    @Override
    public void RealizarOperacion() {
        System.out.println("Escogiste la opcion 2: Retirar efectivo.");
        System.out.println("¿Cuanto efectivo deseas retirar?");
        efectivo = sc.nextInt();
        setSaldo(getSaldo() - efectivo);
        MostrarSaldo();
    }
}
