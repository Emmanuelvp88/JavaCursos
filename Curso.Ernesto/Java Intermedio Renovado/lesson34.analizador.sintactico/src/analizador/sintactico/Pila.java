package analizador.sintactico;

public class Pila {
    private Nodo top;

    public Pila() {
        top = null;
    }

    // Metodo para insertar en la pila
    public void insertar(char valor) {
        Nodo nuevo = new Nodo();
        nuevo.dato = valor;

        if (top == null) {
            nuevo.siguiente = null;
            top = nuevo;

        } else {
            nuevo.siguiente = top;
            top = nuevo;
        }
    }

    //Metodo para extraer de la pila
    public char extraer() {
        if (top != null) {
            char auxiliar = top.dato;
            top = top.siguiente;
            return auxiliar;
        } else {
            return '\0';
        }
    }

    //Metodo para saber si la pila esta vacia
    public boolean pilaVacia() {
        return top == null;
    }

}
