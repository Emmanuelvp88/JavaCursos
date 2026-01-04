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

        //obtenemso el metodo setter mediante el objeto instanciado y modificamos el tipo de ropa para que sea 2
        //tipo de ropa a color
        mensajero.setTipoDeRopa(2);

        //este if es solo para validar cuando el usuario escoja tipo1 de ropa "Blanca" se forzara a 2 por el metodo setter que impusimosen la linea anterior
        if (tipoDeRopa == 1) {
            System.out.println("El tipo de ropa cambio a 2, se lavara como ropa de color");
        }
        mensajero.CicloFinalizado();

    }
}
