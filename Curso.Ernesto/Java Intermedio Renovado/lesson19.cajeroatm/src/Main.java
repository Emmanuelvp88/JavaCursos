import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int bandera = 0;

//        Transacciones transaccion = null;


//        do {
//            System.out.println("-------------------------Bienvenido al cajero automatico de Emmanuel---------------------------");
//            System.out.println("Que operacion deseas realizar:  \n" +
//                    "1.- Consulta de saldo.\n" +
//                    "2.- Retiro de efectivo\n" +
//                    "3.- Depsosito de efectivo\n" +
//                    "4.- Salir");
//            System.out.println("*********** Digita el numero de la operacion que deseas realizar. ***********");
//            int opcion = sc.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    System.out.println("Elegiste la opcion 1: mostrar saldo");
//                    transaccion = new Deposito();
//                    transaccion.MostrarSaldo();
//                   break;
//                case 2:
//                    transaccion = new Retiro();
//                    transaccion.RealizarOperacion();
//                    break;
//
//                case 3:
//                    transaccion = new Deposito();
//                    transaccion.RealizarOperacion();
//                    break;
//
//                case 4:
//                    System.out.println("Gracias, !Vuleva pronto¡");
//                    bandera = 1;
//                    break;
//
//                default:
//                    System.out.println("La opcion qu elegiste no esat disponible, !vulve a intentar.¡");
//
//            }
//        } while (bandera != 1);

        Transacciones cajero = new Deposito();
        cajero.setSaldo(400);
        cajero.PedirDatos();

    }
}
