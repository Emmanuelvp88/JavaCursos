
public class MainHilos {
    public static void main(String[] args) {

        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();

        //hilo1
        hilo1.start();
        try{
            hilo1.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Hilo1 interrupted" + e.getMessage());
        }

        //hilo2
        hilo2.start();
        try{
            Hilo2.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Hilo2 interrupted" + e.getMessage());
        }

        //hilo3
        hilo3.start();
        try{
            Hilo3.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Hilo2 interrupted" + e.getMessage());
        }

        //hilo4
        hilo4.start();
        try{
            Hilo4.sleep(100);
        }catch(InterruptedException e){
            System.out.println("Hilo2 interrupted" + e.getMessage());
        }
    }
}
