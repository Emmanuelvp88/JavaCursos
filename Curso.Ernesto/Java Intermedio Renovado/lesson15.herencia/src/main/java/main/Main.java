package main;
import hijas.Resta;
import hijas.Suma;


public class Main  {
    public static void main(String[] args) {

        //Objeto para instanciar la clase hija Resta.
        Resta resta = new Resta();

        //Logica de Ernesto
        resta.PedirDatos();
        resta.Restar();//metodo que realiza la operacion
        System.out.print("El resultado de tu resta es: " );
        resta.Mresultados();



        //Objeto para instanciar la clase hija Suma.
        Suma suma = new Suma();

        //Mi logica.
        suma.PedirDatos();
        System.out.println("El resultado de tu suma es:" + suma.Sumar());

    }
}
