import javax.swing.*;
import java.util.OptionalInt;

public class Cola {
    Nodo inicioCola, finalCola;

    public Cola() {
        this.inicioCola = null;
        this.finalCola = null;
    }


    // Metodo para insertar un Nodo
    public void insertar(int informacion) {
        Nodo nuevoNodo = new Nodo(informacion);

        if (estaVacia()) {
            inicioCola = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }


    // Metodo para validar si la colo esta vacia
    public boolean estaVacia() {
        return finalCola == null;
    }

    // Metodo para extraer un Nodo
    public int extraer() {
        if (estaVacia()) {
            return 0;
        }

        int auxiliar = inicioCola.dato;

        if (inicioCola == finalCola) {
            inicioCola = null;
            finalCola = null;
        } else {
            inicioCola = inicioCola.siguiente;
        }
        return auxiliar;
    }

    // Metodo para mostrar contenido
    public void mostrarContenido(){
        if(estaVacia()){
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
            return;
        }

        Nodo recorrido = inicioCola;
        String contenido = "";

        while(recorrido != null){
            contenido += recorrido.dato + " -> ";
            recorrido = recorrido.siguiente;
        }

        contenido += "null";
        JOptionPane.showMessageDialog(null, contenido);
    }
}
