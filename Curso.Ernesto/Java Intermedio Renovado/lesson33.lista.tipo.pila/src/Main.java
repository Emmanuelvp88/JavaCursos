import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        Pila pila = new Pila();


        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al menu  de opciones\n" +
                    "1 insertar un nodo \n" +
                    "2 eliminar un nodo\n" +
                    "3 ver si pila esta vacia\n" +
                    "4 cual es TOP\n" +
                    "5 cuantos nodos tien la pila\n" +
                    "6 vaciar pila\n" +
                    "7 monstrar contenido de pila\n" +
                    "8 salir \n \n"));
            try {
                switch (opcion) {
                    case 1:
                        pila.insertarUnNodo(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el valor del nodo")));
                        break;

                    case 2:
                        if (pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "Se a eliminado el nodo: " + pila.eliminarNodo());

                        }
                        break;
                    case 3:
                        if (pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                        }
                        break;

                    case 4:
                        if (pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, pila.mostrarTop());

                        }
                        break;
                    case 5:
                        if (pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pial esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pial contiene " + pila.tamanoPila() + " nodos");
                        }
                        break;
                    case 6:
                        if (pila.pilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            pila.vaciaPila();
                        }
                        break;

                    case 7:
                        pila.mostrarTodaLaPila();
                        break;
                    case 8:
                        opcion = 8;
                        break;
                }
            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);
    }
}
