import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un digito");
        int valorUno = sc.nextInt();

        System.out.println("Dame el segundo digito");
        int valorDos = sc.nextInt();

        //Creacion de un objeto de tipo "Suma" y envio de parametros a la clase hija "Suma"
        Suma valores = new Suma(valorUno, valorDos);

        //mando a llamar al metodo "Imprimir()" de la clase hija "suma" mediante el objeto "valores"
        valores.Imprimir();

    }
}
