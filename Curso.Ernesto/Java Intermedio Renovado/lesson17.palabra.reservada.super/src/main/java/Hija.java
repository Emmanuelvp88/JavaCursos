public class Hija extends Padre{


    public void Saludar() {

        /*la palabra super sirve para referenciar a los atributos y metodos de la clase padre, como el metodo
          se llama de la misma manera que el metodo de la clase hija, con la palabra super nos damos cuanta que
          estamos haciendo referencia al metodo Saludar() de la clase padre y no al de la clase hija*/
        super.Saludar();
        System.out.println("Soy la clase Hija");
    }
}
