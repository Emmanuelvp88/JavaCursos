public class Pila {
    private Nodo top;

    public Pila() {
        top = null;
    }

    // Metodo para insertar en la pila
    public void insertar(char valor){
        Nodo nuevo = new Nodo();
        nuevo.dato = valor;

        if(top == null){
            top = null;
            top = nuevo;

        }else {
            nuevo.siguiente = top;
            top = nuevo;
        }

    }

}
