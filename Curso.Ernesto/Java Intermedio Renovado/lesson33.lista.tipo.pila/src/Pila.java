import javax.swing.JOptionPane;

public class Pila {
    private Nodo top;
    int tamanoPila = 0;
    String lista = "";


    public Pila() {
        top = null;
        tamanoPila = 0;
    }

    //Metodo para verificar si la pila esta vacia
    public boolean pilaVacia() {
        return top == null;
    }

    //Metodo para ingresar un nuevo Nodo
    public void insertarUnNodo(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = top;
        top = nuevo;
        tamanoPila++;
    }

    //Metodo para eliminar un nodo
    public int eliminarNodo() {
        Nodo auxiliar = top;
        top = top.siguiente;
        tamanoPila--;
        return auxiliar.dato;
    }

    //Metodo para mostrar cual es el TOP
    public int mostrarTop() {
        if (pilaVacia()) {
            JOptionPane.showMessageDialog(null, " la pila esta vacia");
        }
        return top.dato;
    }

    //Metodo para conocer el tamaño de la pila
    public int tamanoPila() {
        if (pilaVacia()) {
            JOptionPane.showMessageDialog(null, " la pila esta vacia");
        }
        return tamanoPila;
    }

    //Metodo para Vacia Pila
    public void vaciaPila() {
        while (!pilaVacia()) {
            top = top.siguiente;
        }
        JOptionPane.showMessageDialog(null, " La pila se Vacio correctamente!");

    }

    //Metodo para mostrar el contenido de la Pila
    public void mostrarTodaLaPila() {
        if (!pilaVacia()) {
            Nodo auxiliar = top;
            while (auxiliar != null) {
                lista += auxiliar.dato + "\n";
                auxiliar = auxiliar.siguiente;
            }
        } else {
            JOptionPane.showMessageDialog(null, " la pila esta vacia");
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}



