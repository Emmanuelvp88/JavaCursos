public class Main {
    public static void main(String[] args) {
        /* La herencia de clases y la creacion de los objetos para la instancia entre clases es el punto clave
        en el polimorfismo, ya que dependiendo de la clase que queremos instanciar
        crearemos el objeto EJEMPLO: Primero del tipo de la clase donde se crean y despues del tipo de la clase donde se instancian.
        * */
        Padre suma = new HijaSuma();
        suma.PedirDatos();
        suma.Operacion();
        suma.Resultados();



        Padre resta = new HijaResta();
        resta.PedirDatos();
        resta.Operacion();
        resta.Resultados();

    }
}
