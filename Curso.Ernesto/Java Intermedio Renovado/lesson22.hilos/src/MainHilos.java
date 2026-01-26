public class MainHilos {
    static void main() {
        //Con la herencia nadamas creamos un objeto
        Hilo1 hilo1 = new Hilo1();

        //Con "Implements" Tenemos que instanciar un constructor de la clase "Hilo2" dentro del objeto
        Thread thread1 = new Thread(new Hilo2());

        //Se arrancan los objetos de cada clase con el metodo "start()", arrancan los hilos de cada clase
        hilo1.start();
        thread1.start();

    }
}
