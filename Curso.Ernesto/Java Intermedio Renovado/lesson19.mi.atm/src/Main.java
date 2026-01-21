import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Objeto de tipo "Cajero" que manda el parámetro de la cantidad que va a alojar "saldo inicial"
        Cajero cajero = new Cajero(500);

        //variable para romper el siclo del do-while
        int bandera = 0;

        do {
            System.out.println("Bienvenido al cajero");
            System.out.println("1.- Consulta de saldo");
            System.out.println("2.- Restiro de efectivo");
            System.out.println("3.- Desposito de efectivo");
            System.out.println("4.- Salir");
            int opcion = new Scanner(System.in).nextInt();

            /*Objeto para instanciar con las clases Retiro y Depósito, le ponemos el valor  "null"
              para posterior darle el valor de la clase hija con la que queremos instanciar*/
            Operacion operacion = null;

            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Tu saldo actual es: " + cajero.getSaldo());
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
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
