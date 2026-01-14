import java.util.Scanner;

public abstract class Peticiones {
    private int saldo = 5000;
    int efectivo;
    static int opcion;
    static Scanner sc = new Scanner(System.in);

    public static void PedirDatos() {
        System.out.println("-------------------------Bienvenido al cajero automatico de Emmanuel---------------------------");
        System.out.println("Que operacion deseas realizar:  \n" +
                "1.- Consulta de saldo.\n" +
                "2.- Restiro de efectivo\n" +
                "3.- Depsosito de efectivo\n" +
                "4.- Salir");
        System.out.println("digite el numero de la operacion que deseas realizar.");
        opcion = sc.nextInt();
    }

    public void MostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }

    public abstract void RealizarOperacion();

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }
}
