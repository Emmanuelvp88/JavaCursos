import java.util.Scanner;

public class Deposito extends Peticiones {
    @Override
    public void RealizarOperacion(){

        System.out.println("Escogiste opcion 3: reslizar un  deposito");
        System.out.println("¿que cantidad vas a depositar?");
        efectivo = sc.nextInt();
        setSaldo(getSaldo() + efectivo);
        MostrarSaldo();
    }


}
