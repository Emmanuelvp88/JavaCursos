//otra forma de instanciar hilos es mediante la implementacion de la interfaz "Runeable"
public class Hilo2  implements Runnable{


    //Este es el metodo "run" de la interface Runnable
    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Hilo 2");
        }
    }
}
