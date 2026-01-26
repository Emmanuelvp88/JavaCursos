public class Hilo1 extends Thread {
//Una forma de instanciaar hilos es medianta la herencia

    //este es un metodo de la clase "Thread" del JDK
    @Override
    public void run(){
        for(int i = 0; i < 5; i++){
        System.out.println("Hilo 1");
        }
    }
}
