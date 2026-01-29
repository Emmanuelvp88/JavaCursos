public class MainHparametros {
    static void main() {

        /*al crear estos objetos mandamos el parametro de tipo "String" el
        cual lo debe de recibirlo un constructor en la clase padre */
        Proceso hilo1 = new Proceso(" hilo1");
        Proceso hilo2 = new Proceso(" hilo2");

        //envio de parametros mediante el metodo "setParametro"
        hilo1.setParametro(3);
        hilo2.setParametro(5);

        //Metodo Start() para arrancar los hilos
        hilo1.start();
        hilo2.start();

    }

}
