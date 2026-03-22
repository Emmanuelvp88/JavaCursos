import javax.swing.*;

public class Main {

    public static void main(String [] args) {
        int opcion = 0;
        int informacion = 0;
        Cola cola = new Cola();

        do {

            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                                + "1. Insertar un nodo\n"
                                + "2. Extraer un nodo\n"
                                + "3. Mostrar contenido de la Cola\n"
                                + "4. Salir.\n\n"));


                switch (opcion) {
                    case 1:
                        informacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un numero para el nodo"));
                        cola.insertar(informacion);
                        break;
                    case 2:
                        if(cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La cola esta vacia");
                        }else{
                            JOptionPane.showMessageDialog(null, "Se a eliminado el nodo: " + cola.extraer());
                        }
                        break;
                    case 3:
                        cola.mostrarContenido();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible..");
                        break;

                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } while (opcion != 4);
    }
}
