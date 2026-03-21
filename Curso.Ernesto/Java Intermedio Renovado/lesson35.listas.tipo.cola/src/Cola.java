public class Cola {
    Nodo inicioCola, finalCola;

    public Cola(){
        this.inicioCola = null;
        this.finalCola = null;
    }


    //metodo para insertar un Nodo
    public void insertar(int informacion){
        Nodo nuevoNodo = new Nodo(informacion);

        if (estaVacia()){
            inicioCola = nuevoNodo;
            finalCola = nuevoNodo;
        }else{
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }


    //metodo para validar si la colo esta vacia
    public boolean estaVacia (){
        return finalCola == null;
    }



}
