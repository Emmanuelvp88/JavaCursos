import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Objeto de tipo "Cajero" que manda el parámetro de la cantidad que va a alojar "saldo inicial"
        Cajero cajero = new Cajero(500);
        int bandera = 0;

        do {
            System.out.println("Bienvenido al cajero");
            System.out.println("1.- Consulta de saldo");
            System.out.println("2.- Restiro de efectivo");
            System.out.println("3.- Desposito de efectivo");
            System.out.println("4.- Salir");
            int opcion = new Scanner(System.in).nextInt();

            //Objeto para iterar con las clases Retiro y Depósito
            Operacion operacion = null;

            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Tu saldo actual es: " + cajero.getSaldo());
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    operacion = new Retiro(cajero);
                    operacion.ejecutar();
                    break;
                case 3:
                    operacion = new Deposito(cajero);
                    operacion.ejecutar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa....");
                    bandera = 2;
                    break;
            }
        } while (bandera != 2);
    }
}
