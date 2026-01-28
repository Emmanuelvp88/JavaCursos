public class Proceso extends Thread {
    int parametro;

    //Constructor que recibe los parametros de tipo "Strigs"
    public Proceso(String nombre) {
        super(nombre);
    }

    @Override
    public void run(){
        for(int i = 0; i < parametro; i++){

            //recibimos el parametro "nombre" de los objetos
            System.out.println(i + getName());
        }
        System.out.println("");
    }

    public void setParametro(int parametro){
        this.parametro = parametro;
    }

}
