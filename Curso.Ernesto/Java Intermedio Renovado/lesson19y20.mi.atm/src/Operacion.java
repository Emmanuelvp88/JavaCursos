public abstract class Operacion {

    // con este objeto instanciamos y modificamosla variable "saldo"
   protected Cajero cajero;

   //constructor con el que recibimos el valor de "saldo"
    public Operacion(Cajero cajero){
        this.cajero = cajero;
    }

    //metodo abstracto con el cual realizamos las operaciones en las clases hijas "Retiro" "Deposito"
    public abstract void ejecutar();

}
