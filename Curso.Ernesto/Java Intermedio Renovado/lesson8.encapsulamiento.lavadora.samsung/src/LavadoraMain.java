import java.util.Scanner;

public class LavadoraMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***************************Bienvenido a la lavanderia de Emmanuel con Java.***********************\n");

//        System.out.println("¿Que desea realizar?\n " +
//                "1.- Lavar\n" +
//                "2.- Enjuagar\n" +
//                "3.- Centrifugar\n" +
//                "4.- Secar");

//        System.out.println("Coloque el numero de la fun cion que desea realizar.");
        System.out.println("Que tipo de ropa deseas lavar\n" +
                "1.- Ropa blanca\n" +
                "2.- Ropa de color\n" +
                "Ingresa el numero de la opcion que deseas realizar.");
        int tipoDeRopa = sc.nextInt();
        System.out.println("cuantos kilos deseas lavar, no debe de exceder de los 12K");
        int kilos = sc.nextInt();

      Funciones mensajero = new Funciones(kilos, tipoDeRopa);

    mensajero.CicloFinalizado();

    }
}
