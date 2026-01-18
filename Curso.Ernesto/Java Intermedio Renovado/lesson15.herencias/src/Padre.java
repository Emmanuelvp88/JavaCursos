import java.util.Scanner;

public class Padre {
    protected int valorUno, valorDos, resultado;

    Scanner sc = new Scanner(System.in);

    //metodo para pedir datos desde teclado.
    public void PedirDatos (){
        System.out.println("Dame el primer valor:");
        valorUno = sc.nextInt();
        System.out.println("dame el segundo valor:");
        valorDos = sc.nextInt();
    }

    //Este metodo se agrego para devolver la variable resultado, logica de Ernesto.
    public void Mresultados(){
        System.out.println(resultado);
    }
}
