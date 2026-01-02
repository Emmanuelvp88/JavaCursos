public class Suma {
    //Estas variables sson para alojar los parametros denviados de la clase "SumaMain"
    int Vuno, Vdos, resultado;

    //Este es el constructor que sirve para inicializar el objeto, simpre de llevar el nombre de la clase
    public Suma(int numero1, int numero2){
      this.Vuno = numero1;
      this.Vdos = numero2;

    }

    //Este es un metodo que sirve para el comportamiento del objeto, y este metodo es de realizar una operacion
    public void Operacion(){
     resultado =  Vuno + Vdos;
    }

    //Este metodo lo que hace es imprimir el resultado que realiza el metodo "Operacion()"
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es: " + resultado);
    }

}
