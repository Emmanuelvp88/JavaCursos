import java.util.Scanner;

public abstract class Transacciones {
    private static int saldo;
    protected int deposito, retiro, efectivo;
    protected Scanner sc = new Scanner(System.in);
    Transacciones transaccion = null;

        public void PedirDatos () {
            int bandera = 0;
            do {
                System.out.println("-------------------------Bienvenido al cajero automatico de Emmanuel---------------------------");
                System.out.println("Que operacion deseas realizar:  \n" +
                        "1.- Consulta de saldo.\n" +
                        "2.- Retiro de efectivo\n" +
                        "3.- Depsosito de efectivo\n" +
                        "4.- Salir");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        transaccion = new ConsultaSaldo();
                        transaccion.Operacion();
                        break;
                    case 2:
                        transaccion = new Retiro();
                        transaccion.Operacion();
                        break;

                    case 3:
                        transaccion = new Deposito();
                        transaccion.Operacion();
                        break;

                    case 4:
                        System.out.println("Gracias, !Vuleva pronto¡");
                        bandera = 1;
                        break;

                    default:
                        System.out.println("La opcion qu elegiste no esat disponible, !vulve a intentar.¡");

                }
            } while (bandera != 1);

        }

    public abstract void Operacion();

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

}
