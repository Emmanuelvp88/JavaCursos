import javax.swing.*;

public class Main {

    public static void Main(String[] args) {
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

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;

                }


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        } while (opcion != 4);
    }
}
