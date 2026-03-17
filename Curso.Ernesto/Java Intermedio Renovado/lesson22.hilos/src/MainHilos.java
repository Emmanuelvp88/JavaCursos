public class MainHilos {
    public static void main(String [] args) {

        //Con la herencia nadamas creamos un objeto del tipo de la clase
        Hilo1 hilo1 = new Hilo1();

        /*Con "Implements" Tenemos que instanciar el constructor de la clase "Hilo2"
         dentro del objeto del tipo "Thread"  */
        Thread thread2 = new Thread(new Hilo2());

        //Se arrancan los objetos de cada clase con el metodo "start()", arrancan los hilos de cada clase
        hilo1.start();
        thread2.start();

    }
}
