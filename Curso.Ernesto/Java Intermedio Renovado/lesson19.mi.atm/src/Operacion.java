public abstract class Operacion {

   protected Cajero cajero;

    public Operacion(Cajero cajero){
        this.cajero = cajero;
    }

    public abstract void ejecutar();

}
