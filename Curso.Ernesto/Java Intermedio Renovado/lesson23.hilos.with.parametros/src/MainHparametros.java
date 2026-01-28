public class MainHparametros {
    static void main() {

        /*al crear estos objetos mandamos el parametro de tipo "String" el
        cual lo debe de recibirlo un constructor en la clase padre */

        Proceso hilo1 = new Proceso(" hilo1");
        Proceso hilo2 = new Proceso(" hilo2");

        hilo1.setParametro(3);
        hilo2.setParametro(5);

        hilo1.start();
        hilo2.start();

    }

}
