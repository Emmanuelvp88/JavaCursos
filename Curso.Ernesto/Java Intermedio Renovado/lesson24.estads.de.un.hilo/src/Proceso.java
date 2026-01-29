public class Proceso extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + getName());

            //tambien se puede implementar el tercer entado de un hilo dentro de la clase
            //con
            try {
                Proceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupcion en la clase" + e.getMessage());

            }
        }
    }

}
