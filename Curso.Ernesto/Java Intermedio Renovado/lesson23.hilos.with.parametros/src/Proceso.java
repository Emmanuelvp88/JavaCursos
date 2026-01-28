public class Proceso extends Thread {
    int parametro;

    //Constructor que recibe los parametros de tipo "Strigs"
    public Proceso(String nombre) {
        super(nombre);
    }

    //metodo "Run" heredado de la clase "Thread"
    @Override
    public void run(){
        for(int i = 0; i < parametro; i++){

            //recibimos el parametro Strig "nombre" de los objetos y lo mostramos con  "getName()"
            System.out.println(i + getName());
        }
        System.out.println("");
    }

    //Metodo para recibir parametros
    public void setParametro(int parametro){
        this.parametro = parametro;
    }

}
