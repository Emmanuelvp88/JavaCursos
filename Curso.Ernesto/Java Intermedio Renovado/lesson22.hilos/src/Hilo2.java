public class Hilo2  implements Runnable{
//otra forma de instanciar hilos es mediante la implementacion de la interfaz "Runeable"


    //metodo "run" de la interfaz runeable
    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println("Hilo 2");
        }
    }
}
