//Una forma de crear hilos es instanciar la clase "Thread" para heredar sus metodos
public class Hilo1 extends Thread {

    //este es el metodo "run" de la clase "Thread" del JDK
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
        System.out.println("Hilo 1");
        }
    }
}
