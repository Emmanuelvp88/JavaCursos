public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupcion del hilo4 desde la clase" + e.getMessage());
            }
        }
    }
}
