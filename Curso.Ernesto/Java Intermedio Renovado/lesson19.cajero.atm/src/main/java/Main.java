public class Main {
    public static void main(String[] args) {
        Peticiones deposito = new Deposito();
        Peticiones retiro = new Retiro();

        Peticiones.PedirDatos();

        switch (Peticiones.opcion){
            case 1:
                System.out.println("Elegiste la opcion 1: mostrar saldo");
                deposito.MostrarSaldo();
                Peticiones.opcion = 0;
                Peticiones.PedirDatos();

            case 2:
                retiro.RealizarOperacion();
                Peticiones.PedirDatos();

            case 3:
                deposito.RealizarOperacion();
                Peticiones.PedirDatos();

            case 4:
                System.out.println("Saliendo del Programa");
                break;

        }
    }
}
