public class Proceso extends Thread {
    int parametro;

    public Proceso(String nombre) {
        super(nombre);
    }

    @Override
    public void run(){
        for(int i = 0; i < parametro; i++){
            System.out.println(i + getName());
        }
        System.out.println("");
    }

    public void setParametro(int parametro){
        this.parametro = parametro;
    }

}
