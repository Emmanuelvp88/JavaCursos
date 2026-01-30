public class EstadoMain {
    public static void main(String[] args) {

        //Primer estado de un hilo es la creacion del hilo
        Proceso hilo1 = new Proceso();
        Proceso hilo2 = new Proceso();


        //Segundo estdo de un hilo e el arranque del hilo
        hilo1.start();

        //el tercer estado de un hilo es cuando lo bloqueamos por un lapso determida, le damos un "Delay"
        try {
            hilo1.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido" + e.getMessage());
        }


        hilo2.start();

        //hilo2.stop(); esta sentencia esta obsoleta, era la manera de matar a un hilo de golpe,
        //por eso java la elimino porque al matarla de golpe no libera recursos, puede corromper datos
        //incluso rompe la sincronizacion


        //con el metodo "sleep()" le damos un Delay al hilo en milisegundos, este metodo
        //es forzoso que este dentro de un "try, catch"
        try {
            hilo2.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Hilo finalizado" + e.getMessage());
        }
    }
}
