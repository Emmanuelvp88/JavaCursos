public class Hilo2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("M");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupcion del hilo2 desde la clase" + e.getMessage());
            }
        }
    }
}
